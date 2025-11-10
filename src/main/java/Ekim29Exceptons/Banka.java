package Ekim29Exceptons;
/*🧩 Soru 2 – IllegalArgumentException

Bir banka sistemi yazıyorsun.
Kullanıcı para yatırmak istediğinde, negatif tutar girerse IllegalArgumentException fırlat.

        🧠 İpucu: “Para miktarı negatif olamaz” mesajı vermeli.
Metot: deposit(double amount)*/

import java.util.Scanner;

public class Banka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yatırmak istediğiniz miktarı giriniz");
        double amount = input.nextDouble();
deposit(amount);


    }


    public static void deposit(double amount ){
try {
        if (amount<=0){
            System.out.println("0 ya da negatif olamaz");//neden throw koyuyoruz zatdn sadecee throwla da halledebilirdik yani sadece try catch kullanmamız gerekmez mi
        }else {
            System.out.println("Yatırılan miktar " + amount );
        }
}catch (IllegalArgumentException e ){
    System.out.println(  " yatırılmak istenen miktar 0 veya negatif olamaz");
}
    }
}
