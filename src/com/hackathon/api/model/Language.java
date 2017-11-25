package com.hackathon.api.model;

public class Language {
    private String title;
    private String proficiency;

    public Language(String title, String proficiency) {
        this.title = title;
        this.proficiency = proficiency;
    }


    public String getTitle() {
        return title;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
}
