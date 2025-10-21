package oop;

public class Circle extends Shape implements Resizable {

private double radius ;
private double factor;

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double resize(double factor) {
factor = radius * factor;
 return factor; }

    @Override
    public void displayColor(String color) {
        super.displayColor(color);
    }



    @Override
    public double calculateArea(double radius,double factor) {

   double area  = Math.PI * radius * radius * factor;
        System.out.println("Dairenin alanı : " + area);
        return area;
    }
}
