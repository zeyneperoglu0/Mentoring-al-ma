package oop;

public abstract class Shape {

 /*
1. Abstract ve Interface Karışımı (Kod Yazma)

    Bir Shape soyut sınıfı oluştur:
    Özellik: color (String)
    Metot: calculateArea() (abstract), displayColor() (concrete)
    Bir Resizable interface oluştur:
    Metot: resize(double factor)
    Daha sonra Circle sınıfını Shape’den türet ve Resizable’ı implement et:
    Circle özellikleri: radius
    calculateArea() ve resize(double factor) metodlarını doldur
    Soru: Circle nesnesini oluşturup, alanını ve rengini gösteren bir Runner yaz.  */


 private String color ;



 public abstract double calculateArea(double radius, double factor);



 public void displayColor( String color) {
     System.out.println(color+" rengi ayarlandı");
   }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
