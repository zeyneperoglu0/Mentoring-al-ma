package oop;

public class Engine {

  /*  5. Composition (Nesne içinde Nesne)
    Bir Engine sınıfı oluştur:
    Özellik: horsepower
    Bir Car sınıfı oluştur:
    Özellik: brand
    Engine nesnesini içinde tutsun
    Metot: displayCarInfo() – araba markası ve motor gücünü yazsın
🧠 Soru:
    Composition kavramı ne işe yarar, inheritance’tan farkı nedir?*/


 public int horsePower ;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }
}
