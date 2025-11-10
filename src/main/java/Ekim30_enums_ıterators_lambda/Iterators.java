package Ekim30_enums_ıterators_lambda;

import java.util.*;

/*
📝 Soru (Iterator & LinkedList)

Bir LinkedList oluştur ve içine şu isimleri ekle:
        "Ali", "Veli", "Ayşe", "Fatma", "Mustafa".

Kullanıcıdan bir isim al ve Iterator kullanarak LinkedList içinde ara.

Eğer kullanıcı tarafından girilen isim listede varsa:

O ismi güvenli bir şekilde sil (remove() kullan).

Silme işleminden sonra listeyi ekrana yazdır.

Eğer isim listede yoksa:

Kullanıcıya "Böyle bir isim yok, lütfen tekrar giriniz" mesajı göster.

Döngüyü baştan başlat (sonsuz döngü gibi, kullanıcı doğru bir isim girene kadar).

Ekstra (isteğe bağlı):

Kullanıcı "q" veya "çıkış" yazarsa döngüden çık ve programı bitir.

        ✅ Not:

Sadece Iterator kullanabilirsin, for-each veya index ile silmeye çalışmayacaksın.

Break / continue mantığını doğru yerle kullanman önemli.

Kod LinkedList üzerinde güvenli bir şekilde çalışmalı.
*/
public class Iterators {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Ayşe");
        list.add("Veli");
        list.add("Fatma");
        list.add("Mustafa");

        Iterator<String> iterator = list.iterator();


//
//        while (iterator.hasNext()){
//            String a = iterator.next();
//
//         if (a.equals("Fatma"))
//
//            iterator.remove();
//        }
//        System.out.println(list);


        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Ali");
        list2.add("Ayşe");
        list2.add("Veli");
        list2.add("Fatma");
        list2.add("Mustafa");



        Iterator<String> iterator2 = list2.iterator();

        while (iterator2.hasNext()){
          iterator2.next();
          iterator2.remove();
        }
        System.out.println(list2 + "l2");





      List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Ayşe");
        list3.add("Veli");
        list3.add("Fatma");
        list3.add("Mustafa");

        ListIterator<String> listIterator = list3.listIterator(list3.size());

//        while (listIterator.hasNext()){
//            listIterator.next();
//        }



        while (listIterator.hasPrevious()){
String b = listIterator.previous();

            System.out.print(b + " ");
        }

/*
📝 Soru: Coffee Listesi Yönetimi

        Bir ArrayList<String> oluştur ve içine şu kahve isimlerini ekle:
        "Americano", "Mocha", "Latte", "Espresso", "Cappuccino"
        Iterator kullanarak kullanıcıdan bir kahve adı al:
        Eğer kahve listede varsa güvenli bir şekilde sil (remove() kullan).
        Silme işleminden sonra listeyi ekrana yazdır.
        Eğer kahve yoksa, kullanıcıya "Böyle bir kahve yok, tekrar deneyin" mesajı göster ve tekrar sor.
                Tüm kahveleri sondan başa doğru ekrana yazdırmak için ListIterator kullan:
        Pointer’ı listenin sonuna koy.
        previous() metodu ile sondan başa doğru listeyi ekrana yazdır.
        ListIterator kullanarak listedeki her kahve adının sonuna " - Hot" ekle (set() kullan).
                Güncellenmiş listeyi ekrana yazdır.
                Kullanıcı "q" veya "çıkış" yazarsa program sonlansın.
*/

        ArrayList<String> kahve = new ArrayList<>();
        kahve.add("Americano");
        kahve.add("Mocha");
        kahve.add("Latte");
        kahve.add("Espresso");
        kahve.add("Cappuccino");
        Iterator<String> kahveVarsaSil = kahve.iterator();
        System.out.println();
Scanner input = new Scanner(System.in);


while (kahveVarsaSil.hasNext()){
    System.out.println("bir kahve adı giriniz");
    String kullanıcıKhve = input.nextLine();

    String a = kahveVarsaSil.next();
    if (a.equalsIgnoreCase(kullanıcıKhve)){
        kahveVarsaSil.remove();
        break;

    }else {
        System.out.println("böyle bir kahve yok");
        continue;

    }
}
        System.out.println(kahve);

      /*  ArrayList<String> kahve2 = new ArrayList<>();
        kahve2.add("Americano");
        kahve2.add("Mocha");
        kahve2.add("Latte");
        kahve2.add("Espresso");
        kahve2.add("Cappuccino");




ListIterator<String> kahveLşstIter = kahve2.listIterator(kahve2.size());



        System.out.println("------------------");
while (kahveLşstIter.hasPrevious()){
  String a  =   kahveLşstIter.previous();
    kahveLşstIter.set( a + "-hot");

    System.out.println(a);

}
        System.out.println(kahve2);
        kahveLşstIter = kahve2.listIterator(kahve2.size());

while (kahveLşstIter.hasPrevious()){
    String b = kahveLşstIter.previous();
    System.out.print(b);
}


*/






    }
}
