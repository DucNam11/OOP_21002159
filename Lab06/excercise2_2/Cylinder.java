package excercise2_2;

public class Cylinder {
    private final Circle base;
    private final double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 2 * base.getArea() + 2 * Math.PI * base.getRadius() * height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public String toString() {
        return "Cylinder: compose of " + base.toString() + "height= " + height;
    }
}