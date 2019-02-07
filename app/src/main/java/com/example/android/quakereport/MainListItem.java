package com.example.android.quakereport;

public class MainListItem {
    private String location, magnitude, date;
    MainListItem(String location, String magnitude, String date){
        this.location = location;
        this.magnitude = magnitude;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
