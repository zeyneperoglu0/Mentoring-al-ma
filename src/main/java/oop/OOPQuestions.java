package oop;

public class OOPQuestions {

/*
1. Kavram Sorusu

    Java’da bir sınıf (class) ve nesne (object) arasındaki fark nedir? Örnekle açıkla.

class variable method gibi aktif ve pasif öğeleri içeren bir sınıftır
object ise classtan üretilir classtaki aktif ve pasif özellikleri kullanmamızı çağırmamızı sağlar




            2. Kod Okuma Sorusu

    Aşağıdaki Java kodunu incele:

    class Animal {
        String name;

        void makeSound() {
            System.out.println("Some generic sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal a = new Dog();
            a.makeSound();
        }
    }


    Bu kod çalıştırıldığında ekrana ne yazdırılır?

Woof yazar


    Neden Dog sınıfının makeSound metodu çalıştırılır, Animal’ın değil?

ikisinde de aynı makesound methodu olmasına rağmen ve animal objesi üzerinden bu methodu çağırmamıza rağmen dog sınıfındaki method override edildiği için dog sınıfınınki çalışır overrideın önceliği vardır.


            3. Kod Yazma Sorusu

    Bir Person sınıfı oluştur. Özellikleri: name ve age.
            Metotlar:

    sayHello(): "Hello, my name is [name]" yazdırsın.

            isAdult(): Eğer age >= 18 ise true, değilse false dönsün.

            İpucu: OOP prensiplerini kullan (encapsulation vs).
















            4. Polimorfizm Sorusu

    Aşağıdaki açıklamayı tamamla:

    Polimorfizm, Java’da bir nesnenin birden fazla formda davranabilmesidir. Bu, _overriding______________ ve _____overload__________ kullanılarak sağlanır.



5. Soyutlama ve Arayüz Sorusu


    Abstract class ile Interface arasındaki fark nedir?

abstract class concrete method içerebilirler
etxends ettiği tüm classlar abstract class değilse abstract classın  içindeki methodlar  bu classlardan override edilmek zrundadır ve miçindeki methodun başına ve class isminin yanına absttract yazılma şartı vardır





Interface normalde içeremez static ve default keywoedleri ile içerebilirler
ınterfaceler zaten abstract classlardır implement ettiği sınıflar methodları default veya static keywordu yoksa override etmek zorudadır




    Hangisi bir sınıfa çoklu davranış kazandırmak için daha uygundur?
ınterface






2. Polimorfizm ve Override (Kod Okuma)

    Aşağıdaki kodu incele:

    class Vehicle {
        void start() {
            System.out.println("Vehicle starting...");
        }
    }

    class Car extends Vehicle {
        @Override
        void start() {
            System.out.println("Car starting...");
        }

        void playMusic() {
            System.out.println("Playing music...");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Vehicle v = new Car();
            v.start();
            // v.playMusic();   // Bu satırı çalıştırırsak ne olur? Neden?
        }
    }


    Ekrana ne yazdırılır? Car starting...

            v.playMusic() neden hata verir?
hata vermez bence zaten startta da car sınıfının methodları çalışıyor yani playmusicte o classta var
            3. Encapsulation ve Getter/Setter Sorusu



            4. Çoklu Interface (Teori)

    Java’da bir sınıf hem Flyable hem Swimmable interface’lerini implement edebilir.



            Soru: Bu durumda polimorfizm ile nesneyi hangi tipte kullanabilirsin?

override


    Neden interface çoklu davranış için abstract class’tan daha uygundur?

bir classın birden fazla interfacei implement edilmesine olanak sağlar multiple inheritance

            5. Soru: Abstract vs Concrete Method

    Aşağıdaki cümleyi tamamla:

    Eğer bir abstract sınıfın içinde concrete bir metot varsa, bu metodu alt sınıflar isterse override eder, istemezse de kullanabilir.
    Eğer metod abstract ise, alt sınıflar zorunlu olarak override etmelidir.


2. Polimorfizm ve Override (Kod Okuma)
    class Animal {
        void sound() {
            System.out.println("Generic sound");
        }
    }

    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow");
        }

        void purr() {
            System.out.println("Purr...");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal a = new Cat();
            a.sound();
            // a.purr(); // Bu satır çalışır mı? Neden?
        }
    }


    Ekrana ne yazdırılır?
Meow
            a.purr() çalışır mı, neden? çalışmaz çünkü Animalsta purr diye bir method yok

            3. Encapsulation ve Validation (Kod Yazma)

    Bir Student sınıfı oluştur:

    Private alanlar: name (String), age (int)

    Getter/Setter metodları:

    setAge(int age) → age 0’dan küçük olamaz, kontrol et

    getAge() → yaş değerini döndür

    Metot: displayInfo()

4. Çoklu Interface (Teori)

    Java’da bir sınıf hem Readable hem Writable interface’lerini implement edebilir.
evet
            Soru:

    Polimorfizm ile nesneyi hangi tipte kullanabilirsin?
override overload burda tip derken nasıl yani

    Interface çoklu davranış için neden abstract class’tan daha uygundur?
    ınterface sayesinde java  multiinheritanceı destekler
            5. Access Modifier Sorusu (Teori + Kod)

    Aşağıdaki soruyu cevapla ve gerekirse kodla göster:

    class Parent {
        private int a = 5;
        protected int b = 10;
        public int c = 20;
    }


    Child sınıfından hangi alanlara direkt erişebilirsin?
 protected int b = 10;
        public int c = 20;
    Child sınıfının bir methodu üzerinden private alana nasıl erişebilirsin?
    getter setter
*/



}
