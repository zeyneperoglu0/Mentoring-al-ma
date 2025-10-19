package weekendcollections;

public class GeneralQuestionsGpt {

 /* 🔹 1️⃣ LinkedList & List soruları

    LinkedList ile ArrayList arasındaki temel farklar nelerdir?
linked listte elemanlara erişim için node bağlantıları kullanılır pointerlar vardır arraylistte index mantığı vardır linked listte eleman ekle çıkar işlemleri daha kolay yapılır arraylistte index mantığı olduğu için eleman ekle çıkar işlemleri yapılırken index kayar bu yüzden arraylist mantıklı değl sadece son indexe eleman eklenecek veya çıkarılcaksa arraylist kullanılır
ama genel olarak arraylist daha hızlıdır node bağlantıları bulunmadığı için ArrayList sondan ekleme hızlıdır, LinkedList her yerden ekleme/silme hızlıdır, ama erişim ArrayList çok hızlı, LinkedList yavaştır.


            LinkedList.addFirst() ve LinkedList.addLast() ne yapar?
first ilk indexe eleman ekler last son indexe


    peek(), poll(), pop() metotlarının farkı nedir?
    peek ilk elemanı yazdırır
    poll ve pop ilk elemanı lşsteden kaldırır  eğer liste boşsa pop exception verir poll null verir

            Arrays.asList() ile oluşturulan listeye add() yapılabilir mi? Neden?
            eğer constructordan yapılırsa esnek eleman listesi olur ama direkt bu şekilde oluşturulursa sabit boyutlıu olur sadece var olan eleman set edilebilir boyut değiştirilemez

            List.of() ile oluşturulan listeyi değiştirebilir misin? Neden?
hayır sabit boyutlu ve immutable list olur



            🔹 2️⃣ Set soruları

    HashSet, LinkedHashSet ve TreeSet arasındaki temel farklar nelerdir?
Hash en hızlılarıdır null kabul eder hash koduna göre sıralama yapar yani bir sıralama garantisi yoktur
LinkedHash Hashten yavaştır null kabul eder ve insertion sıralaması yapar
Tree en yavaşıdır ASCII codelara göre  (natural) sıralama yapar null kabul etmez



    HashSet içerisine null eklenebilir mi? TreeSet’e neden eklenemez?
 hash null kabul eder tree etmez sebebi treeSet ASCII code sıralaması yapar ama null karakterini ASCII ile sıralayamayız bu yüzden kabul etmez



    retainAll() metodu ne işe yarar? removeAll() ile farkı nedir?
    retainAll() iki set veya liste set arasındaki ortak elemanları gösterir
    removeAll() ise iki set ve bi set bir liste arasındaki farkli elemanları kaldırır

            Set.of() kullanılarak oluşturulan set değiştirilebilir mi?
değiştirilemez setof immutabledır
    TreeSet’ten subSet() ile alt küme alırken başlangıç ve bitiş elemanı dahil mi, hariç mi?
başlangıç dahil bitiş hariçtir.


            🔹 3️⃣ Polymorphism / Class soruları

    B obj = new C(); obj.m(); çağrısında hangi metod çalışır? Neden?
B nin metodları çalışır eğer override edilmemişse
override edilmişse runtime objesi (C) çalışır

Yani eğer C metodu override ettiyse C’nin metodu çalışır

    Override edilmemiş bir metod varsa hangi sınıfın metodu çalışır?
override edilmemişse class ya da interface in metodları çalışır


    C c = new B(); geçerli midir? Neden?
Yanlış: Bir alt sınıfın değişkenine üst sınıf objesi atanamaz. Compile-time error


            obj.sadeceAltSinifMetodu(); çağrısı mümkün müdür? Neden?
mümkündür eğer override edilmişse alt sınıftsn sadece o metotları kullanabiliriz
    Interface üzerinden override edilmiş metod çalışırken runtime’da hangi sınıfın metodu kullanılır?
    obje classın metodları çalışır yani override edilmiş metod

    */






















}
