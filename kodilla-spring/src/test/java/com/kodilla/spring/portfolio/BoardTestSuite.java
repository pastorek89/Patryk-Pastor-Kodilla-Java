package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {

    @Test
    public void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        System.out.println(board);
        //When
        board.getInProgressList().tasks.add("TaskInProgress");
        board.getDoneList().tasks.add("TaskDone");
        board.getToDoList().tasks.add("TaskToDo");

        //Then
        System.out.println(board.getInProgressList().tasks.get(0));
        System.out.println(board.getDoneList().tasks.get(0));
        System.out.println(board.getToDoList().tasks.get(0));

    }
}


