package weekendcollections;

import java.util.*;

public class SetsQuestions {
    public static void main(String[] args) {

   /*
        🟢 KOLAY SEVİYE (1–5)

        1️⃣ Set interface’i hangi tür verileri depolamak için kullanılır?
 unique  verileri depolamak için kullanılır


                2️⃣ HashSet ile ArrayList arasındaki temel fark nedir?
  Setler tekrarlı eleman kabul etmezler Arraylist eder ve arraylist insertion order hashsette sıra korunmaz
       Ama performans açısından: HashSet arama ve eklemede genellikle daha hızlıdır çünkü hashing kullanır.

                3️⃣ Aşağıdaki kodun çıktısı ne olur?

                HashSet<String> set = new HashSet<>();
        set.add("Ali");
        set.add("Ali");
        System.out.println(set.size());
1 ali çıktısı verir sadeceboyutu da 1

        4️⃣ HashSet’te elemanların sırası korunur mu?
        hayır
                5️⃣ HashSet içerisine null eklenebilir mi?
                 evet

🟡 ORTA SEVİYE (6–10)

        6️⃣ Aşağıdaki kodun çıktısı ne olur?

                LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(3);
        lhs.add(1);
        lhs.add(2);
        System.out.println(lhs);
3 1 2 olur

        7️⃣ LinkedHashSet ile HashSet arasındaki fark nedir?
        linked olan insertion order diğerinde sıra garantisi yok
        8️⃣ retainAll() metodu ne işe yarar?
        iki set arasındaki ortak eleman kesişimini verir
        9️⃣ TreeSet hangi özelliğe göre elemanları sıralar?
        ASCII codelara göre natural order
🔟 Aşağıdaki kodda hata var mı? Varsa nedeni ne?


        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(null);
var tree set null kabul etmez
🔴 ZOR SEVİYE (11–15)

        1️⃣1️⃣ Aşağıdaki iki küme arasındaki farkı bulan metot nedir?
        (lhs kümesinde olup ls kümesinde olmayanları bulmak)
lhs.removeAll(ls);




        1️⃣2️⃣ TreeSet ile LinkedHashSet arasında performans ve sıralama açısından farklar nelerdir?
   linkedhash insertion linked hash daha hızlı ÇÜNKÜ HASH KULLANIR
   treeset ASCII


        1️⃣3️⃣ Set.of("Ali", "Veli", "Ayşe") ile oluşturulan kümede neden add() metodu kullanılamaz?
Set.of() immutable (değiştirilemez) bir set oluşturur.

        1️⃣4️⃣ Aşağıdaki kodun çıktısı ne olur?

                TreeSet<Character> ts = new TreeSet<>();
        ts.add('B');
        ts.add('A');
        ts.add('D');
        SortedSet<Character> subset = ts.subSet('A', 'D');
        System.out.println(subset);A B


        1️⃣5️⃣ Bir HashSet’i TreeSet’e dönüştürürsek elemanların sırası nasıl değişir ve neden?
        ASCII YE GÖRE OLUR
        */

/*
🟢 1️⃣ HashSet – Tekrarsız İsim Listesi

Kullanıcıdan birkaç isim alın (örneğin Ali, Veli, Ayşe, Ali, Ayşe)
ve bu isimleri bir HashSet içinde saklayarak tekrarsız olarak ekrana yazdır.

🧩 Beklenen çıktı:

Tekrarsız isimler: [Ali, Veli, Ayşe]


 */

Scanner input = new Scanner(System.in);
        System.out.println("1. ismi giriniz");
 String one = input.nextLine();
 System.out.println("2. ismi giriniz");
 String two = input.nextLine();
 System.out.println("3. ismi giriniz");
 String three = input.nextLine();
 System.out.println("4. ismi giriniz");
 String four = input.nextLine();
 System.out.println("5. ismi giriniz");
 String five = input.nextLine();

HashSet<String > hs = new HashSet<>(Arrays.asList(one,two,three,four,five));
        System.out.println(hs);

/*
🟡 2️⃣ LinkedHashSet – Eklenme Sırasını Koru

Aşağıdaki elemanları bir LinkedHashSet içine sırayla ekle:
10, 5, 20, 5, 10, 30
Sonra ekrana bastır.

🧩 Beklenen çıktı:

[10, 5, 20, 30]


(insertion order korunmalı, tekrarlar alınmamalı)*/


        LinkedHashSet<Integer>lhss = new LinkedHashSet<>(Arrays.asList(10, 5, 20, 5, 10, 30));
        System.out.println(lhss);










/*
🟡 3️⃣ retainAll() – Ortak Elemanları Bul

İki farklı LinkedHashSet oluştur:
A = [1, 2, 3, 4, 5]
B = [3, 4, 5, 6, 7]

İki setin ortak elemanlarını bul ve yazdır.*/

HashSet<Integer> hss = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
HashSet<Integer> hss2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        System.out.println(hss.retainAll(hss2));
        System.out.println(hss);


/*🧩 Beklenen çıktı:

Ortak elemanlar: [3, 4, 5]

🟠 4️⃣ removeAll() – Farkı Bul

Yukarıdaki aynı setleri (A ve B) kullan.
A kümesinde olup B kümesinde olmayan elemanları bul.
Sonucu yeni bir set olarak yazdır.

🧩 Beklenen çıktı:*/

        HashSet<Integer> hss3 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> hss4 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

hss3.removeAll(hss4);
        System.out.println(hss3);

/*
A fark B: [1, 2]

🔴 5️⃣ TreeSet – Aralık Seçimi (subSet)

Bir TreeSet<Character> oluştur:
Elemanlar: 'A', 'B', 'C', 'D', 'E', 'F', 'G'

Sonra 'C'’den 'F'’e kadar olan karakterleri (başlangıç dahil, bitiş hariç) yazdır.
(subSet() metodunu kullan)

🧩 Beklenen çıktı:

Alt küme: [C, D, E]*/


        TreeSet<Character> ch = new TreeSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G'));

        System.out.println(ch.subSet('C', 'F'));

        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.


   //TreeSetlerle bu soruyu tek seferde yapabilşriz fakat hızlı olmaz bu yüzden önce hashsete ekleyip treeset ile tekte sıralama yaptırmak çok daha hızlı ve mantıklıdır

   Set<String> email = new HashSet<>();
   email.add("a12@gmail.com");
   email.add("b12@gmail.com");
   email.add("u12@gmail.com");
   email.add("l12@gmail.com");
   email.add("w12@gmail.com");
   email.add("c12@gmail.com");

   TreeSet<String> em = new TreeSet<>(email);
        System.out.println(em);




























    }






}
