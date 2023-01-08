package excercise1_2;

public class Circle {
    private double radius;

    public Circle() {
        radius = 1.2;
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}