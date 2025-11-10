package Kasım7Lambda;

import java.util.function.Function;

public class Interfaces4 {
    public static void main(String[] args) {
        
    
  /*Lambda ifadeleri, fonksiyonel arayüzleri (interface) kullanarak daha temiz ve kısa kod yazmanızı sağlar.
Fonksiyonel arayüzler, lambda ifadelerine bir isim ve yapısal bir çerçeve sağlar.

Consumer, Supplier, Function, ve Predicate Java'da fonksiyonel arayüzlerdir (interface).
Java'da bir arayüzün fonksiyonel arayüz olarak kabul edilmesi için yalnızca
bir tane soyut metoda (abstract) sahip olması gerekmektedir.

Fonksiyonel Arayüz Metotları:

Function<T, R>: apply(), girdi ve çıktı arasında bir dönüşüm veya işlem gerektiriyorsa kullanilir.
    Tek bir girdi alır ve tek bir çıktı üretir
Consumer<T>: accept(), Bir girdi alır ve bir işlem gerçekleştirir, ancak herhangi bir çıktı üretmez.
Supplier<T>: get(), Herhangi bir girdi almadan bir çıktı üretir.
Predicate<T>: test(), Bir girdiyi alır ve bir koşul testi yapar, sonuç olarak true veya false döndürür.*/

    
   Function<Integer,Integer> squaring= x->{
       int result = x*x;
       return  result;
       
   };int result = squaring.apply(5);
        System.out.println("result = " + result);

Function<Integer,Integer> squaring2 = x->x*x;
int res = squaring2.apply(7);
        System.out.println("res = " + res);

int res3 = squaring3.apply(4);
        System.out.println("res3 = " + res3);
    }

public static Function<Integer,Integer> squaring3 = x->x*x;











    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}
