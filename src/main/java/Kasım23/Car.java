package Kasım23;

public class Car {

    String model;
    int year ;

    public Car(String model, int year) {
        this.model = (model == null|| model.isEmpty() ? "unknown": model);
        this.year =(year<=0?2000:year);
    }
















}
