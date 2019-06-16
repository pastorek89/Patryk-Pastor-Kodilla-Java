package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beggining of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeTest() {
        testCounter++;
        System.out.println("Test nr " + testCounter + " starting");
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Circle(4);
        List<Shape> shapes = new ArrayList<>();
        //When
        shapes.add(shape);
        //Then
        Assert.assertEquals(1, shapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Square(3.5);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape);

        //When
        boolean result = shapes.remove(shape);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape shape = new Triangle(1, 4.5);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape);

        //When
        Shape result = shapes.get(0);

        //Then
        Assert.assertEquals(shape, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape shape = new Triangle(1, 4.5);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape);

        //When
        String tester = shape.getShapeName();

        //Then
        Assert.assertEquals("Triangle", tester);

    }

    @Test
    public void testGetFieldTriangle() {
        //Given
        Triangle triangle = new Triangle(2.0, 4.0);

        //When
        double result = triangle.getField();

        //Then
        Assert.assertEquals(4.0,result,0.01);
    }

    @Test
    public void testGetFieldSquare() {
        //Given
        Square square = new Square(4.0);

        //When
        double result = square.getField();

        //Then
        Assert.assertEquals(16.0,result,0.01);
    }

    @Test
    public void testGetFieldCircle() {
        //Given
        Circle circle = new Circle(2.0);

        //When
        double result = circle.getField();

        //Then
        Assert.assertEquals(12.56, result, 0.01);
    }

}
