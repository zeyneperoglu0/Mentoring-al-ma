package Kasım23;

public class Rectangle {

 int length;
 int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public Rectangle(Rectangle other ) {
        this.length = other.length;
        this.width = other.width;
    }

    public void printInfo() {
        System.out.println("Length: " + length + ", Width: " + width);
    }





}
