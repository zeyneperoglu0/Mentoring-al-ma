package Ekim24CollectionsQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

//---------------------
    //Queue nasil olusturulur?

//Java'da Queue bir arayüz(interface) olduğu için doğrudan bir Queue nesnesi oluşturulamaz.
// Bunun yerine, Queue arayüzünü implemente eden bir sınıfın nesnesini oluşturmanız gerekir.
//Bunu yapan yaygın sınıflardan biri LinkedList'tir.
//PriorityQueue ve ArrayDeque de olabilirdi

Queue<String> storage = new LinkedList<>();
storage.add("ekmek");
storage.add("et");
storage.add("yumurta");
storage.add("süt");

        System.out.println(storage);//[ekmek, et, yumurta, süt] FIFO

//2) remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. boşsa exception

        System.out.println(storage.remove());//ekmek
        System.out.println(storage);//[et, yumurta, süt] ekmek kalktı

//3)peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.

        System.out.println(storage.peek());//et
        System.out.println(storage);//[et, yumurta, süt] et kalkmaz listeden  burda

//4)clear() metodu, kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.

       // storage.clear();
        System.out.println(storage);//[]

//5)poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner.
        System.out.println(storage.poll());//et
        System.out.println(storage);//[yumurta, süt]

//6)element(): Kuyruğun başındaki öğeyi döndürür, ancak kuyruk boşsa bir istisna fırlatır.

        System.out.println(storage.element());//yumurta
        System.out.println(storage);//[yumurta, süt]

// PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri


//-------------------------
//Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
// ve çıkartmaya izin veren bir veri yapısıdır.

// Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.
//---------------Deque nasil olusturulur?

        Deque<String> deque = new LinkedList<>();

deque.add("ahmet");
deque.add("mehmet");
deque.add("Hasan");

        System.out.println(deque);//[ahmet, mehmet] ==> insertion order

//sağ taraf arraydeque olsaydı???

//2) addFirst(E e): Deque’in başına bir öğe ekler. Dönüş türü void’dir çünkü
// sadece eklemeyi gerçekleştirir ve değer döndürmez.

        deque.addFirst("Hüseyin");
        deque.addLast("Hasan");
        System.out.println(deque);

//3) addLast(E e): Deque’nin sonuna bir öğe ekler. Dönüş türü yine void’dir.
        deque.addLast("Hasan");
        System.out.println(deque);


        //4)removeFirst(): Deque'nin başındaki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
// Bu method E türünde bir değer döndürür.(Burda String)

System.out.println(deque.removeFirst());//Hüseyin
        System.out.println(deque);//[ahmet, mehmet, Hasan, Hasan, Hasan]

        System.out.println("---------------------------");
//ArrayDeque, Java'da çift yönlü kuyruk (double-ended queue) yapısını temsil eder (verilerini bir dizi (array) içinde saklar) ve Deque arayüzünü uygular.
// Bu yapı, hem baştan hem sondan ekleme ve çıkarma işlemlerine izin verir.
// ArrayDeque, LinkedList'e kıyasla daha yüksek performans sunar çünkü içerikleri için dizi tabanlı
// bir yapı kullanır.ArrayDeque, başta ve sonda hızlı ekleme/çıkarma işlemleri için idealdir.


ArrayDeque<String> s = new ArrayDeque<>();
        s.addFirst("a");
s.addLast("h");

s.removeFirst();
s.removeLast();
        System.out.println(s);


















    }







}
