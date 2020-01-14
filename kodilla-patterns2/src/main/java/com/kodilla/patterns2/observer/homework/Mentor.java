package com.kodilla.patterns2.observer.homework;

public class Mentor implements Follower {

    private final String name;
    private int updateTasksCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(name + ": New task is available to check in: " + studentTasks.getStudentName() + " account");
        updateTasksCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateTasksCount() {
        return updateTasksCount;
    }
}
