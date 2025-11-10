package Ekim31lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MentoringOrnekler {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5,-8,-2,-12,0,1,12,5,6,9,15,8));


    }
    // S1:listi aralarinda bosluk birakarak yazdiriniz

public static void print(List<Integer> list){
   list.stream().forEach(t-> System.out.println(t  + " "));
}

    //S2: sadece negatif olanlari yazdir

public static void negative(List<Integer> list){
        list.stream().filter(t-> t<0 ).forEach(t-> System.out.println(t + " "));
}

    //S3: pozitif olanlardan yeni bir liste olustur
public static void positiveNewList(List<Integer> list){
   List<Integer> newList = list.stream().filter(t-> t>0).toList();
    System.out.println(newList);
}


    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
public static void squareList (List<Integer> list){
    List<Integer> newList = list.stream().map(t-> t*t).toList();
    System.out.println(newList);
}


    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim

public static void newListWithDistinct(List<Integer> list){
     List<Integer> newList = list.stream().distinct().map(t->t*t).toList();
    System.out.println(newList);
}

    //S6: listin elemanlarini kucukten buyuge siralayalim
public static void sorted(List<Integer> list){
        list.stream().sorted().forEach(t-> System.out.println(t +" "));

}


    //S7: listin elemanlarini buyukten kucuge siralayalim

public static void sortedComparatorReverseOrder(List<Integer> list){
     list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t + " "));
}

    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
public static void pos(List<Integer> list){
       list.stream().filter(t-> t>0).map(t->t*t*t).filter(t-> t/100 ==5).forEach(t-> System.out.println(t + " "));
}


    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim



    // S10 :list elemanlarini toplamini bulalim



    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim



    // S12 : listeden 5 den buyuk  sayi var mi?



    // S13 : listenin tum elemanlari sifirdan kucuk mu?



    // S14: listenin 100 e esit elemani yok mu ?



    // S15: listenin sifira esit elemani yok mu?



    // S16:  listenin ilk 5 elemanini topla?



    //S17: listenin son bes elemaninin  listele























}
