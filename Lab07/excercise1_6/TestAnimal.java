package excercise1_6;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("Tony");
        cat1.greeting();
        Dog dog1 = new Dog("Andy");
        dog1.greeting();
        BigDog bigDog1 = new BigDog("Collin");
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat("Cookie");
        animal1.greeting();
        Animal animal2 = new Dog("Money");
        animal2.greeting();
        Animal animal3 = new BigDog("Six");
        animal3.greeting();

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
