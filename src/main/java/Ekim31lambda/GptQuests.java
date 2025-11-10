package Ekim31lambda;
/*🔹









        🔹 Seviye 4 – sorted, limit, skip


En büyük 3 sayıyı ekrana yazdır.
En küçük 2 sayıyı ekrana yazdır.
En küçük 3 sayıyı atlayıp geri kalanları yazdır.
🔹 Seviye 5 – Karma Sorular (Gerçek mantık)
Listedeki çift sayıların karelerinden oluşan yeni bir liste döndüren metod oluştur.
Listedeki tek sayıların küplerinden oluşan yeni bir liste döndür.
Listedeki pozitif sayıların toplamının karesini hesapla.
Listedeki çift sayıların toplamının karesinden, tek sayıların toplamını çıkar.
Listedeki en büyük çift sayının karesini bul.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GptQuests {



    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(3,5,6,9,12,2,1,3,5,8,9,-3,-7));
        seviye1(nums);
seviye2(nums);
seviye3(nums);
seviye4(nums);








    }//_------------------------------------------------------
    //    Seviye 1 – Temel Filtreleme & Yazdırma
//
//    Bir List<Integer> içindeki çift sayıları ekrana yazdıran bir metod oluştur.
//    Bir List<Integer> içindeki tek sayıların küplerini aynı satırda, aralarında boşluk olacak şekilde yazdır.
//    Bir List<Integer> içindeki pozitif sayıları yazdır.
//    Bir List<Integer> içindeki negatif sayıları yazdır.
//    Bir List<Integer> içindeki 5’ten büyük sayıların karelerini yazdır.



  public static void  seviye1(List<Integer> nums){
   //çift
      nums.stream().filter(t -> t % 2 == 0).forEach(t-> System.out.print(t + " çift "));
//tek
      System.out.println();
nums.stream().filter(t->t%2!=0).forEach(t-> System.out.print(t + " tek "));
      System.out.println();
//pozitif
 nums.stream().filter(t-> t>0).forEach(t-> System.out.print(t + " pozi "));
      System.out.println();
 //negatif
      nums.stream().filter(t-> t<0).forEach(t-> System.out.print(t +  " nega "));
      System.out.println();
//5’ten büyük sayıların kareleri
      nums.stream().filter(t-> t>5).map(t-> t*t).forEach(t-> System.out.print(t +" 5 ten büyük "));
  }

//🔹 Seviye 2 – map ve distinct Kullanımı





//


public static void seviye2(List<Integer> nums){
    //    Listedeki tekrarlayan sayıları kaldırıp, her birinin karesini yazdır.
  nums.stream().distinct().map(t->t*t).forEach(t-> System.out.print(t + " tekrarsızkare "));
    System.out.println();
    //    Listedeki tekrarlanmayan tek sayıların karelerini yazdır
        nums.stream().distinct().filter(t-> t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " tekrarsız tek kare "));
    System.out.println();
    //    Listedeki çift sayıların karelerinin toplamını bulan bir metod yaz.
Integer sum = nums.stream().distinct().filter(t->t%2 ==0).map(t->t*t).reduce(0,(t,u)->t+u);
    System.out.println(sum + " = toplam ");

    //    Listedeki negatif sayıların mutlak değerlerinin toplamını hesapla.

  Integer sum2 = nums.stream().filter(t->t<0).map(t-> t*-1).reduce(0,(u,t)->u+t);
    System.out.println(sum2);
}


public static void tekKüpOrtalama(List<Integer> nums) {

        // 1️⃣ Sadece tek sayıları seç
        List<Integer> tekler = nums.stream()
                .filter(t -> t % 2 != 0)
                .toList();

        // 2️⃣ Tek sayıların küplerinin toplamını hesapla
        int toplam = tekler.stream()
                .map(t -> t * t * t)
                .reduce(0, Integer::sum);

        // 3️⃣ Eleman sayısını al
        long adet = tekler.size();

        // 4️⃣ Ortalama = toplam / adet
        double ortalama = (double) toplam / adet;

        System.out.println("Tek sayıların küplerinin ortalaması = " + ortalama);
    }



  public static void seviye3(List<Integer> nums){
        System.out.println("----------------------------");
//Listedeki tüm sayıarın toplamını bulan bir metod oluştur.
 Integer sum = nums.stream().reduce(0,(u,t)->u+t);
      System.out.println(sum);
//Listedeki tüm sayıların çarpımını bulan bir metod oluştur.
 Integer def = nums.stream().reduce(1,(u,t)->u*t);
      System.out.println(def);
      //    Listedeki maksimum değeri bul
 Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u  );
 Integer max2 = nums.stream().distinct().reduce(nums.get(0),(t,u)->t>u ? t : u );
 Integer max3 = nums.stream().distinct().reduce(Math::max).get();
 Integer max4 = nums.stream().distinct().sorted().reduce((t,u)-> u).get();
      System.out.println(max + " " + max2 + " " + max3 + " " + max4);
 //    Listedeki minimum değeri bul.
   Integer min = nums.stream().sorted(Comparator.reverseOrder()).reduce((t,u)-> u).get();
   Integer mind = nums.stream().sorted().reduce((t,u)-> t).get();
   Integer min2 = nums.stream().distinct().reduce(Math::min).get();
      System.out.println(mind);

      //    Listedeki çift sayıların karelerinin çarpımını hesapla.

      Integer çarp = nums.stream().distinct().filter(t-> t % 2 == 0 ).map(t-> t*t).reduce(1,(t,u)->t*u);
      System.out.println(çarp);

  }


  public static void seviye4 (List<Integer> nums){
//    Listedeki sayıları küçükten büyüğe sıralayıp yazdır.
//    Listedeki sayıları büyükten küçüğe sıralayıp yazdır.

nums.stream().sorted().forEach(t-> System.out.print(t + " "));
      System.out.println();
nums.stream().distinct().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));







}





















}
