package Ekim29Exceptons;

public class Exceptions {
    public static void main(String[] args) {

    //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur
String a = "java";
String c = "";
numChar(c);//0
numChar(a);//4
 prAge(-3);

      //  String d = null;
      //  numChar(d);
num(2,null);
//🧩 1️⃣ null = hiçbir şeyi göstermemek
//
//        null, “bu değişken şu anda hiçbir nesneyi göstermiyor” demektir.
//                Yani bir referansın (göstericinin) boş olması.
}

public static void numChar(String a){
      int  b = a.length();
        System.out.println(b);

    }

public static void num(Integer integer,Integer i2){
    try {
        Integer sum = i2+integer;
        System.out.println(sum);
    } catch (NullPointerException e ) {
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}

//6) IllegalArgumentException, bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.

  public static void prAge(int age){

      if (age<0){
          throw new IllegalArgumentException("yaş 0 dan küçük olamaz ");

      }else {
          System.out.println(age);
      }




  }
















}