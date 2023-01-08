package excercise1_5;

public class TestMain {
    public static void main(String[] args) {
        Cat c1 = new Cat("Andy");
        System.out.println(c1);
        c1.greets();

        Dog d1 = new Dog("Andy");
        Dog d2 = new Dog("Tony");
        System.out.println(d1);
        d1.greets();
        d1.greets(d2);
    }
}
