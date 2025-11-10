package Ekim28MapsExceptions;

public class MapsThreads {
    public static void main(String[] args) {
/*
        🧩 1. Genel Kavramlar

        Koddaki baştaki açıklamalar 3 önemli kavramı tanıtıyor:

        Kavram	Açıklama
        Thread Safe	Aynı anda birden fazla iş parçacığı (thread) aynı nesneye eriştiğinde veri karışıklığı olmadan güvenli çalışması.
                Multi Thread	Programın aynı anda birden fazla iş parçacığı çalıştırabilmesi.
                Synchronized	Aynı anda sadece bir thread’in erişebilmesini sağlayan kilitleme (lock) sistemi.
🧱 2. HashMap, Hashtable ve ConcurrentHashMap farkları
🔹 HashMap

        Thread-safe değildir (aynı anda birden fazla thread erişirse veri bozulabilir).

                Synchronized değildir.

        null key ve null value kabul eder.

                Performanslıdır (tek thread ortamında en hızlısıdır).

                Kullanım alanı: Basit, tek iş parçacıklı uygulamalar.

🧠 Örnek:

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Ahmet", 41);
        stdAges.put(null, 39); // null key olabilir
        stdAges.put("a", null); // null value olabilir
        System.out.println(stdAges);


📤 Çıktı:
        {null=39, Ahmet=41, a=null, b=null, Ali=18}

🔹 Hashtable

        Thread-safe’tir.

                Tüm metotları synchronized (yani yavaş ama güvenlidir).

        null key/value KABUL ETMEZ.

        Eski (legacy) bir yapıdır, yeni projelerde önerilmez.

        Kullanım alanı: Eski projeler, geriye dönük uyumluluk.

🧠 Örnek:

        Hashtable<String, Integer> studentGrades = new Hashtable<>();
        studentGrades.put("Zeynep", 90);
        studentGrades.put("Orkun", 85);
        studentGrades.put("Ümit", 85);
// studentGrades.put(null, 50); // HATA!

🔹 ConcurrentHashMap

        Thread-safe’tir.

                Ama Hashtable gibi her şeyi kilitlemez.

                Segment-based locking kullanır → sadece erişilen kısım kilitlenir (daha hızlıdır).

        null key/value KABUL ETMEZ.

        Kullanım alanı: Çok iş parçacıklı, yüksek performanslı uygulamalar (ör. web sunucuları).

🧠 Örnek:

        ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
        stock.put("elma", 10);
        stock.put("muz", 20);
        stock.putIfAbsent("çilek", 30); // varsa değiştirmez
        stock.replace("muz", 20, 25);
        stock.remove("elma");

        for (Map.Entry<String, Integer> w : stock.entrySet()) {
            System.out.println(w.getKey() + " stok miktarı : " + w.getValue());
        }


📤 Çıktı:

        muz stok miktarı : 25
        çilek stok miktarı : 30

🌲 3. TreeMap

        Key’leri sıralı (natural order) tutar (alfabetik veya sayısal).

                Thread-safe değildir.

        null key kabul etmez, ama null value kabul eder.

                Yavaş, ama sıralama garantisi verir.

                Kullanım alanı: Sıralı veri saklama.

🧠 Örnek:

        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Türkiye", 830000000);
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);
        System.out.println(countryPopulation);


📤 Çıktı:

        {France=null, Germany=83000000, Italy=null, Netherlands=830000000, Türkiye=830000000, USA=400000000}

🔗 4. LinkedHashMap

        HashMap gibidir ama ekleme sırasını korur.

        Thread-safe değildir.

                Kullanım alanı: Ekleme sırasının önemli olduğu yerler (ör. sipariş, çağrı sırası).

🧠 Örnek:

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Ali", 25);
        linkedHashMap.put("Can", 18);
        linkedHashMap.put("Mehmet", 30);

        for (Map.Entry<String, Integer> w : linkedHashMap.entrySet()) {
            System.out.println(w.getKey() + " -> " + w.getValue());
        }


📤 Çıktı:

        Ali -> 25
        Can -> 18
        Mehmet -> 30

⚙️ 5. HashMap Nasıl Çalışır? (Arka Plan)

        Varsayılan kapasite = 16 bucket (0–15).

                Her anahtarın hashCode() değeri hesaplanır, bu değer mod 16 yapılarak bucket seçilir.

                Aynı bucket’a denk gelen anahtarlar linked list (Java 8’den itibaren gerekirse ağaç) içinde saklanır.

        Aynı key tekrar eklenirse eski value’nun üstüne yazılır.

🧠 Örnek:

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.put("Italy", "Rome");
        capitals.put("Türkiye", "Ankara");
        capitals.put("Türkiye", "İstanbul"); // Eski değer (Ankara) silinir, yerine İstanbul yazılır


📤 Çıktı:

        {USA=Washington, Italy=Rome, Türkiye=İstanbul}

📚 OT (ÖĞRETİCİ TABLO): Map Türleri Karşılaştırması
        Özellik	         HashMap 	Hashtable 	ConcurrentHashMap	TreeMap	   LinkedHashMap

        Thread Safe      	❌ Hayır	✅ Evet	✅ Evet (Segmented)	❌ Hayır	     ❌ Hayır

        Synchronized          ❌  	    ✅                Kısmen        ❌	         ❌

        Null Key             ✅ 1 tane	  ❌             	❌	         ❌            	✅ 1 tane

        Null Value	          ✅          ❌	            ❌	        ✅       	     ✅

        Sıralama            	❌ (Karışık)	   ❌	     ❌	      ✅ (Natural Order)	✅ (Ekleme Sırası)

        Performans	             ⚡ En hızlı	       🐢 Yavaş	     ⚡⚡ Yüksek	   🐢 Yavaş	        ⚡ Orta

        Kullanım Alanı	Tek thread	Eski projeler	Multi-thread uygulamalar	Sıralı veriler	Sıralı ekleme gereken yerler
🎯 Özet:

        Tek thread ortam → HashMap
        Eski kod → Hashtable
        Çok thread + yüksek performans → ConcurrentHashMap
        Sıralı veri → TreeMap
        Ekleme sırası önemli → LinkedHashMap*/










































    }
}
