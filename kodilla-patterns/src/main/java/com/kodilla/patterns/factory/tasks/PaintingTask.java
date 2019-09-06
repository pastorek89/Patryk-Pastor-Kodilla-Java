package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isDone;

    public PaintingTask(final String taskName, final String color, final String whatToPaint, boolean isDone) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isDone = isDone;
    }

    @Override
    public void executeTask() {
        if (isDone == true) {
            System.out.println("Painting task is done!");
        } else {
            System.out.println("Executing painting task...");
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
