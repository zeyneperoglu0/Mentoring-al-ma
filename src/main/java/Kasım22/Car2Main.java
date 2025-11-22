package Kasım22;

public class Car2Main {
    public static void main(String[] args) {



 Car2 c2 = new Car2();

 Tire tire = new Tire();
 Engine engine= new Engine();
tire.size=10;
engine.horsepower=10;

 c2.engine = engine ;
c2.brand = "c";
c2.tire= tire;


        System.out.println(c2.engine.horsepower + c2.brand + c2.tire.size);




    }
}
