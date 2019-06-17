package com.kodilla.testing.forum.statistics;

public class AdvStatistics {

    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double avPostsPerUser;
    double avCommentsPerUser;
    double avCommentsPerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public double getAvCommentsPerUser() {
        return avCommentsPerUser;
    }

    public double getAvCommentsPerPost() {
        return avCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();

        postsQuantity = statistics.postsCount();

        commentsQuantity = statistics.commentsCount();

        if (statistics.usersNames().size() == 0) {
            avPostsPerUser = 0.0;
        } else {
            avPostsPerUser = (double)statistics.postsCount() / (double)statistics.usersNames().size();
        }

        if (statistics.usersNames().size() == 0) {
            avCommentsPerUser = 0.0;
        } else {
            avCommentsPerUser = (double)statistics.commentsCount() / (double)statistics.usersNames().size();
        }

        if (statistics.postsCount() == 0) {
            avCommentsPerPost = 0.0;
        } else {
            avCommentsPerPost = (double)statistics.commentsCount() / (double)statistics.postsCount();
        }
    }

    public void showStatistics() {
        System.out.println("Number of users = " + usersQuantity);
        System.out.println("Number of posts = " + postsQuantity);
        System.out.println("Number of comments = " + commentsQuantity);
        System.out.println("Average number of posts per user = " + avPostsPerUser);
        System.out.println("Average number of comments per user = " + avCommentsPerUser);
        System.out.println("Average number of comments per post = " + avCommentsPerPost);
    }


}
