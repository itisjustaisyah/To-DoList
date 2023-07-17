package com.myapplicationdev.android.to_dolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by Nuur Aisyah Binte Farouk on 17/7/2023.
 * C346-1D-E63A-A
 */
public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> versionsList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        versionsList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Obtain LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //"Inflate" the view for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtain Ui components and do necessary binding
        TextView tvTask = rowView.findViewById(R.id.tvTask);
        TextView TvDate = rowView.findViewById(R.id.tvDate);


        //Obtain the andorid version information based on positon
        ToDoItem task = versionsList.get((position));

        //Set values to textview to display the corresponging information

        tvTask.setText(task.getTitle());
        TvDate.setText(task.toString());

        return rowView;
    }
}
