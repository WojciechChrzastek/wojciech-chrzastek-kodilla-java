package com.kodilla.good.patterns.challenges.food2door;

public class User {
    public String realName;
    public String username;

    public User(String realName, String username) {
        this.realName = realName;
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public String getUsername() {
        return username;
    }
}
