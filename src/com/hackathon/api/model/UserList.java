package com.hackathon.api.model;

import java.util.ArrayList;

public class UserList extends ArrayList<User> {


    public User getUserByEmail(String email) {

        for (User user : this) {
            if (user.getUsername().equals(email)) {
                return user;
            }
        }
        return null;
    }


    public static UserList createUsers(){
        UserList users = new UserList();

        User user1 = new User("mansur@test.test","mansur");
        user1.setName("Mansur");
        user1.setSurname("Betrakhmadov");
        user1.addLanguage(new Language("English","Advanced"));
        user1.addLanguage(new Language("Turkish","Advanced"));
        user1.addWorkingDays(new Day("Mon","9:00 AM","12:00 PM"));
        user1.addWorkingDays(new Day("Tue","1:00 PM","3:00 PM"));
        user1.addRating(3.54);
        user1.setHoursWorked(10.5);
        user1.setMoneyEarned(1000.4);
        users.add(user1);


        return  users;
    }

}
