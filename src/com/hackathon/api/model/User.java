package com.hackathon.api.model;

import java.util.ArrayList;

public class User {

    private String username;
    private  String password;

    private String name = new String();
    private String surname = new String();;
    private String languageOne = new String();;
    private String languageTwo = new String();;
    private ArrayList<Day> workingDays = new ArrayList<>();
    private double rating = 0;
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

    public String getLanguageOne() {
        return languageOne;
    }

    public void setLanguageOne(String languageOne) {
        this.languageOne = languageOne;
    }

    public String getLanguageTwo() {
        return languageTwo;
    }

    public void setLanguageTwo(String languageTwo) {
        this.languageTwo = languageTwo;
    }

    public ArrayList<Day> getWorkingDays() {
        return workingDays;
    }

    public void addWorkingDays(Day day) {
        this.workingDays.add(day);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
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