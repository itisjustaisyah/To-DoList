package com.myapplicationdev.android.to_dolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    ListView lvTODO;
    ArrayList<ToDoItem> alTODO;
    CustomAdapter aaTODO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTODO = findViewById(R.id.todoLV);
        alTODO = new ArrayList<>();
        aaTODO = new CustomAdapter(this, R.layout.row, alTODO);

        Calendar calendar1 = Calendar.getInstance();

        calendar1.set(Calendar.MONTH, 8);
        calendar1.set(Calendar.YEAR, 2020);
        calendar1.set(Calendar.DATE, 1);
        Log.i("Date 1", "Date: " + calendar1.getTime());
        ToDoItem item1 = new ToDoItem("Go for movie", calendar1);
        alTODO.add(item1);


        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.MONTH, 8);
        calendar2.set(Calendar.YEAR, 2020);
        calendar2.set(Calendar.DATE, 2);
        Log.i("Date 2", "Date: " + calendar1.getTime());

        ToDoItem item2 = new ToDoItem("Go for haircut", calendar2);
        alTODO.add(item2);

        Log.i("ArrayList", alTODO.toString());

        lvTODO.setAdapter(aaTODO);
    }
}