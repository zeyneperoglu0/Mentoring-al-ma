package Ekim28MapsExceptions;

public class ChatGptQuestions {
    public static void main(String[] args) {

/*
🧩 MÜLAKAT TİPİ SORULAR (Açık Uçlu)


        1️⃣ HashMap neden thread-safe değildir?

HashMap aynı anda birden fazla thread tarafından erişilirse veri tutarsızlığı oluşabilir.
Örneğin bir thread aynı key’e değer eklerken diğeri aynı anda silme işlemi yaparsa, sonuç beklenenden farklı olur.
Bazı durumlarda sonsuz döngü (infinite loop) bile oluşabilir.
Bu yüzden HashMap tek iş parçacıklı ortamlarda kullanılmalıdır.

 Aynı anda birden fazla thread HashMap üzerinde işlem yaparsa ne tür sorunlar oluşabilir?
        (Bir örnek senaryo verebilirsin — örneğin aynı anda iki thread’in aynı key’e değer ataması durumu.)


        2️⃣ Hashtable neden günümüzde önerilmez?
Hashtable thread-safe olsa da tüm metotları synchronized olduğu için her işlemde kilitleme yapılır.
Bu, performansı ciddi şekilde düşürür.
Ayrıca Hashtable eski (legacy) bir sınıftır, modern yapılar olan ConcurrentHashMap gibi bölgesel (segment) kilitleme yapan sınıflar daha hızlı ve esnektir.
Bu nedenle günümüzde ConcurrentHashMap tercih edilir.

        Hashtable da thread-safe ama neden modern projelerde ConcurrentHashMap tercih ediliyor?
                (Sebebi sadece “yavaş” olması mı, yoksa başka teknik farklar da var mı?)


        3️⃣ ConcurrentHashMap null key ve value kabul etmez. Sence neden?
Çünkü multi-thread ortamında null değer ile “değer yok” durumu karıştırılabilir.
Örneğin map.get("elma") null dönerse bu, “elma yok” mu, yoksa “elmanın değeri null” mu — belli olmaz.
Bu belirsizliği önlemek için ConcurrentHashMap null değerleri tamamen yasaklamıştır.
        Bu kararın teknik gerekçesini açıklamaya çalış.
        (Java geliştiricileri neden böyle bir sınırlama getirmiş olabilir?)


        4️⃣ TreeMap ile LinkedHashMap arasındaki sıralama farkını kendi cümlelerinle açıkla.
TreeMap: Key’leri alfabetik veya sayısal sıralama (natural order) ile sıralar.
Örneğin {A, B, C, D} şeklinde.

LinkedHashMap: Verileri ekleme sırasına göre tutar.
Örneğin önce Can, sonra Ali eklersen, her zaman o sırayla kalır.
                İkisinin de “sıralı” davrandığını biliyoruz ama nasıl bir sıralama yaptıklarını farkla anlat.


        5️⃣ Diyelim ki bir restoran uygulaması yazıyorsun.
          Müşteriler sırayla sipariş veriyor ve sen bu siparişleri ekleme sırasına göre göstermek istiyorsun.
                Aynı anda birden fazla garson veri ekleyebiliyor (multi-thread ortamı).
        Bu durumda hangi Map türünü seçersin?
        Neden o yapıyı tercih edersin?

Garsonlar aynı anda sipariş ekliyorsa, hem sıralı hem güvenli bir yapı gerekir.
Bu durumda ConcurrentHashMap kullanmak mantıklıdır çünkü thread-safe’tir.
Eğer sıralama da önemliyse, ConcurrentLinkedHashMap gibi yapılar (veya Collections.synchronizedMap(new LinkedHashMap<>())) tercih edilebilir.
Bu sayede hem ekleme sırasını hem güvenliği korursun.


      */

//🧩 Soru 1
//import java.util.*;
//        public class Test1 {
//            public static void main(String[] args) {
//                Map<String, Integer> map = new HashMap<>();
//                map.put("Ali", 10);
//                map.put("Veli", 20);
//                map.put(null, 30);
//                map.put("Ali", null);
//                System.out.println(map);
//            }
//        }
//
//
//🧠 Bu kod hata verir mi?  vermez çıktı da Veli 20 , Ali null , null 30 olr
//                Eğer vermezse, çıktısı ne olur ve neden?

/*
🧩 Soru 2
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Map<String, Integer> table = new Hashtable<>();
        table.put("Ahmet", 50);
        table.put("Ayşe", null);
        table.put(null, 70);
        System.out.println(table);
    }
}


🧠 Bu kod neden çalışmaz?
Hangi satırlarda hata olur, hatanın türü nedir?
 null var hashtable null kabul etmez nullpoiterexception oluşur table.put("Ayşe", null);
        table.put(null, 70); bu iki satır yüzünden */
/*🧩 Soru 3
import java.util.concurrent.*;
public class Test3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
        stock.put("elma", 10);
        stock.put("muz", 20);
        stock.putIfAbsent("elma", 99);
        stock.replace("muz", 20, 25);
        stock.remove("elma");
        System.out.println(stock);
    }
}
🧠 Çıktı ne olur, sırayla ne işlemler gerçekleşir?
Her satırın ne yaptığını kısaca açıkla.
ilkte elma 10 girer zaten sonra muz 20 girer putıfabsent satırında elmma olduğu için bir şey değişmez replacede muz 20 dğeğerinde olduğu için güncellenir
25 olur sonra removede elmayı sileriz sonra kalan muz =25 yazar

*/
/*

🧩 Soru 4
import java.util.*;
        public class Test4 {
            public static void main(String[] args) {
                TreeMap<String, Integer> map = new TreeMap<>();
                map.put("Z", 1);
                map.put("A", 2);
                map.put("M", 3);
                map.put("C", null);
                System.out.println(map);
            }
        }
🧠 Çıktıyı yaz ve neden o sırayla olduğunu açıkla. çıktı natural order yani A = 2 C = null M = 3 Z = 1 şeklinde olur çnkü treemap nat ordera göre sıralar
        Ayrıca TreeMap neden null key kabul etmez, ama null value kabul eder? çünkü natural ordera göre sıralanır keyler null ın bir ASCII değeri olmadığı için null
        nereye gelir bilemez java sıralarken bu yüzden key olarak null kanul etmez

*/
/*
🧩 Soru 5
import java.util.*;
        public class Test5 {
            public static void main(String[] args) {
                LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
                map.put("Ali", 1);
                map.put("Veli", 2);
                map.put("Ayşe", 3);
                map.remove("Veli");
                map.put("Veli", 99);
                System.out.println(map);
            }
        }

🧠 Çıktıyı tahmin et ve neden o sırayla olduğunu açıklayarak belirt.
        Burada LinkedHashMap’in insertion order (ekleme sırası) mantığını göz önünde bulundur.
 Ali =1 , Ayşe  =3 , Veli = 99 bu şekilde bir sırada çıkar veliyi ekleyip sildipğimiz için de yeri değişmiş oldu

🧩 Ek not:

LinkedHashMap’in insertion order’ı internal doubly-linked list sayesinde korunur.

Her ekleme, silme veya yeniden ekleme listede pozisyonu günceller, böylece veriler ekleme sırasına göre saklanır.

*/








    }



}
