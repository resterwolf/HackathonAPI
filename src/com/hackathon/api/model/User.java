package com.hackathon.api.model;

import java.util.ArrayList;

public class User {

    private String username;
    private  String password;

    private String name = new String();
    private String surname = new String();
    private ArrayList<Language> languages = new ArrayList<>();
    private ArrayList<Day> workingDays = new ArrayList<>();
    private ArrayList<Double> ratings = new ArrayList<>();
    private double hoursWorked = 0;
    private double moneyEarned = 0;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Language> getLanguages() {
        return languages;
    }

    public void addLanguage(Language language) {
        this.languages.add(language);
    }


    public ArrayList<Day> getWorkingDays() {
        return workingDays;
    }

    public void addWorkingDays(Day day) {
        this.workingDays.add(day);
    }

    public double getRating() {
        double averageRating = 0;

        if (!ratings.isEmpty()) {

            for (Double rating : ratings) {
                averageRating += rating;
            }

            averageRating = averageRating / ratings.size();
        }

        return averageRating;
    }

    public void addRating(Double rating) {
        this.ratings.add(rating) ;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }


}
