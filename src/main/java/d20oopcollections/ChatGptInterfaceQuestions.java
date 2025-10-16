package d20oopcollections;

public class ChatGptInterfaceQuestions {
/*
🧩 Java Interface – Bölüm 1

    Soru 1:
    Bir interface’te oluşturulan bir method için hiçbir access modifier veya keyword yazmazsan,
    Java o methodu hangi özelliklerle kabul eder?



            👉 Cevap olarak “_public_ ve _abstract_ olur” şeklinde yaz.



    Soru 2:
    Aşağıdaki method tanımı interface içinde geçerli midir?

    default void start();
Değildir sebebi bodysinin olmaması eğer body olsaydı da concrete method olurdu o zaman interface içinde kullanılabilirdi



(Gerekçe belirtirsen ekstra puan 😉)


    Soru 3:
    Aşağıdaki iki interface aynı isimli variable içeriyor.
    Bu durumda bir problem olur mu?

    interface A { int price = 100; }
    interface B { int price = 200; }

    class C implements A, B { }
soeun olmaz

👉 Eğer sorun olmaz diyorsan, price’a nasıl erişilir?

zaten price static bir değişken olduğu için interface ismi ile çağırılır o yüzden hangi price gelir bu bilinmiş olur


    Soru 4:
    Interface içinde tanımlanan static methodlar override edilebilir mi?
    Eğer edilemezse, Java buna ne ad verir?

Static methodlar override edilemezler ismi : method hiding


    Soru 5:
    Aşağıdaki methodun erişim belirleyicisi (access modifier) nedir?

    default void power() {
        System.out.println("200HP");
Publictir  default acces modifier değil sadece bir keyworddür

**********************************************************************
🧩 Java Interface – Bölüm 2 (Zor)

Soru 1:
Aşağıdaki interface geçerli midir? Eğer değilse neden?

public interface Engine {
    private void log();prvate methodlar bodysiz olamaz
    default void start() {
        log();
        System.out.println("Motor çalıştı");
    }
}


Soru 2:
Aşağıdaki kod parçasında hangi satır hata verir, neden?

interface A { static void method1() { } }


class B implements A {
    void method1() { System.out.println("B method"); } burası statik methodlar override edilemez
}

Soru 3:
Bir interface içinde default ve static methodların çağrılma şekilleri nelerdir?
Kısaca örnekle açıkla.

default void abs(){}
static void abs(){}


Soru 4:
Interface’te aynı isimli değişkenler olabilir. Peki, bir class hem iki interface’den hem de
kendisinden aynı isimli variable’a sahip olursa, hangi variable’a erişilir? Örnekle
.
interface A { int price = 100; }
interface B { int price = 200; }
class C implements A, B {
    int price = 300;
    void showPrices() {
        System.out.println(price);   // class’ın kendi değişkeni → 300
        System.out.println(A.price); // interface A → 100
        System.out.println(B.price); // interface B → 200
    }
}
Yani: class kendi değişkenine öncelik verir, interface’ler interface adıyla çağrılır.





Soru 5:
Aşağıdaki interface tanımını düşün:

interface Engine {
    default void start() {
        System.out.println("Engine start");
    }
}
class Audi implements Engine {
    @Override
    public void start() {
        System.out.println("Audi start");
    }
}


Burada Audi class’ı start() methodunu override etti.
Soru: Eğer Audi nesnesi üzerinden start() çağrılırsa, hangi method çalışır?
Neden?override edilmiş hali çalışır çünkü nesne ütünden çağrılıyor ve o metod override edildi

***********************************************************************

🧩 Java Interface – Bölüm 3 (Orta-Zor)

Soru 1:
Aşağıdaki kod geçerli midir? Geçerli değilse neden?

public interface Engine {
    private static void log();privatelar bodysiz olamazlar
    static void start() {
        log();
        System.out.println("Motor çalıştı");
    }
}




Soru 2:
Bir interface’de hem default hem de private methodlar var.
Private method sadece default methodlar tarafından çağrılabilir mi?
Neden?
Private methodlar sadece interface içinde çağrılabilir, yani:
default methodlar
static methodlar
tarafından çağrılabilirler.
Child class veya dışarıdan nesne üzerinden private methoda erişilemez.


Soru 3:
Bir interface içinde iki farklı interface’den aynı isimli static değişken var.
Class bunları kendi içinde de aynı isimle tanımlarsa, erişim sırası nasıl olur?
Örnekle açıkla.
önce classtaki orijinal adıyla çağrılabilşr diğerleri interface adıyla çagrılır


Soru 4:
Interface’de default ve static methodlar override edilebilir mi?
Eğer edilemiyorsa ne ad verilir?
default edilir
static edilemez method hiding


Soru 5:
Aşağıdaki interface tanımında hangi methodlar nesne üzerinden çağrılabilir?

interface Brake {
    void abs(); bu
    default void esp() { System.out.println("ESP çalıştı"); } bu
    static void autoHold() { System.out.println("AutoHold çalıştı"); } bu interface ismiyle statik old için
    private void helper() { System.out.println("Helper"); } Private method nesne üzerinden çağrılamaz, sadece interface içinde
    helper olarak kullanılır.
}


Cevaplarını yine 1–5 numaralı şekilde yaz, sonra ben tek tek kontrol edip eksik noktaları açıklayayım.


🧩 Kod Yazma Sorusu – Interface Challenge
Görev:

Aşağıdaki interface’leri oluştur:

interface Engine {
    void start();                // abstract method
    default void power() {       // default method
        System.out.println("Engine güç testi: 200HP");
    }
    static void info() {         // static method
        System.out.println("Engine bilgisi: tüm motorlar çevre dostudur");
    }
    private void log(String message) {   // private helper
        System.out.println("Log: " + message);
    }
}/*




















/*
Başka bir interface oluştur:

interface Brake {
    void abs();                  // abstract
    default void esp() {          // default
        System.out.println("ESP çalışıyor");
    }
}


Car adında bir class oluştur ve her iki interface’i implement et.

start() ve abs() methodlarını override et, kendi mesajlarını yazdır.

power() default methodunu kullan.

Engine.info() static methodunu çağır.

CarRunner adında main method içeren bir class oluştur ve şunları yap:

Car nesnesi oluştur

start(), abs(), power() methodlarını çağır

Engine.info() methodunu çağır






































*/
















}
