package Ekim29Exceptons;
/*

🧩 Soru 3 – Multiple Catch

Bir diziden istenen elemanı bulmak istiyorsun.
Girilen index:

negatifse: “Index negatif olamaz”

dizinin sınırlarını aşarsa: “Index aralık dışında”

        🧠 İpucu: ArrayIndexOutOfBoundsException ve IllegalArgumentException kullan.
*/

import java.util.Scanner;

public class IndexBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int one = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int two = input.nextInt();
        int [] arr = {1,2,3,4,5};
        getIndex(one,two,arr);

    }
    public static void getIndex(int one , int two, int [] arr){

        try {

            int a = one/two;
           int b = arr[a];

            System.out.println(b);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            System.err.println(e.getMessage());
        }

        int b = 0;







    }
}
