package Lab5;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Radius : " + cylinder.getRadius()
                + "Height : " + cylinder.getHeight()
                + "Color : " + cylinder.getColor()
                + "Volume : " + cylinder.getVolume()
                + "Base Area : " + cylinder.getArea()
        );

        Cylinder cylinder1 = new Cylinder(5, 2);
        System.out.println(
                "Radius : " + cylinder1.getRadius()
                + "Height : " + cylinder1.getHeight()
                + "Color : " + cylinder1.getColor()
                + "Volume : " + cylinder1.getVolume()
                + "Base Area : " + cylinder1.getArea()
        );
    }
}
