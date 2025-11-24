package Kasım24;

public class Circle extends  Shape{

int r;
//constructor oluşturuyoruz ki değer verebilelim mekanizma diyebilirz aslında buna
    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea( ) {

  return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return 2* Math.PI*r;
    }
}
