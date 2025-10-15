package D19OOP;

public  abstract class Shape {

//    Soru 2:
//    Bir Shape abstract class oluştur:
//
//    Abstract method: area() → double döndüren
//
//    Concrete method: display() → "This is a shape" yazsın
//
//    Circle ve Rectangle class’ları oluştur, area’yı override et
//
//    main methodda circle ve rectangle objeleri oluştur, alanları ve display methodlarını çalıştır



  public abstract double area(double r);

    public abstract double area(double a , double b );

    public void shape(){
      System.out.println("This a shape");
  }





}
