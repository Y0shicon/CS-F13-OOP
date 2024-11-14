package Lab5;

public class Cylinder extends Circle {
    private double height;

    Cylinder(){
        super();
        this.height = 1f;
    }

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}
