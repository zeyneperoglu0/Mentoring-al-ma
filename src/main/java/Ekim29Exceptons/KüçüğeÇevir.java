package Ekim29Exceptons;
/*🧩 Soru 1 – NullPointerException

        Bir uygulama, kullanıcının girdiği ismi küçük harfe çevirmek istiyor.
Kullanıcı ismi null girdiğinde program çökmeden uyarı versin.

🧠 İpucu: toLowerCase() metodu NullPointerException fırlatır.
Kullanıcı null girdiğinde bunu yakalayıp “İsim boş olamaz” yazdır.*/

import java.util.Scanner;

public class KüçüğeÇevir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String name = input.nextLine();
convertToLowerCase(name);

    }


    public static void convertToLowerCase(String name){

        try {
            if (name.isEmpty()){
                name = null;
                throw new NullPointerException();
            }else {

            } System.out.println(name.toLowerCase());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage() +  " isim boş olamaz");
        }


    }
}
