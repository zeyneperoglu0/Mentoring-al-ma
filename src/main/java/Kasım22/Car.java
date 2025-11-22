package Kasım22;

public class Car {


  private   String brand ;
   private String color ;

    public Car(String brand, String color) {
        brand = brand;
       color = color;//eğer bu sekilde thıs olmaz<sa yukardakı değişkene gelen değişkenler atanamaz ❌ model = model;

       // parametre parametreye atanır

//✔ this.model = model;

      // parametre sınıf değişkenine atanır
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
       color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
