package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Groceries", shoppingTask.getTaskName());
        Assert.assertEquals(false, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Room painting", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Ride", drivingTask.getTaskName());
        Assert.assertEquals(false, drivingTask.isTaskExecuted());
    }
}
