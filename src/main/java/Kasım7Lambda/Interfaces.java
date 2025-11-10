package Kasım7Lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Interfaces {
    public static void main(String[] args) {
/*
        1️⃣ Consumer – Elemanları yazdır

        Bir List<Integer> içindeki elemanları ayrı satırlarda konsola yazdıran bir Consumer fonksiyonu tanımla.

// 1 2 3 4 5*/
    }

    public static void printListWithConsumer(List<Integer> list) {
        Consumer<Integer> integerConsumer = x -> System.out.println(x);
        list.forEach(integerConsumer);
    }

    /*
            2️⃣ Consumer – Elemanların karesini yazdır

            Bir List<Integer>’daki her elemanın karesini ekrana yazdıran Consumer fonksiyonunu yaz.

    // Örnek: [2, 4, 6] → 4 16 36*/
    public static void printSquareWithConsumer(List<Integer> list) {
        Consumer<Integer> consumer = x -> System.out.println(x);
        list.stream().map(t -> t * t).forEach(consumer);
    }

    /*
            3️⃣ Predicate – Çift sayıları filtrele

            Bir Predicate<Integer> kullanarak bir listedeki çift sayıları süz ve yeni bir liste olarak döndür.

    // Örnek: [1,2,3,4,5,6] → [2,4,6]*/
    public static List<Integer> getEvenNumbers(List<Integer> list) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> evens = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evens);
        return evens;
    }

    /*
            4️⃣ Predicate – Uzunluğu 5’ten büyük kelimeleri yazdır

            Bir List<String> içinde karakter sayısı 5’ten fazla olan kelimeleri yazdıran bir Predicate kullan.

    // Örnek: ["Ali","Mustafa","Elif"] → Mustafa*/
    public static void printWordsLongerThanFive(List<String> words) {
        Predicate<String> stringPredicate = x -> x.length() > 5;
        words.stream().filter(stringPredicate).forEach(t -> System.out.println(t));
    }

    /* 5️⃣ Function – Sayının küpünü döndür

     Bir Function<Integer, Integer> yazarak verilen sayının küpünü döndüren methodu tamamla.

// Örnek: input = 3 → output = 27*/
    public static int getCube(int number) {
        Function<Integer, Integer> cubeFunction = x -> x * x * x;
        int res = cubeFunction.apply(number);
        System.out.println("res = " + res);
        return res;
    }

    /*6️⃣ Function – Kelimenin uzunluğunu hesapla

    Bir Function<String, Integer> yazarak bir kelimenin uzunluğunu hesapla ve sonucu döndür.

// Örnek: "Lambda" → 6*/
    public static int getLengthOfWord(String word) {
        Function<String, Integer> convert = x -> x.length();
        int res = convert.apply(word);

        return res;
    }

    /*       7️⃣ Supplier – Rastgele sayı üret

           Bir Supplier<Integer> yazarak 1 ile 100 arasında rastgele bir sayı döndüren method yaz.

   // Örnek çıktı: 73*/
    public static int getRandomNumber() {
        Supplier<Integer> Random = () ->(int) (Math.random()*100)+1;
        System.out.println("Random.get() = " + Random.get());

        return Random.get();
    }

    /*8️⃣ Supplier – Sabit bir mesaj döndür

    Bir Supplier<String> oluştur ve çağrıldığında "Java Lambda Rocks!" mesajını döndürsün.
*/
    public static String getMessage() {
        Supplier<String> rndMessage = () -> "Java Lambda Rocks!";
        System.out.println("rndMessage.get() = " + rndMessage.get());
        return rndMessage.get();


    }

    /*
            9️⃣ Kombinasyon: Predicate + Function + Consumer

            Bir sayı listesi al:

            Predicate ile sadece pozitif sayıları seç,
    Predicate
            Function ile bu sayıların karesini al,

            Consumer ile sonucu ekrana yazdır.

    // Örnek: [2, -3, 4] → 4 16*/
    public static void processNumbers(List<Integer> list) {
        Predicate<Integer> integerPredicate = x -> x > 0;
        Function<Integer, Integer> kare = x -> x * x;
        Consumer<Integer> print = System.out::println;
        list.stream().filter(integerPredicate).map(kare).forEach(print);
    }
        /*
🔟 Kombinasyon: Supplier + Predicate

        Bir> ile rastgele sayılar üret.
 Supplier<Integer
                Predicate<Integer> ile sadece çift sayıları kabul et.

        Kabul edilen sayıyı yazdır.*/

    public static void printRandomEvenNumber() {
        Supplier<Integer> rnd = () -> (int)(Math.random() * 100);
        Predicate<Integer> even = x -> x % 2 == 0;
        System.out.println("even = " + even);

    }

    /*
    🧩 BONUS — Zorlayıcı (Mülakat Tipi)
    “Fonksiyon Zinciri (Function Chaining)”

            Bir sayının karesini alıp 2 ile çarpan iki Function tanımla.
                    Bunları andThen() metodu ile birleştirip sonucu döndür.

    // Örnek: input = 3 → (3*3)*2 = 18*/
    public static int applySquareAndDouble(int number) {
Function<Integer,Integer>sqrt = x->x*x;
Function<Integer,Integer>mulTwo = x->x*2;


  return sqrt.andThen(mulTwo).apply(number);  }

}