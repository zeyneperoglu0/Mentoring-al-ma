package Kasım7Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10,14));
        yediBüyükEnKüçükÇift(nums);
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        printElementsExceptStartsWithE(myList);
        printNonRepeative(myList);
       distinctKüçükUzunluğaGöreKüçüktenBSır(myList);
        removeIfLengthGreaterThanFive(myList);
        removeIfElementsContainsX(myList);
        removeIfElementsStartsWithZorEndsWithf1(myList);
    removeIfElementsStartsWithZorEndsWithf2(myList);
    distinctKüçükUzunluğaGöreKüçüktenBSır(myList);
    getElementLengthMoreThanFiveWithUpperCase(myList);
    benzersiz5tenAzKüçükHarf(myList);
    benzersizAlfabetikSıraBüyükHarf(myList);
    printElUniqueLowerCaseSortWithLength(myList);

    }

//7) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
//2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi

    //findFirst(): Sıralı akışta bulunan ilk elemanı (yani bu senaryo da en küçük elemanı) alır.
// Bu işlem bir Optional döndürür, çünkü akışta hiç eleman kalmamış olabilir
// (filtreleme nedeniyle veya başka bir sebepten dolayı)
    public static void yediBüyükEnKüçükÇift(List<Integer> nums){
      int a =  nums.stream().filter(t->t>7 &&  t %2==0).sorted().findFirst().get();
        System.out.println(a);
        int min = nums.stream().filter(t->t>7&& t%2==0).sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }
//-------------------
//ornek 1: Bir listedeki "E" harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.
//example 1: Create a method that prints to the console all items in a list that do not start with the letter "E".

    public static void printElementsExceptStartsWithE(List<String> myList){
        myList.stream().filter(t->!t.startsWith("E")).forEach(t-> System.out.println(t));
        System.out.println("------------------------------------");
    }

    //
//ornek 2: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz (tekrarsız) elemanları konsola yazdıran bir metod yazınız.
//example 2: Write a method that prints all unique (non-repetitive) elements with less than 5 characters in a List<String> to the console.

    public static void printNonRepeative(List<String> myList){
        myList.stream().distinct().filter(t->t.length()<5).forEach(System.out::println);
        System.out.println("------------------------------------");
    }
//-------------------
//-------------------
//Örnek 3:Bir List<String> içinde karakter sayısı 5'ten fazla olan tüm elemanları büyük harfe çevirip, bu elemanları yeni bir liste olarak döndüren bir metod yazınız.
//Example 3:Write a method that converts all elements with more than 5 characters in a List<String> to uppercase and returns these elements as a new list.

 public static void getElementLengthMoreThanFiveWithUpperCase(List<String> myList){
myList.stream().filter(t->t.length()>5).map(String::toUpperCase).forEach(System.out::println);
    }



//-------------------
//Örnek 4:Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz elemanları
// küçük harflere çevirip doğal sıralamaya göre konsola yazdıran bir metod yazınız.
//Example 4: Write a method that converts all unique elements with less than 5 characters
// in a List<String> to lowercase letters and prints them to the console according to their natural order.

public static void benzersiz5tenAzKüçükHarf(List<String>myList){
        myList.stream().distinct().filter(t-> t.length()<5).map(String::toLowerCase).forEach(System.out::println);
}



    //-------------------
//Örnek 5:Bir List<String> içindeki tüm elemanları benzersiz hale getirip, büyük harflere dönüştürdükten
// sonra alfabetik sıraya göre konsola yazdıran bir metod yazınız.
//Example 5: Write a method that makes all the elements in a List<String> unique,
// converts them to uppercase letters, and prints them to the console in alphabetical order.

public static void benzersizAlfabetikSıraBüyükHarf(List<String>myList){
   myList.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.println(t + " "));

}





//-------------------
//Örnek 6:Bir List<String> içindeki tüm elemanları önce benzersiz hale getirin, ardından küçük harflere çevirin
// ve elemanların uzunluklarına göre küçükten büyüğe sıralayarak konsola yazdıran bir metod yazınız.
//Example 6: First make all the elements in a List<String> unique, then convert them to lowercase letters and write
// a method that sorts the elements from smallest to largest according to their length and prints them to the console.

public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
   myList.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.comparing(t-> t.length())).forEach(t-> System.out.print(t + " "));
//   ali elif yusuf zeynep mustafa
//
}
public static void distinctKüçükUzunluğaGöreKüçüktenBSır(List<String>myList){

        myList.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.comparing(String::length).reversed().reversed()).forEach(t-> System.out.print(t + " " ));

}
//-----------------------------
    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    //1) Create a method that deletes elements with more than 5 characters.

    public static void removeIfLengthGreaterThanFive(List<String> myList) {
myList.removeIf(t->t.length()>5);
        System.out.println(myList);
    }
        //-----------------------------
        //2) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.
        //2) Create a method that deletes elements that start with 'Z' or end with 'f'.

        //1.yol:

        public static void removeIfElementsStartsWithZorEndsWithf1(List<String> myList) {
        myList.removeIf(t->t.startsWith("Z") || t.endsWith("f"));
            System.out.println(myList);
        }
            //2.yol:

            public static void removeIfElementsStartsWithZorEndsWithf2(List<String> myList) {
          myList.removeIf(t->t.charAt(0) == 'Z' ||t.charAt(t.length()-1) == 'f');
                System.out.println(myList);

            }
                //-----------------------------
                //3 ) "X" karakteri iceren elemanları silen bir method oluşturun.
                //3 ) Create a method that deletes elements containing the "X" character.

                public static void removeIfElementsContainsX(List<String> myList) {

        myList.removeIf(t->t.contains("X"));
                    System.out.println(myList);
                }
}
