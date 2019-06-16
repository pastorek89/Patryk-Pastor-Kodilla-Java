package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = tester.exterminate(emptyList);
        System.out.println("Testing empty list!");
        //Then
        Assert.assertEquals(emptyList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> oddPlusEvenList = new ArrayList<>();
        oddPlusEvenList.add(1);
        oddPlusEvenList.add(6);
        oddPlusEvenList.add(19);
        oddPlusEvenList.add(7);
        oddPlusEvenList.add(2);

        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(2);

        //When
        OddNumbersExterminator tester = new OddNumbersExterminator();
        List<Integer> result = tester.exterminate(oddPlusEvenList);
        System.out.println("Testing list with odd + even Integers");
        //Then
        Assert.assertEquals(expected, result);
    }
}
