package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

       /*public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";*/

    public final Task createTask(final TaskType /*String*/ taskClass) {
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
