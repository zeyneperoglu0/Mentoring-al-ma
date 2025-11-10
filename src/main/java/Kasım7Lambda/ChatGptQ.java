package Kasım7Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChatGptQ {
    public static void main(String[] args) {

List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("getSumOfSquareOfDistinctEven(nums) = " + getSumOfSquareOfDistinctEven(nums));


    }
/*

1️⃣ Tek sayıların karelerini yazdır

    Bir List<Integer> içindeki tek sayıların karelerini aynı satırda, aralarında boşluk olacak şekilde yazdıran bir method yaz.

    // Beklenen çıktı: 9 25 121
    public static void printSquareOfOddNumbers(List<Integer> nums) {

    }*/


    public static void printSquareOfOddNumbers(List<Integer> nums) {

        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " "));
    }


/*
2️⃣ Benzersiz çift sayıların karelerinin toplamını bul

    Bir listedeki tekrarsız (distinct) çift sayıların karelerinin toplamını bulan methodu yaz.

    // Örnek: [2,3,4,5,11,10,14] → 4² + 10² + 14² = 16 + 100 + 196 = 312*/
    public static int getSumOfSquareOfDistinctEven(List<Integer> nums) {


        return nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(Math::addExact).get();


    }
/*
3️⃣ Listedeki maksimum değeri bul (3 farklı yolla)

    Bir listedeki en büyük değeri 3 farklı yöntemle bulan methodları yaz.
            (a) reduce()
(b) sorted()
(c) Math::max


    public static int getMax2(List<Integer> nums) {

    }
    public static int getMax3(List<Integer> nums) {

    }*/

    public static int getMax1(List<Integer> nums) {
return nums.stream().max(Math:: max).get();

    }





    /*

4️⃣ “E” ile başlamayan kelimeleri yazdır

    Bir List<String> içindeki “E” harfiyle başlamayan tüm öğeleri konsola yazdıran methodu yaz.
*/
    public static void printElementsExceptStartsWithE(List<String> list) {
list.stream().filter(t->!t.startsWith("E")).forEach(t-> System.out.println(t));
    }
/*
5️⃣ Karakter sayısı 5’ten fazla olan kelimeleri büyük harfe çevirip liste döndür

    Bir List<String> içindeki 5’ten uzun kelimeleri büyük harfe çeviren ve liste olarak döndüren methodu yaz.
*/
    public static List<String> getElementsLengthMoreThanFiveUpper(List<String> list) {
List<String> list2 = list.stream().filter(t->t.length()>5).map(t-> t.toUpperCase()).collect(Collectors.toList());
return list2;
    }
/*
6️⃣ Benzersiz elemanları küçük harfe çevirip uzunluğa göre sırala

    Tüm elemanları benzersiz hale getir, küçük harfe çevir ve karakter uzunluğuna göre küçükten büyüğe sırala.
*/
    public static void printUniqueLowerSortedByLength(List<String> list) {
list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.comparing(String::length)).forEach(t-> System.out.println(t));
    }
/*
7️⃣ 7’den büyük en küçük çift sayıyı bul

    Bir List<Integer> içindeki 7’den büyük en küçük çift sayıyı bulan methodu yaz.
            findFirst() kullan.
*/
    public static void getMinEvenGreaterThanSeven(List<Integer> nums) {
nums.stream().filter(t-> t>7 &&  t%2==0 ).sorted().findFirst();

    }
/*
8️⃣ 3’ten 9’a kadar sayıların çarpımını bul (IntStream)

IntStream.rangeClosed() kullanarak 3’ten 9’a kadar olan sayıların çarpımını bulan bir method yaz.
*/
    public static int multiplyFromThreeToNine() {
return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();

    }
/*
9️⃣ Karakter sayısı 5’ten fazla olanları sil

    Bir List<String> içinden karakter sayısı 5’ten fazla olanları silen bir method yaz (removeIf kullan).
*/


    public static void removeIfLengthGreaterThanFive(List<String> list) {
list.removeIf(t->t.length()>5);
        System.out.println(list);
    }
/*
🔟 “Z” ile başlayan veya “f” ile bitenleri sil

    Bir List<String> içinden ‘Z’ ile başlayan veya ‘f’ ile biten kelimeleri silen methodu yaz.
*/
    public static void removeIfStartsWithZorEndsWithF(List<String> list) {
list.removeIf(t-> t.startsWith("Z")|| t.endsWith("f"));

    }
/*
🧮 BONUS: 7–70 arası sayıların toplamını bul (IntStream)

IntStream.rangeClosed() kullanarak 7’den 70’e kadar sayıların toplamını bulan bir method yaz.
*/
    public static int sumFromSevenToSeventy() {
return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();

    }














}
