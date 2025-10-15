package D19OOP;

public class Rectangle extends Shape{

    double kısaKenar = 10;
    double uzunKenar = 15;


    @Override
    public double area(double r) {
        return 0;
    }

    @Override
    public double area(double kısaKenar , double uzunKenar ) {

        return kısaKenar * uzunKenar ;
    }


    @Override
    public void shape() {
        super.shape();
    }
}
