package d20oopcollections;

public class AudiRunner {
    public static void main(String[] args) {

 AudiA4 a4 = new AudiA4();
 a4.turbo();//A4 Turbo motor kullanır
 a4.abs();//A4 abs sistemi kullanır
 a4.analog();//A4 analog klima sistemi kullanır
  a4.run();//Audi S5 lazer far çalıştırır
        a4.power();//200HP concrete default method old için object üzerinden çağrılır
        System.out.println("------------------------");
        System.out.println("Engine fiyatı : " + Engine.fiyat);// Engine fiyatı : 300
        System.out.println("Brake fiyatı : " + Brake.fiyat);// Brake fiyatı : 200
        System.out.println("AC fiyatı : " + AC.fiyat);//AC fiyatı : 100

        System.out.println("------------------------");

        AudiS5 s5 = new AudiS5();
   s5.eco();//Audi S5 ekonomik motor kullanır
   s5.abs();//S5 abs sistemi kullanır
   s5.analog();//S5 analog klima sistemi kullanır
    s5.run();//s5 klima çalıştırır
        s5.power();//210 HP override edilmiş default concrete method
     Engine.speed(); //Saatte 170 KM concrete static method old için interface ismi üzerinden çağrılır
        System.out.println("------------------------");
        System.out.println("Engine fiyatı : " + Engine.fiyat);// Engine fiyatı : 300
        System.out.println("Brake fiyatı : " + Brake.fiyat);// Brake fiyatı : 200
        System.out.println("AC fiyatı : " + AC.fiyat);//AC fiyatı : 100




















    }
}
