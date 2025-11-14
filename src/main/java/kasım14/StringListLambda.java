package kasım14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListLambda {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("LOldu");
//starPrint(list);
//sortedAlphPrintList(list);
//removeL(list);
//containsEList(list);
////        üçtekrart(list);
//        ilkbuyukt(list);
//        uzunluk4ve6olmyanlıst(list);
        fircOrd(list);
    }

    // S1: ilk harfi d ve ya c olanlari listeleyelim
    public static void fircOrd(List<String> list) {
List<String> a = list.stream().
        filter(t->String.valueOf(t.charAt(0)).equalsIgnoreCase("d") ||String.valueOf(t.charAt(0)).equalsIgnoreCase("c")).
        toList();
        System.out.println(a);
    }

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void starPrint(List<String> list) {
        list.stream().forEach(t -> System.out.println("* " + t));
    }

    //S3: alfabedik  gore siralayalim list olarak
    public static void sortedAlphPrintList(List<String> list) {
        List<String> b = list.stream().sorted().collect(Collectors.toList());
        System.out.println(b);
    }

    //S4: tum 'l' leri silelim yazdiralim
    public static void removeL(List<String> list) {

        list.stream().map(t -> t.replaceAll("[Ll]", "")).forEach(t -> System.out.println(t));//büyük l küçük l fark etmez siler
    }
    //S5 : icinde e olanlardan yeni bir list olusturunuz

    public static void containsEList(List<String> list) {
        List<String> eiçeren = list.stream().filter(t -> t.contains("e") || t.contains("E")).toList();
        System.out.println(eiçeren);
    }


    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    public static void üçtekrart(List<String> list) {

        list.stream().map(t -> t.charAt(0) + "" + t.charAt(0) + t).forEach(t -> System.out.println(t + " "));
//        list.stream().map(t -> String.valueOf(t.charAt(0)).repeat(3) + t

    }


    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    public static void ilkbuyukt(List<String> list) {
        list.stream().map(t -> String.valueOf(t.charAt(0)).toUpperCase() + t.substring(1)).forEach(t -> System.out.println(t));
    }

    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
    public static void uzunluk4ve6olmyanlıst(List<String> list) {

List<String> b = list.stream().filter(t->t.length()!=4 &&t.length()!=6  ).toList();
        System.out.println(b);
    }


}



