package com.hackathon.api.model;

public enum Errors {

    EmailIParamsNotExist (1, "Email param does not exist."),
    PasswordParamIsNotExist (2, "Password param does not exist."),
    UserIsNotFound (3, "User is not found."),
    PasswordIsIncorrect (4, "Password is incorrect");

    private int id;
    private String message;

    Errors(int id, String message){
        this.id = id;
        this.message = message;
    }

    public int getErrorId(){
        return this.id;
    }

    public String getErrorMessage(){
        return this.message;
    }

}
