package oop;

public interface Movable {
 /*
    4. Interface (Teori + Kod)
    Bir Movable interface oluştur:
    Metot: move()
    Bir Car sınıfı Movable’ı implement etsin.
            move() → “Car is moving” yazsın.

🧠 Soru:

    Interface içinde metotlar neden gövdesiz (abstract) tanımlanır?
çünkü interfaceteki tüm methodlar static ve default hariç abstract kabul edilir ki implement edilsin
    Car sınıfı Movable’ı implement ettiğinde neden move() metodunu yazmak zorundadır?*/
//  🧠 1. “Interface içinde metotlar neden gövdesiz (abstract) tanımlanır?”
//
//Çünkü interface, “ne yapılacağını” söyler ama “nasıl yapılacağını” değil.
//Gövdesiz olmalarının sebebi, uygulamanın detayını interface’i implement eden sınıfa bırakmaktır.
//
//🧠 2. “Car sınıfı Movable’ı implement ettiğinde neden move() metodunu yazmak zorundadır?”
//
//Çünkü interface’teki metotlar abstracttır (yani içi boştur).
//Car sınıfı o davranışın nasıl gerçekleşeceğini tanımlamak zorundadır.
//Aksi halde sınıf da abstract olmak zorunda kalır.
//
//
//
//
//    çünkü interfaceteki methodlar abstracttır

  void move();













}
