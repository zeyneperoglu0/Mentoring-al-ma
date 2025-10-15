package D19OOP;

public class Cat extends Animal {

    @Override
    public void sleep() {
        System.out.println("Cats Sleep...");
    }

    @Override
    public void sound() {
        System.out.println("Cats Meow...");
    }
}
