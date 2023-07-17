package com.myapplicationdev.android.to_dolist;
import java.util.Calendar;
/**
 * Created by Nuur Aisyah Binte Farouk on 17/7/2023.
 * C346-1D-E63A-A
 */
public class ToDoItem {
    String title;
    Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    private String getDay(int day) {
        String str = "";
        switch (day){
            case 1:
                str = "Monday";
                break;
            case 2:
                str = "Tuesday";
                break;
            case 3:
                str = "Wednesday";
                break;
            case 4:
                str = "Thursday";
                break;
            case 5:
                str = "Friday";
                break;
            case 6:
                str = "Saturday";
                break;
            case 7:
                str = "sunday";
                break;
        }
        return str;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

}
