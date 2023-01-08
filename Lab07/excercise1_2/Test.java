package excercise1_2;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(3.0, 4.0);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
