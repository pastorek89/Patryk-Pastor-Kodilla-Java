package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> result = tester.exterminate(emptyList);
        System.out.println("Testing empty list!");
        //Then
        Assert.assertEquals(emptyList,result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> oddPlusEvenList = new ArrayList<>();
        for (int i = 1; i == 100; i++) {
            oddPlusEvenList.add(i);
        }
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i = 1; i == 100; i++) {
            if (i % 2 == 0)
                expected.add(i);
        }
        //When
        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer> result = tester.exterminate(oddPlusEvenList);
        System.out.println("Testing list with odd + even Integers");
        //Then
        Assert.assertEquals(expected,result);
    }
}
