package d20oopcollections;

public class CollectionsLinkedList {
/*
    LinkedList ve Collections Özet Notları
1. Collections Nedir?
    Collections, Java’da nesneleri depolamak ve işlemek için kullanılan sınıf ve arayüzler kümesidir.
    Sağladığı temel işlemler:
    Ekleme: Eleman ekleme
    Silme: Eleman çıkarma
    Arama: Eleman bulma
    Döngüleme: Tüm elemanları işleme
    Amaçları:
    Verileri verimli depolamak
    Hızlı işlemek (arama, sıralama, filtreleme)
    Güvenli depolama sağlamak
    --------------------------------
2. Array ve Collection Karşılaştırması
    Array eksiklikleri:
    Boyutu sabittir (statik)
    İç içe array’ler karmaşıktır
    Ekleme, silme ve arama yavaş olabilir
    Collection:
    Dinamik boyut
    Daha esnek ve hızlı veri işlemleri
    Özellikle ekleme-silme işlemlerinde Array’den avantajlı
    ----------------------------------
3. LinkedList Özellikleri
    Bağlı liste (Doubly Linked List) yapısı:
    Her eleman, bir önceki ve bir sonraki elemanı gösterir (node bağlantısı)
    Ekleme ve silme işlemleri hızlıdır
    Elemanlara rastgele erişim yavaştır (index üzerinden erişim ArrayList kadar hızlı değildir)
    Bellek kullanımı ArrayList’e göre daha fazladır
    Kullanım Kararı
    LinkedList: Sık sık ekleme-silme yapılıyorsa, özellikle listenin başına veya ortasına ekleme gerekiyorsa.
    ArrayList: Elemanlara hızlı erişim gerekiyorsa veya ekleme/çıkarmalar listenin sonunda yoğunlaşmışsa.
    ---------------------------------------------
            4. LinkedList Metotları
    add(E e): Listeye eleman ekler
    add(int index, E e): Belirtilen konuma eleman ekler
    addFirst(E e): Listenin başına ekler
    addLast(E e): Listenin sonuna ekler
    Örnek Kullanımlar
    LinkedList<String> myList = new LinkedList<>();
myList.add("Ali"); // Liste sonuna ekler
myList.add(1, "Zeynep"); // 1. index'e ekler
myList.addFirst("Hasan"); // Başa ekler
myList.addLast("Hüseyin"); // Sona ekler

5. Immutable ve Mutable Listeler

List.of() → Immutable liste (Java 9+)
    Elemen eklenemez, çıkarılamaz
    UnsupportedOperationException verir

Arrays.asList() → Sabit boyutlu liste (mutable elemanlar, ama ekleme/çıkarma yok)
    Mevcut elemanlar değiştirilebilir
    Boyut değiştirilemez

    List<String> immutableList = List.of("A", "B");
    List<String> mutableList = Arrays.asList("A", "B");

mutableList.set(1, "C"); // Geçerli
// mutableList.add("D"); // HATA sadece arrays as listte indexteki eleman değişebilir bu kadar

    Soru Örnekleri

    Kısa cevap:
    LinkedList ve ArrayList arasındaki temel fark nedir?
linked listler elemanlara erişmek iin daha uygundur ekleme silme falan için
LinkedList, eleman ekleme ve silme işlemleri için daha uygundur, özellikle listenin başına veya ortasına
ekleme/silme gerekiyorsa.

ArrayList, elemanlara rastgele erişim (index üzerinden) için daha uygundur.

Özetle: Erişim hızlı mı? ArrayList; ekleme/silme hızlı mı? LinkedList.
    Kod sorusu:

    LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C"));
list.addFirst("X");
list.addLast("Y");
list.add(2, "Z");
System.out.println(list);


    Çıktı ne olur?
X A B Z C Y
    Kavram sorusu:
            Arrays.asList() ile oluşturulan bir listede eleman eklemeye çalışırsanız ne olur?
EXCEPTİON
    Kontrol Sorusu

    LinkedList’te bir elemana rastgele erişim neden ArrayList’e göre yavaştır?

            (Cevabı: LinkedList elemanlara node bağlantıları üzerinden erişir, index’e doğrudan erişemez.)*/
























}
