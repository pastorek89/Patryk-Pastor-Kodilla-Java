package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        StudentTasks patrykPastor = new StudentTasks("Patryk Pastor");
        StudentTasks maciejZawada = new StudentTasks("Maciej Zawada");
        StudentTasks elzaPastor = new StudentTasks("Elza Pastor");
        Mentor michalLangner = new Mentor("Michał Langner");
        Mentor pawelPluta = new Mentor("Paweł Pluta");
        patrykPastor.registerFollower(michalLangner);
        patrykPastor.registerFollower(pawelPluta);
        maciejZawada.registerFollower(michalLangner);
        elzaPastor.registerFollower(pawelPluta);
        //When
        patrykPastor.addTask("Task 1");
        patrykPastor.addTask("Task 2");
        patrykPastor.addTask("Task 3");
        maciejZawada.addTask("Task 1");
        maciejZawada.addTask("Task 2");
        elzaPastor.addTask("Task 1");
        //Then
        Assert.assertEquals(5, michalLangner.getUpdateTasksCount());
        Assert.assertEquals(4, pawelPluta.getUpdateTasksCount());
    }
}
