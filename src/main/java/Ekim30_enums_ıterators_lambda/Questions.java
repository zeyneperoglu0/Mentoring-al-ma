package Ekim30_enums_ıterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*🧩 Görev 1 – Enum & Liste Oluşturma

Bir enum oluştur (CoffeeType veya kendi temanda farklı olabilir).

Her enum sabitinin en az 2 özelliği olsun (örneğin fiyat ve stok gibi).

Bu enum’daki tüm sabitleri bir ArrayList’e aktar.

Bu listeyi ekrana yazdır.



        🧩 Görev 3 – ListIterator ile Değişiklik

Şimdi kalan listedeki her ürünün adına " - Güncel" ekle.

Değişiklikten sonra listeyi sondan başa doğru yazdır.

🧩 Görev 4 – Lambda / Stream

Listedeki ürünlerden fiyatı 50’den küçük olanları bul.

Bunları Lambda kullanarak yazdır.

Ardından stok sayısı 10’dan fazla olanları filtreleyip yeni bir liste oluştur.

        🧩 Bonus – Hepsini Birleştir

Bir main metodunda yukarıdaki tüm adımları sırayla çağır.
        Program sonunda, ekranda sadece:

Stokta olan,

Fiyatı 50’den düşük,

Adının sonunda " - Güncel" yazan ürünler kalsın.*/
public class Questions {
    public static void main(String[] args) {

  /*🧩 Görev 2 – Iterator Kullanımı
        Enum listesinden stok sayısı 0 olan ürünleri güvenli şekilde sil.
                Kalanları ekrana yazdır.
        (Dikkat: for veya forEach değil, Iterator ile silme yapacaksın.)
        */



        CoffeeType [] coffees = CoffeeType.values();

        List<CoffeeType> coffeeTypeList = new ArrayList<>(Arrays.asList(coffees));
        Iterator<CoffeeType> coffeeTypeIterator = coffeeTypeList.listIterator();


       while (coffeeTypeIterator.hasNext()){
 CoffeeType c  = coffeeTypeIterator.next();
if (c.getCoffeePrice()<120){
    coffeeTypeIterator.remove();

}System.out.println(c.getCoffeePrice());
       }






        while (coffeeTypeIterator.hasNext()){
            coffeeTypeIterator.hasNext();



        }







    }
}
