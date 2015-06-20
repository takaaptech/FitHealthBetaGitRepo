package com.eugene.fithealthmaingit.Databases_Adapters_ListViews.LogFood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.eugene.fithealthmaingit.R;

import java.util.List;

public class LogAdapterMealRecipe extends ArrayAdapter<LogMeal> {
    Context mContext;
    public static List<LogMeal> mLogs;

    public LogAdapterMealRecipe(Context context, int textViewResourceId, List<LogMeal> logs) {
        super(context, textViewResourceId);
        mContext = context;
        mLogs = logs;
    }

    public void setLogs(List<LogMeal> logs) {
        mLogs = logs;
    }

    public List<LogMeal> getLogs() {
        return mLogs;
    }

    public void add(LogMeal log) {
        mLogs.add(log);
    }

    public void remove(LogMeal log) {
        LogAdapterAll.mLogs.remove(log);
    }

    public int getCount() {
        return mLogs.size();
    }

    public LogMeal getItem(int position) {
        return mLogs.get(position);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_recipe_row, null, true);

        TextView mealNameManual = (TextView) view.findViewById(R.id.mealNameManual);
        mealNameManual.setText(mLogs.get(position).getMealName());
        return view;
    }
}
