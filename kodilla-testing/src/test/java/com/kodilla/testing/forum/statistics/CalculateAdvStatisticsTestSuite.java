package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsNumberOfPostsEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Patryk Pastor");
        usersList.add("Karolina Pastor");
        usersList.add("Adrian Fatyga");
        usersList.add("Tomasz Grzesiak");
        usersList.add("Piotr Drews");
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0,advStatistics.getAvCommentsPerPost(),0.01);
        assertEquals(0,advStatistics.getAvPostsPerUser(),0.01);
        assertEquals(100,advStatistics.getAvCommentsPerUser(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsNumberOfPostsThousend() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Patryk Pastor");
        usersList.add("Karolina Pastor");
        usersList.add("Adrian Fatyga");
        usersList.add("Tomasz Grzesiak");
        usersList.add("Piotr Drews");
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.5,advStatistics.getAvCommentsPerPost(),0.01);
        assertEquals(200,advStatistics.getAvPostsPerUser(),0.01);
        assertEquals(100,advStatistics.getAvCommentsPerUser(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsNumberOfCommentsEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Patryk Pastor");
        usersList.add("Karolina Pastor");
        usersList.add("Adrian Fatyga");
        usersList.add("Tomasz Grzesiak");
        usersList.add("Piotr Drews");
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0,advStatistics.getAvCommentsPerUser(),0.01);
        assertEquals(0,advStatistics.getAvCommentsPerPost(),0.01);
        assertEquals(20,advStatistics.getAvPostsPerUser(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsNumberOfCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Patryk Pastor");
        usersList.add("Karolina Pastor");
        usersList.add("Adrian Fatyga");
        usersList.add("Tomasz Grzesiak");
        usersList.add("Piotr Drews");
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.5,advStatistics.getAvCommentsPerPost(),0.01);
        assertEquals(10,advStatistics.getAvCommentsPerUser(),0.01);
        assertEquals(20,advStatistics.getAvPostsPerUser(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsNumberOfCommentsGraterThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Patryk Pastor");
        usersList.add("Karolina Pastor");
        usersList.add("Adrian Fatyga");
        usersList.add("Tomasz Grzesiak");
        usersList.add("Piotr Drews");
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(2,advStatistics.getAvCommentsPerPost(),0.01);
        assertEquals(20,advStatistics.getAvCommentsPerUser(),0.01);
        assertEquals(10,advStatistics.getAvPostsPerUser(),0.01);
    }
    @Test
    public void testCalcelateAdvStatisticsNumberOfUsersEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(2,advStatistics.getAvCommentsPerPost(),0.01);
        assertEquals(0,advStatistics.getAvCommentsPerUser(),0.01);
        assertEquals(0,advStatistics.getAvPostsPerUser(),0.01);
    }
    @Test
    public void testCalculateAdvStatisticsNumberOfUsersHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("Name" + i);
        }
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10,advStatistics.getAvCommentsPerPost(),0.01);
        assertEquals(2,advStatistics.getAvCommentsPerUser(),0.01);
        assertEquals(0.2,advStatistics.getAvPostsPerUser(),0.01);
    }
}
