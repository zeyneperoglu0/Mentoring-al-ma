package Ekim29Exceptons;

public class Finally {
    public static void main(String[] args) {
     int a = 12;
     int b = 3 ;
     int[] c = {3,5,7,9};


    }
    public static void getİndex(int a,int b,int[] c){

        int div = 0;
        try {
            div = a/b;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        } finally {
        }
        try {
            int index = c[div];
            System.out.println(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

    }
}
