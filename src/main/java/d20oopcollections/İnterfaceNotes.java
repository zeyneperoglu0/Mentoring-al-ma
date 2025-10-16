package d20oopcollections;

public class İnterfaceNotes {
/*
   🧠 JAVA – Interface (Arayüzler) Özet Notları
🔹 1. Interface Nedir?

    Interface, class’ların uygulayabileceği (implement edebileceği) bir sözleşmedir (contract).

    Ne yapılması gerektiğini belirtir, nasıl yapılacağını söylemez.

    Sadece method imzalarını (signature) içerir, gövde (body) içermez.

🔹 2. Interface’lerin Özellikleri
    Özellik	Açıklama
    Methodlar	Varsayılan olarak public ve abstracttır. (Yazmasan da geçerlidir.)

    1. Interface içindeki methodlar
Yazmasan bile otomatik olarak public abstract olur.
Yani erişim belirleyicisi public,
method tipi abstract kabul edilir.
    Değişkenler (Variables)	Varsayılan olarak public static finaldır. Yani sabit (constant) değerlerdir.
    Nesne (Object)	Interface’lerden object oluşturulamaz, çünkü constructor’ları yoktur.
    Kalitim (Inheritance)	- Class → Class: extends
            - Interface → Interface: extends
            - Class → Interface: implements
    Çoklu Kalıtım	Bir class birden fazla interface’i implements edebilir. (Multiple Inheritance desteklenir.)
    Concrete Method	Normalde olamaz ama:
            🔸 default keyword → alt sınıf (child) üzerinden erişilir, override edilebilir.obje üstünden erişilir
            🔸 static keyword → interface adıyla erişilir, override edilemez.interface adı ile
            🔹 3. Interface ile Abstract Class Farkı
    Özellik         	Abstract Class	                                           Interface
    Method Tipi	         Hem abstract hem concrete olabilir               Genellikle abstract’tır (default/static ile concrete olabilir)
    Değişkenler	      Her türde olabilir	                              Sadece public static final
    Constructor	         Var ama nesne oluşturulamaz	                       Constructor yok
    Kalıtım	             Tek miras (single inheritance)	                      Çoklu miras (multiple inheritance) desteklenir
    Kullanım Amaçları       	Ortak özellikleri toplar	               Ortak davranış kurallarını belirler
    //------------------
🔹 4. Interface İçinde Concrete Method Kullanımı

     default void power() {
        System.out.println("200HP");
    }


    static void speed() {
        System.out.println("Saatte 185 KM");
    }



    default → alt sınıf üzerinden çağrılır.

    static → Interface adıyla çağrılır (örnek: Engine.speed();).

       //---------------------------------


            🔹 5. Örnek: Interface Kullanımı

    public interface Engine {
        void eco();
        void turbo();
        void gas();
        void run();

        int fiyat = 300;

        default void power() {
            System.out.println("200HP");
        }

        static void speed() {
            System.out.println("Saatte 185 KM");
        }
    }

    public interface Brake {
        void abs();
        void esp();
        void run();
        int fiyat = 100;
    }

    public class AudiS5 implements Engine, Brake {
        @Override
        public void eco() { System.out.println("Audi S5 ekonomik motor kullanır"); }

        @Override
        public void turbo() { System.out.println("Audi S5 turbo motor kullanır"); }

        @Override
        public void gas() { System.out.println("Audi S5 benzinli motor kullanır"); }

        @Override
        public void abs() { System.out.println("Audi S5 ABS fren sistemi kullanır"); }

        @Override
        public void esp() { System.out.println("Audi S5 ESP fren sistemi kullanır"); }

        @Override
        public void run() { System.out.println("Audi S5 lazer far çalıştırır"); }
    }

//---------------------------
🔹 6. Kullanım (Runner Class)
    public class AudiRunner {
        public static void main(String[] args) {

            AudiS5 s5 = new AudiS5();
            s5.abs();
            s5.run();
            s5.power(); // default method

            System.out.println(Engine.fiyat); // 300
            System.out.println(Brake.fiyat);  // 100

            Engine.speed(); // static method
        }
    }
--------------------------------
🔹 7. Özet Hatırlatmalar

✅ Interface = Yapılması gerekenlerin listesi (To-Do List)
✅ Methodlar → otomatik public abstract
✅ Değişkenler → otomatik public static final
✅ default method → nesne ile çağrılır
✅ static method → Interface adıyla çağrılır
✅ Object oluşturulamaz
✅ Çoklu inheritance desteklenir

 // Abstract method (gövdesiz)
    void methodName();

    // Constant variable (public static final)
    int CONSTANT_NAME = 100;

    // Default concrete method
    default void defaultMethod() {
        System.out.println("Default method çalıştı");
    }

    // Static concrete method
    static void staticMethod() {
        System.out.println("Static method çalıştı");
    }
}
--------------------------------
🚫 Hayır, static metodlar override edilemez.

Ama nedenini de anlayalım 👇

⚙️ Neden Static Methodlar Override Edilemez?
🔹 1. static metodlar class’a (veya interface’e) aittir

Normal (instance) metodlar bir nesneye (object) aittir.

Ama static metodlar class veya interface’e bağlıdır.
Yani, nesne oluşturulmadan da çağrılabilir.

Engine.speed(); // Interface ismiyle çağrılır


Dolayısıyla, alt sınıf (child class) bu methodu nesne üzerinden çağırmaz,
sadece yeniden tanımlayabilir (hide) ama override edemez.

🔹 2. "Override" Ne Zaman Olur?

Bir methodun override edilebilmesi için:

Non-static (örnek/metod) olması,

Aynı imzaya (signature) sahip olması,

Parent–child ilişkisinde bulunması gerekir.

Ama static metodlar bağımsız oldukları için,
dynamic dispatch (runtime polymorphism) işlemez.
Yani override değil, method hiding (gizleme) olur.

public interface Example {

    // Abstract method (gövdesiz)
    void method1();

    // Default method (gövdesi var)
    default void method2() {
        System.out.println("Default method çalıştı");
    }

    // Static method (gövdesi var)
    static void method3() {
        System.out.println("Static method çalıştı");
    }
}

 */
























}
