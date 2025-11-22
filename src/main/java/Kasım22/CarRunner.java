package Kasım22;

public class CarRunner {
    public static void main(String[] args) {



   Car c1 = new Car("Honda","black") ;
   Car c2 = new Car("bmw","green");
   Car c3 = new Car("mercedes","blue");

       c1.setColor("redd");
        System.out.println(c1.getBrand() + " " + c1.getColor());


    }

}