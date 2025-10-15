package D19OOP;

public class Car extends Vehicle {


    @Override
    public void startEngine() {
        System.out.println("Arabanın motoru başlatılıyor...");


    }

    @Override
    public void fuel() {
        super.fuel();
    }
}
