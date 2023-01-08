package excercise2_8;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(); //Default constructor
        MyCircle circle2 = new MyCircle(2, 3, 2);
        MyPoint point0 = new MyPoint(4,5);
        MyPoint point1 = new MyPoint(-2, 5);
        MyCircle circle3 = new MyCircle(point0, 3);
        System.out.println("Circle 3 has the radius of " + circle3.getRadius());
        circle1.setRadius(4);
        System.out.println(circle1);
        System.out.println("The center of circle 2 is: " + circle2.getCenter().toString());
        circle1.setCenter(point1);
        System.out.println(circle1);
        System.out.println("The circle 1's center is at: X = " + circle1.getCenterX() + ", Y = " + circle1.getCenterY());
        System.out.println("The circle 2's center is at: X = " + circle2.getCenterXY()[0] + ", Y = " + circle2.getCenterXY()[1]);
        circle3.setCenterX(-3);
        circle3.setCenterY(-5);
        System.out.println(circle3);
        circle2.setCenterXY(4,-5);
        System.out.println(circle2);
        System.out.println("The area of circle 1 is: " + circle1.getArea());
        System.out.println("The circumference of circle 3 is: " + circle3.getCircumference());
        System.out.println("The distance between the 2 centers of circle 1 and circle 3 is: " + circle1.distance(circle3));
    }
}
