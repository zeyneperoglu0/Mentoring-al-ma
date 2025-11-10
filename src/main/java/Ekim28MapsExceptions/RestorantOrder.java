package Ekim28MapsExceptions;


import java.util.LinkedHashMap;
import java.util.Scanner;


public class RestorantOrder {
    public static void main(String[] args) {
/*
S
🧩 Senaryo Sorusu – Restoran Sipariş Takibi

        Bir restoran uygulaması yazıyorsun. Kurallar şöyle:
        Müşteriler siparişlerini isim ve sipariş miktarı ile ekliyor: "Ali" -> 3, "Ayşe" -> 5 gibi.
                Aynı müşteri birden fazla sipariş verebilir. Eğer zaten bir sipariş varsa, var olan miktara eklenmeli.
                Sipariş miktarı 0 veya negatif olamaz. Eğer öyleyse, exception fırlat: "InvalidOrderException: Sipariş miktarı 0 veya negatif olamaz".
                Siparişleri ekleme sırasına göre tut.
❓ Kod yazman gerekenler:
        Uygun bir Map seç.
        Sipariş ekleme metodunu yaz (addOrder(String customer, int quantity))
        Hatalı sipariş girildiğinde exception fırlat ve try-catch ile yakala.
        Mevcut tüm siparişleri ekrana yazdır (displayOrders()).
*/
        LinkedHashMap<String,Integer> sipariş = new LinkedHashMap<>();
        addOrder("a",10,sipariş);
displayOrders(sipariş);
    }

public static void addOrder(String customer, int quantity,LinkedHashMap<String,Integer> sipariş  ) {
    Scanner input = new Scanner(System.in);


    while (sipariş.size()<5){
        System.out.println("lütfen adınızı giriniz");
        customer = input.nextLine();

        System.out.println("Lütfen sipariş sayısını giriniz");
        quantity = input.nextInt();
        input.nextLine();


        try {
            if (quantity <= 0){
                throw new IllegalArgumentException("Sipariş miktarı 0 veya negatif olamaz");
            }
}catch (IllegalArgumentException e) {
        System.out.println("Lütfen negatif değer veya 0 girmeyiniz");
        continue;
     }

        sipariş.put(customer, sipariş.getOrDefault(customer, 0) + quantity);


        System.out.println("Daha fazla sipariş vermek istiyor musunuz?");
            String evt = input.nextLine();

            if (evt.equalsIgnoreCase("evet")){
                System.out.println("Lütfen ek sipariş sayısını giriniz");
                int ek = input.nextInt();
                input.nextLine();
                try {
                    if (ek<=0){
                        throw new IllegalArgumentException("Sipariş miktarı 0 veya negatif olamaz");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Lütfen negatif değer veya 0 girmeyiniz");
                    continue;
                }

                sipariş.put(customer, sipariş.getOrDefault(customer, 0) + ek);

            }else if (evt.equalsIgnoreCase("hayır")){

            }else {
                throw new IllegalArgumentException("evt hayır dışında bir sey girerse");
            }




        }



}


public static  void  displayOrders(LinkedHashMap<String,Integer> sipariş ){
    System.out.println(sipariş);
}






















    }
