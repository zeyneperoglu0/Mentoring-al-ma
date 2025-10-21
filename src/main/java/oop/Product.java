package oop;

public class Product {
    /*
2. Encapsulation + Validation (Kod Yazma)

    Bir Product sınıfı oluştur:
    private alanlar: name, price
    setPrice(double price) → eğer fiyat 0’dan küçükse hata mesajı versin.
            getPrice() → fiyatı döndürsün.
    displayInfo() → ürün bilgilerini yazsın.
🧩 Soru:
    Bu sınıfı yaz.
    Encapsulation burada ne işe yarıyor, açıklayabilir misin?
    private verilere başka bir class üzerinden getter ve setterla kontrollü bir şekilde  erişebileceğiz
    */


    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
      if (price<0){
          System.out.println(" price 0 dan küçük olamaz");
      }else {
          this.price = price;
      }

    }

public void displayInfo(){
    System.out.println("name = " + name);
    System.out.println("price = " + price);
}



}
