package Ekim25Collections;

import java.sql.Array;
import java.util.*;

public class QueBankMaps {
    public static void main(String[] args) {

/*
        1) Asagıda key olarak ürün adlarını ve value olarak ürün sayısını !çeren b!r map
        bulunmaktadır. Toplam ürün sayısını bulmak !ç!n kodu yazınız.
        */

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Set<Map.Entry<String,Integer>> a = product.entrySet();
        int sum = 0;
      for (Map.Entry<String,Integer> w : a){
          sum = sum + w.getValue();
      }
        System.out.println(sum);

      //        Ürünler arasında " Laptop " olup olmadıgını kontrol etmek !ç!n kodu
//        yazınız.

        System.out.println(product.containsKey("Laptop"));




//        Ürün sayılarını artan sırada yazdırınız.
       Set<Map.Entry<String,Integer>> b = product.entrySet();
      ArrayList<Integer> sırala = new ArrayList<>();
        for (Map.Entry<String,Integer> w : b){
            sırala.add(w.getValue());

        }
        sırala.sort(null);
        System.out.println(sırala);
        for (Map.Entry<String,Integer> w : b){

        }
//        Ürün adlarını alfabet!k sırayla yazdırınız.

        ArrayList<String> sırala2 = new ArrayList<>();

        for (Map.Entry<String,Integer> w : b){
            sırala2.add(w.getKey());


        }
sırala2.sort(null);
        System.out.println(sırala2);
Collections.sort(sırala2);
        System.out.println(sırala2);



//        5) B!r Str!ng’ dek! kel!meler!n kaç defa tekrarlandıgını !fade eden kod yazınız.
//        (Büyük/küçük harfe duyarlı deg!l)


        Set<Map.Entry<String,Integer>> e = product.entrySet();


//        6) Bel!rl! b!r l!stede tekrarlanan ögeler!n sayısı nasıl kontrol ed!l!r?


        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

TreeSet<Integer> y = new TreeSet<>(myList);

        System.out.println(myList.size() - y.size() );


//        B!r Str!ng’ dek! kel!meler!n kaç defa tekrarlandıgını !fade eden kod yazınız.
//        (Büyük/küçük harfe duyarlı deg!l)
//


        String s = "Apex is easy Type codes to learn apex To earn money learn apex";
s = s.toLowerCase();

ArrayList<String> arrayList = new ArrayList<>( Arrays.asList(s.split(" ")));

TreeSet<String> g = new TreeSet<>(arrayList);

        System.out.println(arrayList.size() - g.size() );

    }
}
