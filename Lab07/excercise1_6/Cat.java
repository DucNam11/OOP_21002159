package excercise1_6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Meow!");
    }
}
