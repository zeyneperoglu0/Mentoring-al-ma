package d20oopcollections;

public class CarRunner {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();//Motor çalışıyor
        Engine2.info();//eco motor sistemi
        c.power();//210 HP
        c.abs();//abs fren sistemi kullanılır
        c.esp();//Esp sistemi çalıştırılıyor
       /* AudiS5 a5 = new AudiS5();
        a5.run();BUNLAR FARKLI İNTERFACEDE DEĞİL Mİ BURDAN NASIL ULAŞIYORUM????
        a5.analog();*/

    }
}
