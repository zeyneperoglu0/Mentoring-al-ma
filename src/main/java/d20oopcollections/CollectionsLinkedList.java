package d20oopcollections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsLinkedList {
    public static void main(String[] args) {


/*
    LinkedList ve Collections Özet Notları
1. Collections Nedir?
    Collections, Java’da nesneleri depolamak ve işlemek için kullanılan sınıf ve arayüzler kümesidir.
    Sağladığı temel işlemler:
    Ekleme: Eleman ekleme
    Silme: Eleman çıkarma
    Arama: Eleman bulma
    Döngüleme: Tüm elemanları işleme
    Amaçları:
    Verileri verimli depolamak
    Hızlı işlemek (arama, sıralama, filtreleme)
    Güvenli depolama sağlamak
    --------------------------------
2. Array ve Collection Karşılaştırması
    Array eksiklikleri:
    Boyutu sabittir (statik)
    İç içe array’ler karmaşıktır
    Ekleme, silme ve arama yavaş olabilir
    Collection:
    Dinamik boyut
    Daha esnek ve hızlı veri işlemleri
    Özellikle ekleme-silme işlemlerinde Array’den avantajlı
    ----------------------------------
3. LinkedList Özellikleri
    Bağlı liste (Doubly Linked List) yapısı:
    Her eleman, bir önceki ve bir sonraki elemanı gösterir (node bağlantısı)
    Ekleme ve silme işlemleri hızlıdır
    Elemanlara rastgele erişim yavaştır (index üzerinden erişim ArrayList kadar hızlı değildir)
    Bellek kullanımı ArrayList’e göre daha fazladır
    Kullanım Kararı
    LinkedList: Sık sık ekleme-silme yapılıyorsa, özellikle listenin başına veya ortasına ekleme gerekiyorsa.
    ArrayList: Elemanlara hızlı erişim gerekiyorsa veya ekleme/çıkarmalar listenin sonunda yoğunlaşmışsa.
    ---------------------------------------------
            4. LinkedList Metotları
    add(E e): Listeye eleman ekler
    add(int index, E e): Belirtilen konuma eleman ekler
    addFirst(E e): Listenin başına ekler
    addLast(E e): Listenin sonuna ekler
    Örnek Kullanımlar
    LinkedList<String> myList = new LinkedList<>();
myList.add("Ali"); // Liste sonuna ekler
myList.add(1, "Zeynep"); // 1. index'e ekler
myList.addFirst("Hasan"); // Başa ekler
myList.addLast("Hüseyin"); // Sona ekler

5. Immutable ve Mutable Listeler

List.of() → Immutable liste (Java 9+)
    Elemen eklenemez, çıkarılamaz
    UnsupportedOperationException verir

Arrays.asList() → Sabit boyutlu liste (mutable elemanlar, ama ekleme/çıkarma yok)
    Mevcut elemanlar değiştirilebilir
    Boyut değiştirilemez

    List<String> immutableList = List.of("A", "B");
    List<String> mutableList = Arrays.asList("A", "B");

mutableList.set(1, "C"); // Geçerli
// mutableList.add("D"); // HATA sadece arrays as listte indexteki eleman değişebilir bu kadar

    Soru Örnekleri

    Kısa cevap:
    LinkedList ve ArrayList arasındaki temel fark nedir?
linked listler elemanlara erişmek iin daha uygundur ekleme silme falan için
LinkedList, eleman ekleme ve silme işlemleri için daha uygundur, özellikle listenin başına veya ortasına
ekleme/silme gerekiyorsa.

ArrayList, elemanlara rastgele erişim (index üzerinden) için daha uygundur.

Özetle: Erişim hızlı mı? ArrayList; ekleme/silme hızlı mı? LinkedList.
    Kod sorusu:

    LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C"));
list.addFirst("X");
list.addLast("Y");
list.add(2, "Z");
System.out.println(list);


    Çıktı ne olur?
X A B Z C Y
    Kavram sorusu:
            Arrays.asList() ile oluşturulan bir listede eleman eklemeye çalışırsanız ne olur?
EXCEPTİON
    Kontrol Sorusu

    LinkedList’te bir elemana rastgele erişim neden ArrayList’e göre yavaştır?

            (Cevabı: LinkedList elemanlara node bağlantıları üzerinden erişir, index’e doğrudan erişemez.)*/


    LinkedList<String> ll = new LinkedList<>();
ll.add("Hasan");
ll.add("Zeynep");
ll.add("Ali");
ll.add("Veli");
        System.out.println(ll);//insertion order

        LinkedList<String> ll1  = new LinkedList<>(Arrays.asList("Hasan" , "Zeynep",  "Ali",  "Veli "));
        System.out.println(ll1);//[Hasan, Zeynep, Ali, Veli ]
        ll1.add("Ayşe");
        System.out.println(ll1);//[Hasan, Zeynep, Ali, Veli , Ayşe]
        LinkedList<String> ll2  = new LinkedList<>(List.of("Hasan" , "Zeynep",  "Ali",  "Veli "));
        System.out.println(ll2);//[Hasan, Zeynep, Ali, Veli ]
ll2.add("Ayşe");
        System.out.println(ll2);//[Hasan, Zeynep, Ali, Veli , Ayşe]

        List<String> ll3  = Arrays.asList("Hasan" , "Zeynep",  "Ali",  "Veli ");//bunun elemanlarının da boyutu falan değiştirilemez ama ,
        // set edilebilir yani varolan bir eleman başka bir elemanla değiştirilebilir
      ll3.set(1,"Halil");
        System.out.println(ll3);//[Hasan, Halil, Ali, Veli ]

        List<String> ll4  = List.of("Hasan" , "Zeynep",  "Ali",  "Veli ");//bunun elemanlarına hiçbir şey yapılamaz

//2- add(int index, E element); belirtilen konuma bir oge ekler
//3- addFirst(E e): Listenin basina oge ekler
//4- addLast(E e): Listenin sonuna bir öğe ekler.
//5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur

 boolean m1 = ll.remove("Ali");
        System.out.println(ll);//[Hasan, Zeynep, Veli]
        System.out.println(m1);//true

        System.out.println("-----------------------------------");
//6)removeFirstOccurrence() metodu
// belirtilen bir öğeyi LinkedList içinde
//bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
//Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
//Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
ll.add(1,"Veli");
ll.removeFirstOccurrence("Veli");
        System.out.println(ll);//[Hasan, Zeynep, Veli] ilk Veli gitti

//8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
// Bu metod, elemanı koleksiyondan kaldırmaz.
// Bu metod, koleksiyon boşsa null dondurur


    String s = ll.peek();
        System.out.println(ll);//
        System.out.println(s);//Hasan

//9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
// Bu metod, koleksiyon boşsa null döndürür.

        System.out.println(ll.poll());//Hasan
        System.out.println(ll);//[Zeynep, Veli]
        System.out.println("-------------------------------");
//-------------------------
//10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
// Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)   PEEKLE AYNI ŞEYİ YAPAR SADECE LİST BOŞSA EXCEPTİON FIRLATIR PEEKTE NULL DÖNDÜRÜRDÜ
// bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(ll.element());
        System.out.println(ll);

//------------------------
//11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır. POLLA AYNI ŞEYİ YAPAR EĞER BOŞSA EXCEPTİON FIRLATIR POPTA NULL
// Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)
        System.out.println(ll.pop());
        System.out.println(ll);




/*LinkedList Metotları Özet Tablosu
Metot	Ne Yapar?	      Siler mi?	               Eşdeğeri / Notlar
add(E e)	Liste sonuna eleman ekler	❌	addLast(e) ile aynı
addFirst(E e)	Liste başına eleman ekler	❌	push(e) ile aynı
addLast(E e)	Liste sonuna eleman ekler	❌	add(e) ile aynı
push(E e)	Liste başına eleman ekler	❌	addFirst(e) ile aynı
pop()	Liste başındaki elemanı alır ve siler	✅	removeFirst() ile aynı
peek()	Liste başındaki elemanı gösterir, silmez	❌	Boşsa null döner
poll()	Liste başındaki elemanı alır ve siler	✅	Boşsa null döner
remove(Object o)	İlk eşleşen elemanı siler	✅	Boolean döndürür
removeFirstOccurrence(Object o)	Baştan başlayarak ilk eşleşeni siler	✅	İlk bulduğu elemanı siler
removeLastOccurrence(Object o)	Sondan başlayarak ilk eşleşeni siler	✅	İlk bulduğu elemanı siler
getFirst()	İlk elemanı döndürür, silmez	❌	Boşsa NoSuchElementException
getLast()	Son elemanı döndürür, silmez	❌	Boşsa NoSuchElementExcept



LinkedList<String> list = new LinkedList<>();

list.add("M");
list.add("N");
list.push("O");
list.addFirst("P");
list.addLast("Q");

System.out.println(list.pop());
list.removeFirstOccurrence("N");
System.out.println(list.peek());
list.removeLastOccurrence("M");
System.out.println(list.poll());
System.out.println(list);*/





    }




















}
