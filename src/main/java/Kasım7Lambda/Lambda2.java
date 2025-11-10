package Kasım7Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda2 {
    public static void main(String[] args) {

        System.out.println("result = " + getSumFromSeventoSeventy());
        System.out.println("getMultiplicationFromThreeToNine1() = " + getMultiplicationFromThreeToNine1());
        System.out.println("getMultiplicationFromThreeToNine2() = " + getMultiplicationFromThreeToNine2());
        System.out.println("getFactorial(0) = " + getFactorial(0));
        System.out.println("getFactorial(-12) = " + getFactorial(-12));
        System.out.println("getFactorial(2) = " + getFactorial(2));
        System.out.println("getSumsOfBetweenTwoInteger = " + getSumsOfBetweenTwoInteger(25, 17));
    }


    //1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    //1) Write the code that returns the sum of all integers from 7 to 70
/*
a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream'de var)
b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
temsil eden bir akış oluşturur.
c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
temsil eden bir akış oluşturur.
d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
*/
    public static int getSumFromSeventoSeventy(){

//      return  IntStream.rangeClosed(7,70).sum();
return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();

    }



//2)  3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
//2) Create a method that multiplies all integers from 3 to 9.

//multiplyExact - İki int veya long değerini çarpar. Math class’tadir

    public static int getMultiplicationFromThreeToNine1(){


        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();

    }
    public static int getMultiplicationFromThreeToNine2(){


        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();

    }


 /*   Math sınıfındaki tüm "Exact" metotlar sadece int ve long türleri için tanımlanmıştır.

            🔍 Detaylı açıklama:
            ✅ Math sınıfında “exact” olan metotlar:

    Hepsi int ve long parametrelerle aşırı yüklenmiştir (overloaded).
    Başka türler (float, double, short, byte) için versiyonları yoktur.

// int için
            Math.addExact(int x, int y)
            Math.subtractExact(int x, int y)
            Math.multiplyExact(int x, int y)
            Math.incrementExact(int a)
            Math.decrementExact(int a)
            Math.negateExact(int a)

// long için
            Math.addExact(long x, long y)
            Math.subtractExact(long x, long y)
            Math.multiplyExact(long x, long y)
            Math.incrementExact(long a)
            Math.decrementExact(long a)
            Math.negateExact(long a)
            Math.toIntExact(long a)

            ❌ Neden float veya double için yok?

    Çünkü float ve double kayan noktalı (floating point) türlerdir — bunlarda taşma (overflow) farklı davranır.

    int ve long tamsayıdır → sınır aşıldığında overflow hatası oluşabilir.

    float ve double → sınır aşıldığında Infinity veya NaN döner (istisna fırlatmaz).

    Dolayısıyla Math.addExact() gibi taşma kontrolü yapan metotlar sadece tamsayı tipleri (int, long) için anlamlıdır.



*/


//3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
//3)Write the code that calculates the factorial of the given number.

//3! = 1 * 2 * 3 = 6
//0! = 1
//Negatif sayıların faktöriyeli yoktur


    public static int getFactorial(int x){

     if (x==0){
         return 1;
     } else if (x<0) {
         System.out.println("Geçersiz data girdiniz");
         return -1;
     }else {
         return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();



     }}

//4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
//baslangic ve bitis dahil degil.
//4)Write the code that gives you the sum of all even numbers between two given integers.
//beginning and ending are not included.

//sum metodu, IntStream üzerindeki tüm elemanların toplamını hesaplar ve bu toplamı döndürür.


    public static int getSumsOfBetweenTwoInteger(int a , int b ) {

 if (a>b){
     int temp = a;
     a=b;
     b=temp;
 }
 return  IntStream.range(a+1,b).filter(t->t%2==0).reduce(Math::addExact).getAsInt();


    }


}


