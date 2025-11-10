package Ekim26;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Yapılacaklar {
    public static void main(String[] args) {


    /*Öncelikle listleri biraz unutmuşsun gibi geldi bir hatırla
    biraz collections karışık ve mantık yürütme soruları çöz
    OOP çalışması yap hatta mapleri setleri falan yarlayabileceğin projemsi bir şeyer yapmayya çaliş
    :)


     ✅ AŞAMA 1 — List Tazeleme (10 dakika)

Sana küçük görevler veriyorum. Kodları sen yazacaksın, ben yönlendireceğim:

🎯 Görev 1:

Bir ArrayList<String> oluştur → İçine şu şehirleri ekle:

İstanbul, Ankara, İzmir, Bursa, Antalya


✔ İlk ve son şehri yazdır
✔ "Ankara" listede var mı kontrol et
✔ Listedeki 3. şehri sil
✔ Güncel listeyi yazdır
*/


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("İstanbul");
        arrayList.add("Ankara");
        arrayList.add("İzmir");
        arrayList.add("Bursa");
        arrayList.add("Antalya");

        System.out.println(arrayList.get(0) + " " + arrayList.get(2));
        System.out.println("Ankara var mı :  "+arrayList.contains("Ankara") );
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList);

/*
🎯 Görev 2:

        Bir LinkedList<Integer> → içine 10, 20, 30, 40, 50 koy

✔ Elemanları sondan başa doğru yazdır
✔ Listenin ortalamasını bul
✔ 40 değerini sil*/


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

int sum =0;
        for (int i = linkedList.size()-1; i >=0 ; i--) {
            System.out.println(linkedList.get(i));
            sum = sum + linkedList.get(i);

        }

        System.out.println("ortalama : " + sum/linkedList.size());

linkedList.remove(Integer.valueOf(40));
        System.out.println(linkedList);

/*
✅ AŞAMA 2 — Collections Mantık Soruları

        Aynı şehir listesiyle devam:

🎯 Görev 3

        Aynı ArrayList<String> içinde:

✔ İçinde 'a' harfi olan şehirleri yazdır
✔ Kaç tane olduklarını say
*/

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("İstanbul");
        arrayList2.add("Ankara");
        arrayList2.add("İzmir");
        arrayList2.add("Bursa");
        arrayList2.add("Antalya");


 for (String w: arrayList2){
     if (w.contains("a")){
         System.out.println(w);
     }
 }

/*🎯 Görev 4

        LinkedList<Integer> ile:

✔ 25’ten büyük sayıları yeni bir listeye ekle
✔ Yeni listeyi yazdır*/

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(10);
        linkedList2.add(20);
        linkedList2.add(30);
        linkedList2.add(40);
        linkedList2.add(50);
        LinkedList<Integer> linkedList3= new LinkedList<>();
for (Integer w : linkedList2){

    if (w>25){
        linkedList3.add(w);
    }

}
        System.out.println(linkedList3);

/*
🎯 Görev 5

        ArrayList<String> →
        Şehirleri uzunluklarına göre sıralayıp yazdır (alfabetik değil!)*/

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("İstanbul");
        arrayList3.add("Ankara");
        arrayList3.add("İzmir");
        arrayList3.add("Bursa");
        arrayList3.add("Antalya");

arrayList3.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(arrayList3);










    }
}