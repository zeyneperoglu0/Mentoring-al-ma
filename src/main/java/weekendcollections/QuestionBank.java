package weekendcollections;

import java.util.*;

public class QuestionBank {
    public static void main(String[] args) {
      /*  1) B!r l!stede kaç farklı öge oldugunu gösteren kodu yazınız.
                Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4*/


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(31);
        list.add(15);
        list.add(7);
        list.add(15);
        list.add(7);
        list.add(7);

        Set<Integer> listTekrarsız = new HashSet<>(list);
        System.out.println(listTekrarsız.size());


  //      2) Set ve L!ste arasındak! ortak ögeler! yazdırmak !ç!n kod yazınız.
Set<Integer> number = new HashSet<>(Arrays.asList(1,2,3,4,5,1,4,6));
        LinkedList<Integer> num =  new LinkedList<>(Arrays.asList(1,2,3,9,7,8,456));

        System.out.println(number.retainAll(num));
        System.out.println(number);


      /*  B!r Str!ng’ de kullanılan farklı karakterler! yazdırmak !ç!n kod yazınız.
        Örnek: ‘M!ss!ss!pp!’ ´ M!sp*/

String s = "Mississippi";

Set<String> unique = new LinkedHashSet<>(Arrays.asList(s.split("")));
        System.out.println(unique);

//  B!r l!ste ve b!r set olusturunuz. Set !çer!s!nde var olan l!sten!n bütün elemanlarını kaldıran
//  b!r kod yazınız.


   LinkedList<Character> ch = new LinkedList<>();
   ch.add('A');
   ch.add('B');
   ch.add('C');
   ch.add('D');
   ch.add('E');
   ch.add('F');
   ch.add('G');

   Set<Character> setChar = new HashSet<>();
       setChar.add('C');
       setChar.add('D');
       setChar.add('E');
       setChar.add('F');
       setChar.add('G');
        setChar.add('T');

        System.out.println(ch.removeAll(setChar));
        System.out.println(setChar);
        System.out.println(ch);


//  5) B!r l!stede tekrarlanan ögeler olup olmadıgını kontrol etmek !ç!n kodu yazınız.

   LinkedList<String> linkedList = new LinkedList<>();
   linkedList.add("Ali");
   linkedList.add("Veli");
   linkedList.add("Osman");
   linkedList.add("Zeynep");
   linkedList.add("Elif");
   linkedList.add("Ata");
   linkedList.add("Ata");
   linkedList.add("Zeynep");

HashSet<String> hashSet = new HashSet<>(linkedList);

if (linkedList.size()>hashSet.size()){
    System.out.println("listede tekrarlı elemanlar vardır ");
}else {
    System.out.println("listede tekrarlı elemanlar yoktur ");
}











    }
}