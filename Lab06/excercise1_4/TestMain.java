package excercise1_4;

public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("area is: " + c1.getArea());
        System.out.println("perimeter is: " + c1.getPerimeter());
        c1.setRadius(2.0);
        System.out.println(c1);
        System.out.println("area is: " + c1.getArea());
        System.out.println("perimeter is: " + c1.getPerimeter());

        Circle c2 = new Circle(3.0);
        System.out.println(c2);
        System.out.println("area is: " + c2.getArea());
        System.out.println("perimeter is: " + c2.getPerimeter());

        Circle c3 = new Circle("white", true, 2.0);
        System.out.println(c3);
        System.out.println("area is: " + c3.getArea());
        System.out.println("perimeter is: " + c3.getPerimeter());


        Rectangle r1 = new Rectangle(2.0, 3.0);
        System.out.println(r1);
        System.out.println("area is: " + r1.getArea());
        System.out.println("perimeter is: " + r1.getPerimeter());

        Square s1 = new Square(4);
        System.out.println(s1);
        System.out.println("area is: " + s1.getArea());
        System.out.println("perimeter is: " + s1.getPerimeter());

        Square s2 = new Square("brown", false, 3);
        System.out.println(s2);
        System.out.println("area is: " + s2.getArea());
        System.out.println("perimeter is: " + s2.getPerimeter());
    }
}
