package Ekim24CollectionsQueue;

import java.util.*;

public class ChatGptQuestionsQueue {
    public static void main(String[] args) {

/*

 ✅ BÖLÜM 1 — Queue Çıktı Tahmin Soruları
    Soru 1
    Queue<String> q = new LinkedList<>();
q.add("A");
q.add("B");
q.add("C");
q.remove();
q.peek();
System.out.println(q);
       B C





    Çıktı nedir?

    Soru 2
    Queue<Integer> q = new LinkedList<>();
q.add(10);
q.add(20);
q.add(30);
System.out.println(q.poll());[10]
System.out.println(q.peek());[20]
System.out.println(q);[20 30]
📌 Not: peek() ve poll() sadece sayı döndürür, köşeli parantez olmaz.




    Ekrana ne yazdırılır?

            ✅ BÖLÜM 2 — PriorityQueue Mantık Soruları
    Soru 3
    PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(50);
pq.add(20);
pq.add(40);
pq.add(10);
System.out.println(pq);[50 20 40 10]
System.out.println(pq.poll());[50]
System.out.println(pq);[20 40 10]


    Muhtemel çıktı ne olur?[20 40 10]
    Neden insertion order bozuldu? çünkü polla ilk elemanı sileriz ve prioty queue

            ✅ BÖLÜM 3 — Deque İşlemleri
    Soru 4
    Deque<String> d = new LinkedList<>();
d.add("X");
d.addFirst("Y");
d.addLast("Z");
d.removeFirst();
d.removeLast();
System.out.println(d);


    Çıktıyı yaz.  [X]

    Soru 5 – Çok Adımlı
    Deque<Integer> d = new ArrayDeque<>();
d.addLast(1);
d.addLast(2);
d.addLast(3);
d.removeLast();
d.addFirst(5);
d.removeFirst();
System.out.println(d);


    Çıktı?[12]
    İşlem adımlarını da yaz istersen 😊 123 olur önce sonra 3 s,linir sonra en başa 5 eklenir

            ✅ BÖLÜM 4 — Hata/Yapı Mantığı
    Soru 6
    Queue<String> q = new LinkedList<>();
        q.poll();    // HATA YOK → null döner sadece
        q.element(); // HATA → NoSuchElementException


    Hata var mı? Varsa sebebi?

    Soru 7
    Queue<String> q = new LinkedList<>();
q.clear(); queue zaten boş
System.out.println(q.remove()); ✅ remove() boş kuyrukta:
🚫 null döndürmez
❌ Exception fırlatır → NoSuchElementException

    ------------------------------------------------------------------------------




    Bu satır çalışır mı? Çalışmazsa ne olur?

Soru A (PriorityQueue Karışık)
PriorityQueue<String> pq = new PriorityQueue<>();
pq.add("zeynep");
pq.add("ali");
pq.add("mehmet");
pq.add("ahmet");
System.out.println(pq.poll()); ilk eleman neyse o gelir mesela ahmet
System.out.println(pq);zeynep silinr kalan elemanlar gelir ahmet gider mesela kalanlar nuraya gelir


Çıktıyı tahmin et

Soru B (Deque Trick)
Deque<Integer> d = new ArrayDeque<>();
d.offerFirst(1);
d.offerLast(2);
d.offerFirst(3);
d.pollLast();
d.pollFirst();
System.out.println(d);
[1]

Son durum?

Soru C (Queue exception testi)
Queue<Integer> q = new LinkedList<>();
System.out.println(q.peek());burda null
System.out.println(q.remove()); burda excepton


İki satırın davranışını açıkla

Soru D – PriorityQueue + poll + offer
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(8);
pq.offer(2);
pq.offer(5);
pq.offer(1);
pq.poll();
pq.offer(0);
System.out.println(pq.poll());[0]
System.out.println(pq);258


1️⃣ İlk satır ne basılır?
2️⃣ Queue’nin son hali ne olur?


SEVİYE 3 – Karma Kullanım Sorusu
Queue<Integer> q = new LinkedList<>();
q.add(3);
q.add(1);
q.add(4);
System.out.println(q.remove()); 3
System.out.println(q.peek());1
System.out.println(q);[1,4]

PriorityQueue<Integer> pq = new PriorityQueue<>(q);
pq.offer(0);
System.out.println(pq.poll()); 0
System.out.println(pq);[1,4]

Deque<Integer> d = new ArrayDeque<>(pq);
d.addFirst(9);
d.removeLast();
System.out.println(d);[9,1]


Sorular:
1️⃣ İlk println ne yazar?
2️⃣ Queue'nin ilk kısmından sonraki iki satırın çıktısı?
3️⃣ PriorityQueue’den çıkan sayı?
4️⃣ En sonda Deque’nin durumu nedir?


Senaryo 1 — Sinema Kuyruğu (Queue)

Bir sinema salonunda insanlar bilet almak için sıraya giriyor.
Sıra FIFO mantığıyla çalışıyor (ilk gelen ilk çıkar).

Senaryo 1 — Sinema Kuyruğu (Queue)

Bir sinema salonunda insanlar bilet almak için sıraya giriyor.
İnsanlar: "Ali", "Ayşe", "Mehmet", "Zeynep"
FIFO mantığıyla çalışıyor (ilk gelen ilk çıkar)
Görevler:
Sıraya elemanları ekle
İlk kişinin sıradan çıkmasını sağla
Sıradaki kişiyi ekrana yazdır
Son durumda sıradaki tüm kişileri ekrana yazdır
Sen bunu kodla, çıktıyı da tahmin et.

*/




        Queue<String> queue = new LinkedList<>();
        queue.add("Ali");
        queue.add("Ayşe");
        queue.add("Mehmet");
        queue.add("Zeynep");
        queue.poll();
        System.out.println(queue);

//        [Ayşe,Mehmet, Zeynep]















/*


Senaryo 2 — Hastane Acil Servis (PriorityQueue)

Hastalar öncelik sırasına göre muayene ediliyor.

Alfabetik sıraya göre öncelik var (A → Z)

Hastalar: "Zeynep", "Ali", "Mehmet", ""Mehmet""

Görevler:

PriorityQueue oluştur ve hastaları ekle

Önceliği en yüksek hastayı çıkar ve ekrana yazdır

Kalan hastaları ekrana yazdır

Yeni hasta "AA" geldiğinde tekrar poll yap ve çıktıyı yazdır

Sen bunu kodla ve çıktılarını tahmin et.*/
        PriorityQueue<String> hastane = new PriorityQueue<>();
        hastane.add("Zeynep");
        hastane.add("Ali");
        hastane.add("Mehmet");
        hastane.add("Ahmet");

        System.out.println(hastane.poll());
        System.out.println(hastane);
hastane.add("AA");
hastane.poll();
        System.out.println(hastane);

      /*  Senaryo 3 — Çift Uçlu Kasa (Deque)

Bir market kasasında müşteriler hem baştan hem sondan eklenebiliyor.

Başta: [10, 20]

Önce başa bir müşteri ekleniyor: 5

Sondan bir müşteri çıkarılıyor

Başına tekrar bir müşteri ekleniyor: 1

Deque’nin son halini görmek istiyoruz

Senaryo görevin:

Deque’nin son hali nedir?[1, 5 ,10]

Eğer sondan bir müşteri çıkarılırsa kim çıkar?

Eğer baştan bir müşteri çıkarılırsa kim çıkar?*/



 Deque<Integer> deque = new ArrayDeque<>();
 deque.add(10);
 deque.add(20);
        deque.addFirst(5);
        deque.removeLast();
        deque.addFirst(1);



























        /*

Senaryo 4 — Karma Senaryo

Queue’ye [4, 2, 6] ekle

PriorityQueue bu Queue ile oluşturulsun, sonra 1 ekle

Deque bu PriorityQueue ile oluşturulsun

Başına 10 ekle, sondan bir eleman çıkar

Görevler:

Queue, PriorityQueue ve Deque’yi oluştur

Tüm ekleme/çıkarma işlemlerini uygula

Son durumu ekrana yazdır

Sen bunu kodla ve çıktıyı tahmin et.


*/
Queue<Integer> queue1 = new LinkedList<>();
queue1.add(4);
queue1.add(2);
queue1.add(6);
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(queue1);
priorityQueue.add(1);
Deque<Integer> deque1 = new ArrayDeque<>(priorityQueue);
deque1.addFirst(10);
deque1.removeLast();
        System.out.println(deque1);//  10 1 2 4

     /*   Senaryo 1 — Havalimanı Check-in

        Havalimanında yolcular bilet kontrolü için sıraya giriyor. Bazıları öncelikli yolcu, bazıları normal yolcu.
        Görevler:
        Yolcular sıraya giriyor: "Ali", "Ayşe", "Mehmet", "Zeynep"
        İlk yolcunun sıradan çıkmasını sağla
        Öncelikli yolcular ekleniyor: "AA", "Ahmet"
        En öncelikli yolcuyu sıradan çıkar ve ekrana yazdır
        Bazı yolcular baştan veya sondan ekleniyor/çıkarılıyor
        Son durumda sıradaki tüm yolcuları ekrana yazdır
        Sen: hangi veri yapısını kullanacağını seç, kodu yaz ve çıktıyı tahmin et.*/

Queue<String> sıra = new LinkedList<>();
        sıra.add("Ali");
        sıra.add("Ayşe");
        sıra.add("Mehmet");
        sıra.add("Zeynep");
        sıra.remove();
        PriorityQueue<String> öncelikli = new PriorityQueue<>(sıra);
        öncelikli.add("AA");
        öncelikli.add("Ahmet");
        System.out.println(öncelikli.poll());
   Deque<String> başSon = new ArrayDeque<>(öncelikli);
   başSon.addFirst("Hasan");
   başSon.removeLast();
   başSon.removeFirst();
        System.out.println(başSon);// [Ali,Ayşe,Mehmet]



              /*  Senaryo 2 — Hastane Acil + Normal Hasta

        Hastanede hem normal hem de acil hastalar var.
        Görevler:
        Normal hastalar sıraya giriyor: [4, 2, 6, 1]
        Acil hastalar ekleniyor: 0
        Hastalar baştan veya sondan alınıyor
        Son durumda sıradaki hastaları ekrana yazdır
        Sen veri yapısını seç, ekleme/çıkarma mantığını uygula ve kodu yaz.
 .*/


Queue<Integer> normal = new LinkedList<>();
normal.add(4);
normal.add(2);
normal.add(6);
normal.add(1);
PriorityQueue<Integer> önce = new PriorityQueue<>(normal);
önce.add(0);
Deque<Integer> b = new ArrayDeque<>(önce);
        System.out.println(b);



       /* Senaryo 3 — Market Kasası
        Markette müşteriler hem normal sıraya giriyor hem VIP müşteriler var.
        Görevler:
        Normal müşteriler: [5, 10, 15]
        VIP müşteriler: [20, 1, 10]
        Bazı müşteriler baştan veya sndan ekleniyor/çıkarılıyor
        Son durumda kasadaki tüm müşterileri ekrana yazdır
        Sen hangi veri yapısını kullanacağını belirle, kodu yaz ve sonucu tahmin et.*/



  Queue<Integer> market = new LinkedList<>();
  market.add(5);
  market.add(10);
  market.add(15);

  PriorityQueue<Integer> vip = new PriorityQueue<>(market);
    vip.add(1);
    vip.add(20);
    vip.add(10);
  Deque<Integer> baş = new ArrayDeque<>(vip);
  baş.addFirst(2);
  baş.addFirst(7);
        baş.addLast(4);
        baş.removeFirst();
        System.out.println(baş);//[2 ,1, ,10, 20,  5, 10, 15, 4]










    }




}
