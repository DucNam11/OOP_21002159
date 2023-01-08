package excercise1_7;

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    public void greeting(BigDog another) {
        System.out.println("Woooooowwwww");
    }
}
