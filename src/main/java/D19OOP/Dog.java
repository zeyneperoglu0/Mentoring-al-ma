package D19OOP;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Dogs Bark...");
    }


    @Override
    public void sleep() {
        System.out.println("Dogs Sleep...");
    }
}
