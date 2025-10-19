package d20oopcollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListQuestions {
    public static void main(String[] args) {
    /*
🧩 Soru 1:

        Bir LinkedList<String> oluştur.
                Listeye sırayla "Ali", "Veli", "Ayşe" elemanlarını ekle.
        Sonra listenin başına "Fatma", sonuna "Hasan" ekle.
                Son durumda listeyi yazdır./*



     */


        LinkedList<String> ll = new LinkedList();
        ll.add("Ali");
        ll.add("Veli");
        ll.add("Ayşe");
ll.addFirst("Fatma");
ll.addLast("Hasan");
        System.out.println(ll);
/*
🧩 Soru 2:

        Elinde şu liste var:
["Elma", "Armut", "Kiraz", "Muz", "Elma"]
        Bu listedeki ilk “Elma”yı sil, ardından son “Elma”yı da sil.
                Sonra kalan listeyi yazdır.*/


LinkedList<String>list2 = new LinkedList<>(Arrays.asList("Elma", "Armut", "Kiraz", "Muz", "Elma"));
list2.removeFirstOccurrence("Elma");
list2.removeLastOccurrence("Elma");
        System.out.println(list2);//[Armut, Kiraz, Muz]
        /*
🧩 Soru 3:

        Aşağıdaki işlemleri yapan kodu yaz:
        Boş bir LinkedList<Integer> oluştur.
        addFirst() ve addLast() metodlarını kullanarak sırayla 10, 20, 30, 40 elemanlarını ekle.
        poll() ile ilk elemanı silip ekrana yazdır.
        peek() ile kalan ilk elemanı ekrana yazdır.
        En sonunda tüm listeyi yazdır.
*/

        LinkedList<Integer>  list3 = new LinkedList<>();
        list3.addFirst(30);
        list3.addFirst(20);
        list3.addFirst(10);
        list3.addLast(40);
        System.out.println(list3.poll());
        System.out.println(list3.peek());
        System.out.println(list3);

/*

🧩 Soru 4 (bir tık zor):

        Bir LinkedList<String> oluştur ve "A", "B", "C", "D" elemanlarını ekle.
        Sonra sırayla:
        pop() çağır

        push("E") çağır

        poll() çağır
        Son durumda listeyi yazdır.

*/
        LinkedList<String> l4=new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println(l4.pop());
        l4.push("E");
        System.out.println(l4);
        l4.poll();
        System.out.println(l4);

     /*  🧠 Senaryo 1:

        Bir liste oluştur.
                İçine sırayla "Zeynep", "Ali", "Fatma", "Mehmet" eklensin.
                Sonra:

        Listenin en başındaki elemanı silip ekrana yazdır.

                Kalan listedeki ilk elemanı sadece görüntüle (silmeden).

                Sonra listenin sonuna "Yusuf" ekle.
                Son durumda listeyi yazdır.*/



  LinkedList<String> list = new LinkedList<>();
  list.add("Zeynep");
  list.add("Ali");
  list.add("Fatma");
  list.add("Mehmet");
   list.poll();
        System.out.println(list);
        System.out.println(list.peek());
        list.addLast("Yusuf");
        System.out.println(list);









/*
🧠 Senaryo 2:

        Bir liste oluştur.
                İçine "Kedi", "Köpek", "Kuş", "Balık", "Kedi" eklensin.

                Listedeki ilk "Kedi"yi kaldır.

        Ardından son "Kedi"yi kaldır.

        Listenin başına "Tavşan" ekle.
                Son durumda listeyi yazdır.*/


 LinkedList<String> hayvan = new LinkedList<>(List.of("Kedi", "Köpek", "Kuş", "Balık", "Kedi"));

    hayvan.removeFirstOccurrence("Kedi");
    hayvan.removeLastOccurrence("Kedi");
    hayvan.addFirst("Tavşan");
    System.out.println(hayvan);




/*
🧠 Senaryo 3:

        Bir liste oluştur.
                İçine "X", "Y", "Z" eklensin.
                Sonra sırasıyla:

        Başa "A" ekle.

                İlk elemanı kaldırıp ekrana yazdır.

        Başa "B" ekle.

                Son elemanı kaldır.
        Son durumda listeyi yazdır. */



        LinkedList<Character> ch = new LinkedList<>(Arrays.asList('X', 'Y', 'Z'));
        ch.addFirst('A');
        System.out.println(ch.removeFirst());
        ch.addFirst('B');
ch.removeLast();
        System.out.println(ch);

    }
}
