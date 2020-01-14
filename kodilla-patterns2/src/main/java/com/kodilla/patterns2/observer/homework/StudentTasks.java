package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements Followable {

    private final String studentName;
    private final List<Follower> followers;
    private final ArrayDeque<String> tasks;

    public StudentTasks(String studentName) {
        followers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyFollowers();
    }

    @Override
    public void registerFollower(Follower follower) {
        followers.add(follower);
    }

    @Override
    public void removeFollower(Follower follower) {
        followers.remove(follower);
    }

    @Override
    public void notifyFollowers() {
        for (Follower follower : followers) {
            follower.update(this);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }
}
