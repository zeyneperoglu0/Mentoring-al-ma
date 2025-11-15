package Kasım15;

import D19OOP.GetSetÖrnBankAccount;

import java.util.stream.IntStream;

public class LambdaLoops {
    public static void main(String[] args) {
a();
sum();
b();
c(3,6);
    d();
    e();
    f();
        g();
        p();
        o();
        w();

    }




    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)
public static void a() {
   IntStream.range(1,30).forEach(t-> System.out.println(t + " "));
}
    //S2 1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)
    public static void b() {
        IntStream.rangeClosed(1,30).forEach(t-> System.out.println(t +" "));
    }
    //S3 Istenen iki deger(dahi) arasindaki sayilari toplayalim
public static void sum (){
      int aum =  IntStream.rangeClosed(1,7).sum();
    System.out.println(aum);
}

    //S4: 30 ile 40 arasindaki sayilarin (dahi) ortalamasini bulalim
public static void c(int a , int b ){
      double sum =  IntStream.rangeClosed(a,b).sum();
long c = IntStream.rangeClosed(a,b).count();
    System.out.println(sum/c);
    int temp = a;
    a=b;
    b=temp;
//    double avg = IntStream.rangeClosed(a,b).average().getAsDouble();
//    System.out.println(avg);
}

    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?
    public static void d( ){
       long a =  IntStream.rangeClosed(325,468).filter(t->t%8==0).count();
        System.out.println(a);
    }
    //S6: 325 ile 468 arasinda 8 bolunen sayilari yazdiralim
public static void e (){
        IntStream.rangeClosed(325,468).filter(t->t%8==0).forEach(System.out::println);
}

    // S7:325 ile 468 arasinda 8 bolunen sayilarin toplamini bulalim
    public static void f () {
  int a =      IntStream.rangeClosed(325, 468).filter(t -> t % 8 == 0).sum();
        System.out.println(a);
    }
    // S8: 7ile 15 arasindaki tek sayilarin carpimini bulalim
public static void g (){
      int A =  IntStream.rangeClosed(7,15).filter(t->t%2!=0).reduce(Math::multiplyExact).getAsInt();
    System.out.println(A);
}

    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim
public static void  p (){
        IntStream.iterate(1,t->t+2).limit(10).forEach(t-> System.out.print( t + " "));
    }

    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim
public static void o(){
        IntStream.iterate(21,t->t+7).filter(t->t%2!=0).limit(10).forEach(t-> System.out.print(t + " "));
}


    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
    public static void w(){
     int a=   IntStream.iterate(21,t->t+7).limit(20).sum();
        System.out.println(a);
    }

}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belilioruz

