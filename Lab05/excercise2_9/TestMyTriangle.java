package excercise2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(-1, 3);
        MyPoint point2 = new MyPoint(5, 4);
        MyPoint point3 = new MyPoint(10, 7);
        MyTriangle triangle1 = new MyTriangle(11, 6, 4, 4, 1, 2);
        MyTriangle triangle2 = new MyTriangle(point1, point2, point3);
        System.out.println(triangle1);
        System.out.println("The perimeter of triangle 2 is: " + triangle2.getPerimeter());
        System.out.println("The type of triangle 1 is: " + triangle1.getType());
    }
}
