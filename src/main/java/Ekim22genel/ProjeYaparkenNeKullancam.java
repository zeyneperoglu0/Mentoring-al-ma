package Ekim22genel;

public class ProjeYaparkenNeKullancam {

    /*

🧱 1. Constructor ne zaman kullanılır?

    Bir sınıftan nesne oluştururken başlangıç değerleri vermek istiyorsan.

            🔹 Ne işe yarar?

    Nesne yaratılırken otomatik olarak bir başlangıç ayarı yapar.

    Kod tekrarını azaltır.

“Oluşturulmazsa çalışamaz” türü değerleri garanti eder.

            🔹 Nereden anlarsın?

    Eğer sınıfın çalışabilmesi için bazı zorunlu değişkenlerin ilk değerleri olmalıysa — constructor gerekir.

            🔹 Örnek:

    Sayı tahmin oyununda:

    public class SayiTahminOyunu {
        private int maxAralik;
        private int tahminHakki;

        public SayiTahminOyunu(int maxAralik, int tahminHakki) {
            this.maxAralik = maxAralik;
            this.tahminHakki = tahminHakki;
        }
    }


    Burada oyun her başladığında bir aralık ve tahmin hakkı belirlenmek zorunda → constructor doğru seçim.

🧩 2. Getter / Setter ne zaman kullanılır?

    Bir sınıftaki değişkenleri korumak ama gerektiğinde dışarıya erişim izni vermek istiyorsan.

🔹 Ne işe yarar?

            “Encapsulation” yani kapsülleme prensibini sağlar.

    Değişkenleri private yaparsın, dışarıdan doğrudan erişilmez.

            Getter–Setter ile kontrollü erişim verirsin.

🔹 Nereden anlarsın?

    Eğer dışarıdan o değişkene erişilmesi ama direkt değiştirilememesi gerekiyorsa getter/setter kullan.

            🔹 Örnek:
    private int kredi;

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        if (kredi >= 0) this.kredi = kredi;
    }


    Burada kredi oyun puanı → dışarıdan okunabilir ama “eksi” olmaması gerektiği için setter içinde kontrol var.

🔌 3. Interface ne zaman kullanılır?

    Birden fazla sınıf aynı davranışa sahip olacaksa ama farklı şekilde uygulayacaksa.

🔹 Ne işe yarar?

    Ortak bir sözleşme (contract) tanımlar.

    Çoklu kalıtımı (inheritance) güvenli biçimde sağlar.

            🔹 Nereden anlarsın?

    Eğer proje içinde birden fazla sınıf “aynı türden iş yapacaksa”, ama detayları farklıysa interface gerekir.

            🔹 Örnek:

    Diyelim hem “SayıTahminOyunu” hem “KelimeTahminOyunu” var:

    public interface TahminOyunu {
        void oyunuBaslat();
        boolean tahminEt();
        void krediHesapla();
    }


    Her iki oyun da bu metodları kendi mantığıyla uygular:

    public class SayiTahminOyunu implements TahminOyunu { ... }
    public class KelimeTahminOyunu implements TahminOyunu { ... }

⚙️ 4. List, ArrayList, Map ne zaman kullanılır?

    Birden fazla veriyi dinamik olarak saklaman gerekiyorsa.

🔹 Nereden anlarsın?

    Eğer “birden fazla oyuncu”, “birden fazla tahmin”, “birden fazla skor” tutacaksan → koleksiyon gerekir.

            🔹 Örnek:
    List<Integer> tahminler = new ArrayList<>();


    Her yeni tahmin geldiğinde:

            tahminler.add(tahmin);

🧠 5. Metot ne zaman oluşturulur?

    Bir işlem tekrar ediyorsa, bağımsız bir iş yapıyorsa veya anlamlı bir alt görev oluşturuyorsa.

🔹 Nereden anlarsın?

    Kod içinde “şunu birkaç yerde kullanıyorum” diyorsan → o işlemi metoda ayır.

            🔹 Örnek:
    public void krediArtir(int katsayi) {
        kredi += 10 * katsayi;
    }


    Tekrar eden kredi artırma işlemini metotlaştırmak, hem okunabilirliği hem yeniden kullanılabilirliği artırır.

🎯 Özet Tablo
    Yapı	Ne zaman gerekir?	Nereden anlarsın?
    Constructor	Nesne oluşturulurken başlangıç değeri gerekiyorsa	“Bu olmadan nesne çalışmaz” diyorsan
    Getter/Setter	Değişken koruma + kontrollü erişim	“Okunsun ama direkt değiştirilemesin” diyorsan
    Interface	Farklı sınıflar ortak iş yapacaksa	“Hepsi aynı işi yapacak ama farklı şekilde” diyorsan
    List/Map	Çoklu veri saklanacaksa	“Birden fazla şey tutmam lazım” diyorsan
    Metot	Tekrar eden iş veya alt görev varsa	“Bu işi birkaç kez yapıyorum” diyorsan

--------------------------------------------------------------------------
💡 Bölüm 1 — Temel Mantık

1️⃣ SayiTahminOyunu sınıfında tahminSayısı ve tahminHakkı değişkenlerinin neden “sınıf değişkeni” (field) olarak tanımlandığını açıklayabilir misin?

 çünkü o değişkeneri methodlar içinde kullanıp değiştimem falan lazımdı
Ek not: Field (sınıf değişkeni) olmasının bir nedeni de “oyun durumu”nu temsil etmesi.
Yani bu değişkenler nesnenin durumunu (state) tutuyor — bu yüzden metotlar arası yaşamalı.


            (Yani neden oyunuBaslat() metodu içinde “yerel değişken” değil?)
diğer methodlarda da kullanmam gerekiyordu

            2️⃣ Random rnd = new Random(); satırında new ifadesi ne işe yarar?
yeni bir obje oluşturur burda dsrandom classını import ettik ve obje oluşturduk ki o methodu kullanabilelim
Ek bilgi: new heap bellekte yeni bir nesne oluşturur ve rnd değişkeni o nesnenin referansını tutar.


              3️⃣ “tahmin < a” durumunda continue; kullansaydın ne olurdu?

döngünün başına döndürürdü


            ⚙️ Bölüm 2 — OOP Yapıları

4️⃣ “Kredi” değerinin dışarıdan doğrudan değiştirilmesini istemiyorsun, ama başka sınıfların bu değeri okuyabilmesini istiyorsun.

    kredi değişkenini nasıl tanımlarsın?
private
    Hangi metotları yazarsın?
getter setter

            5️⃣ Bir sınıfta “oyunun başlatılması” farklı, “kredi hesaplaması” farklı bir işlemdir.

    Bu iki işlemi neden ayrı metodlara bölmek doğru bir yaklaşımdır?
her method kendi işini yapmalıdır


            🧩 Bölüm 3 — Constructor & Interface

6️⃣ SayiTahminOyunu her seferinde 15 tahmin hakkı ve 100 maksimum aralıkla başlıyor.
    Ama bu değerleri kullanıcıdan almak istesen, sınıfı nasıl değiştirirdin?

    Scannerla kullanıcıdan değeri alırım kullanmak istediğim yerde çağırırım



            7️⃣ “KelimeTahminOyunu” adlı başka bir sınıf daha ekleyeceksin.
    Her iki sınıfın da oyunuBaslat(), devamMi() ve bittiMi() metotları olacak.
    Bu durumda hangi yapıyı kullanmak en doğrusudur?

    ınterface


            🧠 Bölüm 4 — Senaryo Analizi

8️⃣ Oyuncunun her doğru tahminde kredi artıyor.
    Ama sen istiyorsun ki:

    Eğer kredi 30’un altına düşerse, otomatik olarak yeni oyun hakkı tanınsın.
    Bu durumda:

    Bu kontrolü nereye koyardın?

kredi kısmında ifle kontrol ederim
yenioyun methodunu çağırırım
    Hangi değişken/method’lar etkileşirdi?



            🔍 Bölüm 5 — Düşünme Sorusu

9️⃣ Eğer oyunuBaslat() metodunun içinde tahminHakki, tahminSayisi ve a değişkenlerini metodun sonunda sıfırlarsan, bir sonraki oyunda neden problem çıkabilir?
tahmin hakı sıfır olursa döngü hiç çalışmazdı oyunn hiç başlamazdı


            10️⃣ Bir projenin hangi kısmında interface, hangi kısmında abstract class, hangi kısmında normal class kullanacağına karar verirken hangi kriterlere bakarsın?
interface ise aynı  özellikleri kullanan birden fazla class varsa o zaman kullanırım
abstract classı methodları zorunlu tutmak istediğim zaman kullanırım
normal classı single inheritance varsa kullanırım parent child falan gibi gbi
Bölüm 1 — Temel Mantık & Döngüler

1️⃣ Bir sayı tahmin oyununda while döngüsü yerine do-while kullanmanın farkı nedir?
2️⃣ break ve continue arasındaki farkı kendi kelimelerinle açıklayın.
3️⃣ Aşağıdaki kodda tahminSayısı neden doğru şekilde artar?

if(tahmin == a) {
    tahminSayısı++;
    break;
}

Bölüm 2 — OOP Kavramları

4️⃣ Bir sınıfın bazı değişkenlerini private yaparken neden getter yazmak mantıklıdır?
5️⃣ Setter yazarken hangi durumlarda kontrol eklemek gerekir? (ör: negatif değer gelmesin)
6️⃣ Bir sınıfın hem “başlat” hem “puan hesapla” hem de “bitir” metotları varsa, bunları ayrı metodlara ayırmanın avantajları nelerdir?

Bölüm 3 — Constructor & Interface

7️⃣ Sınıfın her nesnesi farklı bir başlangıç aralığı ve tahmin hakkıyla başlıyorsa constructor nasıl kullanılmalı?
8️⃣ Hem SayiTahminOyunu hem de KelimeTahminOyunu aynı metotlara sahip olmalı ama farklı implementasyon yapacaksa hangi yapıyı kullanırız? Neden?
9️⃣ Constructor olmadan sınıfın bazı değişkenlerini default değerlerle başlatırsak, hangi durumlarda problem çıkabilir?

Bölüm 4 — Koleksiyonlar & Listler

🔟 Birden fazla oyuncunun tahminlerini saklamak istiyorsun.

Hangi yapı kullanılır?

Her yeni tahmin geldiğinde ne yapılmalı?

1️⃣1️⃣ Eğer oyuncu skorlarını hem kullanıcı hem de sistem tarafından saklamak istiyorsan, hangi koleksiyon uygun olur? (List mi Map mi?)

Bölüm 5 — Senaryo ve Tasarım

1️⃣2️⃣ Oyuncu doğru tahmin yaptığında kredi artıyor.

Eğer kredi 30’un altına düşerse, otomatik yeni oyun başlasın.

Bu kontrol hangi metoda konulmalı?

1️⃣3️⃣ Oyun bittikten sonra yeni oyuna başlamak isteyip istemediğini sormak istiyorsun.

Bu kontrolü Runner mı yoksa SayiTahminOyunu içinde mi yapmalısın? Neden?

1️⃣4️⃣ Eğer gelecekte oyunlar arası ortak bazı metotlar olacaksa (oyunuBaslat, devamMi, bittiMi) ve farklı oyun türleri olacaksa, hangi yapıyı kullanmak mantıklı olur?



*/








}
