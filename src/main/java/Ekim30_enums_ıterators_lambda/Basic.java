package Ekim30_enums_ıterators_lambda;

import java.util.*;

public class Basic {
    public static void main(String[] args) {

//
//       🌀 ITERATOR & LISTITERATOR SORULARI
//
//        1️⃣ Bir ArrayList<String> oluştur. İçine rastgele 5 isim ekle.
//        Iterator kullanarak içinde "a" harfi geçen tüm isimleri listeden sil.
//
//❗️for ya da for-each YASAK.
//
//


        ArrayList<String>   arrayList = new ArrayList<>();
        arrayList.add("ab");
        arrayList.add("dcca");
        arrayList.add("dcba");
        arrayList.add("dcc");
        arrayList.add("dccds");
        arrayList.add("dcca");


        Iterator<String > iterator = arrayList.iterator();

        while (iterator.hasNext()){
          String a =   iterator.next();
            if (a.contains("a")){
                iterator.remove();
            }



        }
        System.out.println(arrayList);

//
//        2️⃣ Bir ArrayList<Integer> oluştur (örneğin [10, 20, 30, 40, 50]).
//        ListIterator kullanarak listedeki her elemanı 2 ile çarp ve güncelle.
//
//        set() metodu kullanman gerekecek.
//


        ArrayList<Integer> integerArrayList =  new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50))  ;
        ListIterator<Integer> integerIterator = integerArrayList.listIterator();

        while (integerIterator.hasNext()){
      Integer a = integerIterator.next();
          integerIterator.set(a * 2 );
        }
        System.out.println(integerArrayList);



//        sadece çift sayıları yazdır (ama if kullanmadan, sadece filter()).


integerArrayList.stream().filter(t-> t%2 == 0 ).forEach(t-> System.out.println(t));








    }
}
