package Lab5;

public class Circle { // Save as "Circle.java"
    // Private variables
    private final double radius;
    private final String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 1st Constructor
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    // 2nd Constructor
    public Circle(double r, String c) { // 3rd Constructor
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
