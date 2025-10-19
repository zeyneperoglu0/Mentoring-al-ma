package weekendcollections;

public class Sets {

    /*
1️⃣ Set Nedir?

    Set, tekrarsız (unique) elemanları depolamak için kullanılır.

    Örnekler: e-mail, TC kimlik no, plaka no.

    Özellikleri:

    Tekrarlayan eleman kabul etmez.

    Null elemanı destekleyebilir (HashSet, LinkedHashSet) ama TreeSet desteklemez.

            2️⃣ Set Türleri
    a) HashSet

    Elemanları hash koduna göre depolar.
    Sıra garanti edilmez (insertion order yok).
    Hızlı performans sunar.
    Null kabul eder.
    Tekrarlayan eleman eklenirse, üzerine yazmaz, hata vermez.

            HashSet<String> hs = new HashSet<>();
hs.add("Sinan");
hs.add("Kerem");
hs.add("Tuba");
hs.add("Onur");
hs.add(null);

✅ Çıktı örneği (sıra garanti değil): [Kerem, null, Sinan, Tuba, Onur]

    b) LinkedHashSet

    Insertion order (ekleme sırası) garantilidir.
    HashSet gibi, tekrarlayan eleman eklenmez.
    Null kabul eder.

            LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
lhs.add(14);
lhs.add(19);
lhs.add(7);
lhs.add(1);
lhs.add(null);
System.out.println(lhs); // [14, 19, 7, 1, null]

    c) TreeSet

    Elemanları natural order (doğal sıralama) ile tutar.
    Null kabul etmez (çünkü sıralama yaparken sorun olur).
    SortedSet arayüzünü implement eder, alt küme (subSet) gibi metodları kullanabilir.

    TreeSet<Character> ts = new TreeSet<>();
ts.add('G');
ts.add('A');
ts.add('Z');
ts.add('R');
ts.add('U');
System.out.println(ts); // [A, G, R, U, Z]


    subSet(from, to) → başlangıç dahil, bitiş hariç, alt küme döndürür.

            SortedSet<Character> ss = ts.subSet('G','U');
System.out.println(ss); // [G, R]

3️⃣ Set Metodları Önemli
    Metot	Açıklama
    add(E e)	Eleman ekler, tekrarlayan eklemez
    remove(Object o)	Belirtilen elemanı siler
    retainAll(Collection c)	Kesişim: sadece ortak elemanları bırakır
    subSet(from, to)	SortedSet alt kümesi oluşturur
4️⃣ retainAll() Örneği
    LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(14, 19, 7, 1));
    LinkedHashSet<Integer> ls = new LinkedHashSet<>(Arrays.asList(14, 19, 17, 11));

lhs.retainAll(ls); // lhs ve ls kesişimi
System.out.println(lhs); // [14, 19]


    lhs sadece ls ile ortak elemanları tutar.

    ls değişmez.

            5️⃣ Diğer Önemli Noktalar

Set.of(...) → immutable set oluşturur (değiştirilemez).

    Set<String> hs3 = Set.of("Ali", "Veli", "Ayşe");
// hs3.add("X"); → HATA


    HashSet, LinkedHashSet, TreeSet arasında seçim:

    Hız → HashSet

    Sıra garanti → LinkedHashSet

    Doğal sıralama / subset → TreeSet

🧩 1️⃣ HashSet — En sık kullanılan, en hızlısı
⚡ Özellik:

    En hızlısıdır (ekleme, silme, arama işlemleri O(1) sürede olur).

    Sıra (order) önemli değilse kullanılmalı.

    Tekrarsız verileri saklar.

null değer kabul eder (bir tane).

            🎯 Ne zaman kullanılır?

    Sadece “bu değer var mı / yok mu” kontrolü önemliyse.

    Sıralama veya ekleme sırası önemli değilse.

            🧠 Örnek kullanım:

    E-posta adresleri listesi (her e-posta bir kere olsun yeter).

    Kullanıcı ID’leri, kimlik numaraları gibi benzersiz veriler.

            HashSet<String> emails = new HashSet<>();
emails.add("ali@gmail.com");
emails.add("veli@gmail.com");
emails.add("ali@gmail.com"); // tekrarlısı alınmaz

🧩 2️⃣ LinkedHashSet — Sıra önemliyse
⚡ Özellik:

    HashSet kadar hızlı olmasa da sıralı (insertion order) çalışır.

    Yine tekrarsız veriler tutar.

            null kabul eder.

            🎯 Ne zaman kullanılır?

    Hem benzersizlik, hem de eklenme sırası önemliyse.

            “Son eklenenleri aynı sırada yazdırmak istiyorum” gibi durumlarda.

            🧠 Örnek kullanım:

    Kullanıcının ziyaret ettiği sayfaları sırayla göstermek.

    Menüdeki benzersiz öğeleri eklenme sırasına göre tutmak.

            LinkedHashSet<String> menu = new LinkedHashSet<>();
menu.add("Ana Sayfa");
menu.add("Hakkımızda");
menu.add("İletişim");
System.out.println(menu); // [Ana Sayfa, Hakkımızda, İletişim]

🧩 3️⃣ TreeSet — Sıralama (küçükten büyüğe) önemliyse
⚡ Özellik:

    Elemanları doğal sıraya (natural order) göre saklar.
            (String → alfabetik, Number → küçükten büyüğe)

            null kabul etmez!

    Diğerlerinden daha yavaştır (O(log n)).

            🎯 Ne zaman kullanılır?

    Verileri sıralı şekilde tutmak istiyorsan.

“Şu aralıkta olanları getir” gibi işlemler varsa.

🧠 Örnek kullanım:

    Sıralı öğrenci numaraları listesi.

    Küçükten büyüğe sıralı fiyat listesi.

            TreeSet<Integer> scores = new TreeSet<>();
scores.add(70);
scores.add(90);
scores.add(50);
System.out.println(scores); // [50, 70, 90]

⚖️ Kıyaslama Tablosu
    Özellik	HashSet	LinkedHashSet	TreeSet
    Sıra	Yok (rastgele)	Eklenme sırası	Natural order (A–Z, 0–9)
    Hız (Performans)	⚡ En hızlı	⚡ Orta	🐢 Yavaş (ama sıralı)
null değeri	1 tane kabul eder	1 tane kabul eder	❌ Kabul etmez
    Kullanım amacı	Benzersizlik	Benzersizlik + sıra	Benzersizlik + sıralama
    Temel yapı	Hash tabanlı	Hash + Linked	Tree (Red-Black Tree)
🧠 Karar verirken kısa yol:

            🔹 Sadece tekrarsız veri yeterli: → HashSet

🔹 Ekleme sırasını da korumalı: → LinkedHashSet

🔹 Sıralı (alfabetik / sayısal) tutmalı: → TreeSet*/


























}
