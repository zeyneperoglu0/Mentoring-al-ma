package oop;

public class CircleRunner {
    public static void main(String[] args) {


Circle c = new Circle();
c.setColor("kırmızı");
        System.out.println(c.getColor());

        c.setRadius(3);
        c.resize(3);
        System.out.println(c.calculateArea(c.getRadius(), c.getFactor()));

    }
}
