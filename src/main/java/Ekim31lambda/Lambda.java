package Ekim31lambda;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,6,7,9,5,4));
//        çift(nums);
//kareTek(nums);
//tekKüpTekrarsız(nums);
//   çiftKareTekrarsızToplam(nums);
//    tekrarlnmayanÇiftKareÇarpım(nums);
max1(nums);
max2(nums);
max3(nums);
max4(nums);
min1(nums);
min2(nums);
min3(nums);
    }

        //Örnek 4: Bir List<Integer> içindeki tüm çift sayıları bulun ve bu sayıları aynı satırda, aralarında
// bir boşluk olacak şekilde konsola yazdıran bir metod yazınız.(functional)
//Example 4: Find all even numbers in a List<Integer> and write a method that prints these numbers to the
// console on the same line, with a space between them.(functional)
       public static void çift(List<Integer> nums){
      nums.stream().filter(t-> t %2 == 0 ).forEach(t-> System.out.print(t + " "));

       }



//ornek 1: Bir tamsayı listesi alan ve listedeki tek sayıların karelerini, aynı satırda,
// aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
//example 1: Create a method that takes a list of integers and prints the squares of
// the odd numbers in the list on the same line with a space between them.(Functional)



public static void kareTek(List<Integer> nums){

nums.stream().distinct().filter(t-> t % 2 != 0 ).map(t-> t*t).forEach(t-> System.out.print(t + " "));

}


//2) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda, aralarına boşluk
// koyarak yazdıran bir method oluşturunuz.(Functional)
//2) Create a method that prints the cubes of odd numbers in a list of integers, without repeating, on the
// same line, with spaces between them. (Functional)


public static void tekKüpTekrarsız(List<Integer> nums){
  nums.stream().distinct().filter(t->t%2 !=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));
}



//3)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
//3)Create a method that calculates the sum of squares of non-repeating even numbers in a list
//reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
//t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
//u: Ilk elemandir
//(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.


public static void çiftKareTekrarsızToplam(List<Integer> nums){
    Integer a = nums.stream().distinct().filter(t-> t%2 ==0).map(t->t*t).reduce(0, (t,u)-> t+u);
 Integer b = nums.stream().distinct().filter(t-> t%2 ==0).map(t->t*t).reduce(0, Integer::sum);//bu daha sade hali
    System.out.println(a);                                         //     2,3,6,7,9,5,4 AKIŞTAN GELENER U YA ARA TOPLAMLAR VE İLK DEĞER T YE YÜKLENİR
    //t ve u lar için t+u işlemi yap
//        0 başlangıç değeri
}

//4) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan bir method oluşturunuz.
//4) Create a method that calculates the product of the squares of all non-repeating even numbers in a list.

 public static void tekrarlnmayanÇiftKareÇarpım(List<Integer> nums){
      Integer a =  nums.stream().distinct().filter(t-> t % 2 == 0 ).map(t->t*t).reduce(1,(t,u)->t*u);
     System.out.println(a);
 }

//----------------MAX-MİN YAZDIRMA----------------

//5)Verilen List’teki maksimum değeri bulmak için bir method oluşturun.
//5)Create a method to find the maximum value in the given List

//1. Yol

 public static void max1(List<Integer> nums){
     //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)

    Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t > u  ? t : u ) ;
     System.out.println(max);//9

 }

public static void max2(List<Integer> nums){
Integer max = nums.stream().distinct().reduce(nums.get(0),(t,u)-> t > u ? t :u );
    System.out.println(max);//9
}

public static void max3(List<Integer> nums){
//sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)//2,3,4,6,7,9
  Integer max = nums.stream().distinct().sorted().reduce((t,u)-> u ).get();
    System.out.println(max);//9
}


public static void max4(List<Integer> nums){
    //Java'da :: işareti, "Method Reference" olarak adlandırılır.
// Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar

Integer max = nums.stream().distinct().reduce(Math::max).get();
    System.out.println(max);//9




}


//--------------------------------------------------------------------


//6)Verilen List'teki minimum değeri bulmak için bir method oluşturun.
//6)Create a method to find the minimum value in the given List

public static void min1(List<Integer> nums){

        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t>u ? u :t);
    System.out.println(min);//2
        //    2,3,6,7,9,5,4
}

public static void min2(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce(nums.get(0),(t,u)-> t>u ? u: t);
    System.out.println(min);//2
}

public static void min3(List<Integer> nums){
       Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
    System.out.println(min);//2
               //9,7,6,5,4,3,2
}











}
