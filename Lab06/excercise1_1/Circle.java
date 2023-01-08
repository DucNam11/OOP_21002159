package excercise1_1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}