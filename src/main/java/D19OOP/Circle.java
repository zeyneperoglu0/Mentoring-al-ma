package D19OOP;

public class Circle extends Shape {

 double r = 5;
double n;

    @Override
    public double area(double a, double b) {
        return 0;
    }

    @Override
    public double area(double r) {
        return r*r*Math.PI;
    }


    @Override
    public void shape() {
        super.shape();
    }
}
