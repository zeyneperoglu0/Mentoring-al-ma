package Ekim28MapsExceptions;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Stock extends Exceptions2 {
public String product;
    public int quantity ;



    /*🧩 Senaryo Sorusu – Online Mağaza Stok Takibi
    Bir online mağaza uygulaması yazıyorsun. Kurallar şöyle:
    Mağazada ürünler ve stok miktarları tutuluyor. Örnek: "Elma" -> 50, "Muz" -> 20.
    Aynı anda birden fazla çalışan (thread) stok ekleyip çıkarabiliyor.
    Stok miktarı negatif olamaz. Eğer negatif bir stok oluşacak olursa exception fırlat:
            "InvalidStockException: Stok negatif olamaz".
    Program thread-safe olmalı, yani aynı anda iki thread aynı ürünü güncelse tutarsızlık olmamalı.
    Tüm ürünleri ve stok miktarlarını ekrana yazdır.
❓ Kod yazman gerekenler:
    ConcurrentHashMap kullan.
    Stok ekleme ve çıkarma metodlarını yaz (addStock(String product, int qty) ve removeStock(String product, int qty)).
    Hatalı miktar girildiğinde exception fırlat ve try-catch ile yakala.
    Son olarak ürünleri ve stokları yazdır (displayStock()).*/



    public ConcurrentHashMap<String,Integer> stock = new ConcurrentHashMap<>();
    Set<Map.Entry<String,Integer>> entrySet = stock.entrySet();


    public  void addStock(String product , int quantity,Scanner input){
        while (true) {
            System.out.println("Stok eklenmesi yapılıyor");

            {
                System.out.println(" Eklemek istediğiniz ürün adını giriniz(çıkmak için q'ya basınız)");
                product = input.nextLine();
                if (product.equalsIgnoreCase("q")){
                    break;}


                System.out.println("Eklemek istediğiniz ürün sayısını giriniz");

                quantity = input.nextInt();
                input.nextLine();
                if (quantity<0){
                    exc(quantity);
               continue;
                }else {
                    stock.put(product, stock.getOrDefault(product, 0) + quantity);

                }
            }

        }}


    public void usage(Scanner input) {
        while (true){
            System.out.println("hangi ürünü kullanmak istiyorsunuz(çıkmak için q'ya basınız)");

            String kullan = input.nextLine();
            if (kullan.equalsIgnoreCase("q")) {
                break;
            }
            System.out.println("Kaç kilo kullanacaksınız?");
            int kg = input.nextInt();
            if (kg<0){
                exc(kg);
                input.nextLine();
                continue;
            }
            input.nextLine();
            Integer mevcutMiktar = stock.get(kullan);
            if (mevcutMiktar == null){
                System.out.println("Bu ürün stokta yok");
                continue;
            }
            if (mevcutMiktar - kg < 0) {
                exc3(mevcutMiktar-kg);
                continue;

            }else {
                stock.replace(kullan, mevcutMiktar - kg);
            }}}

    public void stockControl(){

        for (Map.Entry<String,Integer>w: entrySet){

            if (w.getKey().equalsIgnoreCase("muz")&& w.getValue()<10){
                neverLessThan(w.getKey(),w.getValue());
            } else if (w.getKey().equalsIgnoreCase("elma")&& w.getValue()<15) {
                neverLessThan(w.getKey(),w.getValue());
            }else if (w.getKey().equalsIgnoreCase("armut")&& w.getValue()<7) {
                neverLessThan(w.getKey(),w.getValue());
            }else if (w.getKey().equalsIgnoreCase("üzüm")&& w.getValue()<12) {
                neverLessThan(w.getKey(),w.getValue());
            }else if (w.getKey().equalsIgnoreCase("çilek")&& w.getValue()<9) {
                neverLessThan(w.getKey(),w.getValue());
            }else if (w.getKey().equalsIgnoreCase("mandalina")&& w.getValue()<20) {
                neverLessThan(w.getKey(),w.getValue());
            }
        }
    }

    public  void displayStock(){
        System.out.println("stok sayısı : " + stock);
    }
}



















