package com.kodilla.testing.forum.statistics;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StatisticsCalculator {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostCountPerUser;
    private double avgCommentCountPerUser;
    private double avgCommentCountPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if (userCount != 0 && postCount != 0) {
            avgPostCountPerUser = postCount / userCount;
        } else {
            avgPostCountPerUser = 0;
        }

        if (userCount != 0 && commentCount != 0) {
            avgCommentCountPerUser = commentCount / userCount;
        } else {
            avgCommentCountPerUser = 0;
        }

        if (commentCount != 0 && postCount != 0) {
            avgCommentCountPerPost = commentCount / postCount;
        } else {
            avgCommentCountPerPost = 0;
        }
    }

    public void showStatistics() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Statistics:\n"
                + "User count = " + userCount + "\n"
                + "Post count = " + postCount + "\n"
                + "Comment count = " + commentCount + "\n"
                + "Average post count per user = " + formatter.format(avgPostCountPerUser) + "\n"
                + "Average comment count per user = " + formatter.format(avgCommentCountPerUser) + "\n"
                + "Average comment count per post = " + formatter.format(avgCommentCountPerPost));
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostCountPerUser() {
        return avgPostCountPerUser;
    }

    public double getAvgCommentCountPerUser() {
        return avgCommentCountPerUser;
    }

    public double getAvgCommentCountPerPost() {
        return avgCommentCountPerPost;
    }
}
