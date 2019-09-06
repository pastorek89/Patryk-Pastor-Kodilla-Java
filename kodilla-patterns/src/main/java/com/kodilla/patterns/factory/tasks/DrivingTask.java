package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;
    boolean isDone;

    public DrivingTask(final String taskName, final String where, final String using, boolean isDone) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isDone = isDone;
    }

    @Override
    public void executeTask() {
        if (isDone == true) {
            System.out.println("Driving task is done!");
        } else {
            System.out.println("Executing driving task...");
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
