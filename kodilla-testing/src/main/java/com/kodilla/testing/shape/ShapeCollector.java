package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }
    public void getFigure(int n) {
        shapes.get(n);
    }
    public void showFigures() {
        for(Shape figures : shapes) {
            String figure = figures.getShapeName();
            System.out.println(figure);
        }
    }
}
