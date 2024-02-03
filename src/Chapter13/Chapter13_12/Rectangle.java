package Chapter13.Chapter13_12;

import java.util.*;

public class Rectangle extends GeometricObject {

    private double length;
    private double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
