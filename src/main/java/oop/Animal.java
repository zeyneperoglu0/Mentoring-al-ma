package oop;

public abstract class Animal {
   /* . Abstract ve Override (Kod Yazma)

    Bir Animal soyut sınıfı oluştur:
    Abstract metot:
    Concrete metot: eat() → “Animal is eating.” yazsın
    Dog sınıfı Animal’dan türesin ve makeSound()’ı override etsin:
            “Woof woof!” yazsın.
🧩 Soru:
    Kodla göster.
    Abstract metot neden alt sınıfta zorunlu olarak override edilir?*/
//bodysiz ve ortak bir method olduğundan soyut abstract methodu tüm concrete alt sınıflar override etmelşdşr


 public abstract void   makeSound();

    public void eat(){
        System.out.println("Animal is eating");
    }






















}
