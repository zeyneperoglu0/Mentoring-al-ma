package oop;

public class Car {

  public String brand ;

    public Car(String brand) {
        this.brand = brand;

    }

    Engine e = new Engine(210);

    public void displayCarInfo(){
        System.out.println("brand = " + brand);
        System.out.println("e.horsePower = " + e.horsePower);
    }














}
