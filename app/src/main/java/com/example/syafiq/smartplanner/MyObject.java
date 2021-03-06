package com.example.syafiq.smartplanner;
//Created by syafiq on 4/1/2017.

import java.util.Date;

public class MyObject implements Comparable<MyObject> {

    private Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date datetime) {
        this.dateTime = datetime;
    }

    @Override
    public int compareTo(MyObject o) {
        if (getDateTime() == null || o.getDateTime() == null)
            return 0;
        return getDateTime().compareTo(o.getDateTime());
    }
}