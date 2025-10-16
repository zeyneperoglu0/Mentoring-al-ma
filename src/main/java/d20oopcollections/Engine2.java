package d20oopcollections;

public interface Engine2 {

  /*
🧩 Java Interface – Kod Yazma Senaryosu
    Senaryo:

    Sen bir otomobil yazılımı geliştiriyorsun.
    Bu otomobilin motor ve fren sistemleri interface’ler üzerinden yönetilecek.

1️⃣ Interface’ler

    Engine: Motorla ilgili methodlar
    Bir abstract method: start() → motoru çalıştıracak
    Bir default method: power() → motor gücünü gösterecek
    Bir static method: info() → motor bilgisi verecek
            (İstersen private helper method ekleyebilirsin)
    Brake: Fren sistemi
    Bir abstract method: abs() → fren sistemini çalıştıracak
    Bir default method: esp() → ESP sistemini gösterecek

️⃣ Class
    Car adında bir class oluştur ve Engine ve Brake interface’lerini implement et
    start() ve abs() methodlarını override et ve kendine özgü mesaj yazdır
    Default methodları kullan (override etmek isteğe bağlı)
    Static methodları interface adıyla çağır
3️⃣ Main Class
    CarRunner adında bir class oluştur
Car nesnesi oluştur

        Aşağıdaki methodları sırayla çağır:
    start()

    abs()

    power()

Engine.info()
        ⚡ Ek Görevler (isteğe bağlı)
    Interface içinde private helper method oluştur ve default method içinde kullan
    Car class’ında default methodu override edip, kendi mesajını ekle*/

  void start();

  default void power(){
      System.out.println("Motor gücü 220 HP");
  }
static void info(){
    System.out.println("eco motor sistemi");
}






}
