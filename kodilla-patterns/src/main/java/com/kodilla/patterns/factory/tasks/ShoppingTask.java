package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean isDone;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity, boolean isDone) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isDone = isDone;
    }

    @Override
    public void executeTask() {
        if (isDone == true) {
            System.out.println("Shopping task is done!");
        } else {
            System.out.println("Executing shopping task...");
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
