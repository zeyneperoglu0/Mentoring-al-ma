package w3resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {


//        1. ArrayList Oluşturun ve Yazdırın
//        Bir dizi listesi oluşturmak, bazı renkler (dizeler) eklemek ve koleksiyonu yazdırmak için bir Java programı yazın.


        List<String> stringList = new java.util.ArrayList<>();
        stringList.add("Ayşe");
        stringList.add("Fatma");
        stringList.add("Ali");
        stringList.add("Veli");
        System.out.println(stringList);


for (String w :stringList){
//    System.out.println(w);
    System.out.println(w.replaceFirst("Ayşe", "Mustafa"));

}


stringList.add(0,"Kasım");


//        4. Öğeyi dizine göre alın
//        Belirli bir dizi listesinden bir öğeyi (belirli bir dizinde) almak için bir Java programı yazın.

        System.out.println(stringList.get(1));

//        5. ArrayList Öğesini Güncelleyin
//        Bir dizi öğesini verilen öğeye göre güncellemek için bir Java programı yazın.


    stringList.set(2,"a");
        System.out.println(stringList);

//        6. Üçüncü Elemanı Kaldır
//        Dizi listesinden üçüncü öğeyi kaldırmak için bir Java programı yazın.

        stringList.remove(2);
        System.out.println(stringList);

//        7. ArrayList'te Arama Elemanı
//        Dizi listesindeki bir öğeyi aramak için bir Java programı yazın


if (stringList.contains("Ali")){
            System.out.println("eleman vardır");
        }else {
    System.out.println("böyle bir eleman yok");
        }
//
//        8. Sıralı Dizi Listesi
//        Belirli bir dizi listesini sıralamak için bir Java programı yazın.


stringList.stream().sorted().forEach(System.out::println);

        Collections.sort(stringList);


List<String> copyList = new java.util.ArrayList<>();


for (String w : stringList){
    if (!copyList.contains(w)){
        copyList.add(w);

    }

}
//        System.out.println(copyList);

        System.out.println("------------");
        Collections.copy(stringList,copyList);
        System.out.println(copyList);


//Collections.shuffle(stringList);
//        System.out.println(stringList);

        System.out.println(stringList);
        Collections.reverse(stringList);
        System.out.println(stringList);

//        12. Alt Listeyi ArrayList'ten Çıkarın
//
//        Dizi listesinin bir bölümünü ayıklamak için bir Java programı yazın.
        System.out.println("--------------------");
List<String> subList = stringList.subList(0,2);
        System.out.println(stringList);
        System.out.println(subList);




//        13. İki ArrayList'i Karşılaştırın
//        İki dizi listesini karşılaştırmak için bir Java programı yazın.

List<String> c1 = new java.util.ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

 List<String> c2 = new java.util.ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

for (String w : c1) {

stringList.add(c2.contains(w) ? "YES" : "NO");
    System.out.println(stringList);

}

//        14. ArrayList Öğelerini Değiştirin
//
//        Bir dizi listesindeki iki öğeyi değiştiren bir Java programı yazın


  Collections.swap(stringList,1,2);
        System.out.println(stringList);







        List<String> c0 = new java.util.ArrayList<>(Arrays.asList("A","B","C","D","E"));
        List<String> c3 = new java.util.ArrayList<>(Arrays.asList("F","G","H","J","K"));

//        15. İki ArrayList'e Katılın
//        İki dizi listesini birleştirmek için bir Java programı yazın. İki dizi listesini birleştirmek için bir Java programı yazın. Çözümü görmek için beni tıklayın
//
//        c3.addAll(c0);
//        System.out.println(c3);


//        16. Dizi Listesini Klonla
//
//        Bir dizi listesini başka bir dizi listesine kopyalamak için bir Java programı yazın

    Collections.copy(c0,c3);
        System.out.println(c0);










//
//        17. ArrayList'i Temizle
//
//        Bir dizi listesini boşaltmak için bir Java programı yazın.

c0.removeAll(c3);
        System.out.println(c0);
        System.out.println(c3);
//        18. ArrayList'in Boş Olup Olmadığını Kontrol Edin
        System.out.println(c0.isEmpty());
//
//        Bir dizi listesinin boş olup olmadığını test etmek için bir Java programı yazın.





//
//        19. ArrayList Kapasitesini Kırpın
//
//        Bir dizi listesinin kapasitesini kırpmak için bir Java programı yazın.

        java.util.ArrayList<Integer> integerArrayList = new java.util.ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        integerArrayList.trimToSize();
integerArrayList.ensureCapacity(7);
integerArrayList.replaceAll(n-> n * 2 );
        System.out.println(integerArrayList);
//        20. ArrayList Kapasitesini Artırın
//
//        Dizi listesi boyutunu artırmak için bir Java programı yazın.

//        21. İkinci Elemanı Değiştirin
//
//        ArrayList'in ikinci öğesini belirtilen öğeyle değiştirmek için bir Java programı yazın.
//        Çözümü görmek için beni tıklayın
//
//        22. Öğeleri Konuma Göre Yazdır
//
//        Öğelerin konumunu kullanarak bir ArrayList'in tüm öğelerini yazdırmak için bir Java programı yazın.

integerArrayList.get(0);
integerArrayList.get(1);


































    }
}
