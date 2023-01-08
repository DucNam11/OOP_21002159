package excercise1_5;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println(resizableCircle);
    }
}
