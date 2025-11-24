package Kasım23;

public class Point {

 int x;
 int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }




    public Point(double x, double y) {
        this.x = (int)x;
        this.y = (int)y;
    }




    // Method to print the values of x and y
    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }







}
