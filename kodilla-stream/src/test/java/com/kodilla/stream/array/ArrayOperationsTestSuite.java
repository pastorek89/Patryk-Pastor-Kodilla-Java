package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {10,20,30,40,50,60,70,80,90,100,10,20,30,40,50,60,70,80,90,0};
        double expected = 50.0;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(expected,average,0.00001);


    }
}
