package com.hackathon.api.model;


public class UsersHolder {

    private static UserList users = UserList.createUsers();


    public static UserList getUsers() {
        return users;
    }

    public static void addUser(User user) {
        users.add(user);
    }

}
