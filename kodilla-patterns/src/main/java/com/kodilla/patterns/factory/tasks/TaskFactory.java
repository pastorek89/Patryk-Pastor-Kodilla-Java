package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final AdditionalTask SHOPPING_TASK = AdditionalTask.SHOPPING_TASK;
    public static final AdditionalTask PAINTING_TASK = AdditionalTask.PAINTING_TASK;
    public static final AdditionalTask DRIVING_TASK = AdditionalTask.DRIVING_TASK;
    /*public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";*/

    public final Task createTask(final AdditionalTask /*String*/ taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Groceries", "Carrots", 5.0, false);
            case PAINTING_TASK:
                return new PaintingTask("Room painting", "White", "Living room", true);
            case DRIVING_TASK:
                return new DrivingTask("Ride", "Sea", "Car", false);
            default:
                return null;

        }
    }

}
