package D19OOP;

public class AbstractionNote {


    /*🧩 Abstraction & Abstract Class – Özet
🎯 Tanım:

    Abstraction (Soyutlama), bir sınıfın yalnızca gerekli özelliklerini ve davranışlarını gösterip, detayları gizlemesidir.
    Abstract Class, soyutlama için kullanılan sınıftır; kendisinden obje oluşturulamaz, sadece child class’lar tarafından kullanılır.

🔹 Özellikler:

    Abstract Class:

    Kendisinden object oluşturulamaz

    Hem abstract method (gövdesiz) hem de concrete method (gövdelis) içerebilir

    Child class’lar tarafından extends edilerek kullanılır

    Abstract class private olamaz, çünkü child class’lar erişip override edemez

    Abstract class normal class’ların child’ı olabilir

    Abstract Method:

    Body’si (gövdesi) yoktur → “Ne yapılacağını söyler, nasıl yapılacağını söylemez”

    Tüm child class’lar tarafından override edilmek zorundadır (somut hale getirilir)

    Sadece abstract class içinde tanımlanabilir

            Final method olamaz (çünkü override edilemez)

    Private olamaz (çünkü child class override edemez)

    Concrete Method (Body’si olan method):

    Child class’lar tarafından isteğe bağlı override edilebilir

    Final method ise override edilemez

    Child Class ile İlişki:

    Abstract bir class’ın abstract child’ı olabilir

    Abstract child parent’in abstract methodlarını override etmek zorunda değildir (isterse override eder)

🔹 Kurallar / Dikkat Edilecek Noktalar:
    Konu	Kural
    Abstract Class’tan obje	❌ Oluşturulamaz
    Abstract Method	⚡ Body yok, override zorunlu
    Concrete Method	✅ Body var, override opsiyonel
    Final + Abstract	❌ Hata, final method override edilemez
    Private Abstract	❌ Hata, child class override edemez
            Abstract Class içinde main method	✅ Mümkün
🔹 Örnek Kod:
    public abstract class Honda {

        public final void music() { // concrete ve final, override edilemez
            System.out.println("Pro");
        }

        public abstract void engine(); // abstract method, body yok, child override etmeli
    }

    public class Civic extends Honda {
        @Override
        public void engine() {
            System.out.println("1.6L Turbo Engine");
        }
    }

🔹 Kısa Özet Notlar (Hafıza İçin):

    Abstract class → obje oluşturulamaz, hem abstract hem concrete method olabilir

    Abstract method → body yok, override zorunlu

    Concrete method → body var, override opsiyonel

    Final method → abstract olamaz

    Private method → abstract olamaz

    Abstract child → parent abstract methodları override etmek zorunda değil*/






}
