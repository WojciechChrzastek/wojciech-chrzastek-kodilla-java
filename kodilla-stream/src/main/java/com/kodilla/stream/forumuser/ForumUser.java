package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex; //tylko wartości ‘M’/’F’?
    private final LocalDate userDateOfBirth;
    private final int userPostsCount;

    public ForumUser(int userId, String userName, char userSex, LocalDate userDateOfBirth, int userPostsCount) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = userDateOfBirth;
        this.userPostsCount = userPostsCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getUserPostsCount() {
        return userPostsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userDateOfBirth=" + userDateOfBirth +
                ", userPostsCount=" + userPostsCount +
                '}';
    }
}
