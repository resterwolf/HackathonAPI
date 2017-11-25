package com.hackathon.api.model;

public class Day {

    private String name;
    private String timeFrom;
    private String timeTo;

    public Day(String name, String timeFrom, String timeTo) {
        this.name = name;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public String getName() {
        return name;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }
}
