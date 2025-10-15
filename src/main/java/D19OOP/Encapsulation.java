package D19OOP;

public class Encapsulation {
/*🧩 Encapsulation (Kapsülleme) — Özet
🎯 Tanım:

    Encapsulation, verileri (field’ları) dış dünyadan gizleyip, onlara kontrollü erişim sağlamaktır.
    Amaç: veri güvenliği ve kontrollü veri yönetimi ✅

            🔐 Nasıl yapılır?

    Veriyi gizle (data hiding):
            ➜ Değişkenleri (fields) private yaparsın.
            (Yani diğer class’lar o değişkeni direkt göremez.)

    Okuma işlemi (read):
            ➜ get() metoduyla yapılır.

    public String getIsim() { return isim; }


    Yazma işlemi (write):
            ➜ set() metoduyla yapılır.

    public void setIsim(String isim) { this.isim = isim; }


    Hem oku hem yaz:
            ➜ İkisini birden tanımlarsan, veri hem okunabilir hem değiştirilebilir.

💬 Örnek:
    public class Person {
        private String isim;  // gizli (private) veri
        private int yas;

        // okuma (getter)
        public String getIsim() {
            return isim;
        }

        // yazma (setter)
        public void setIsim(String isim) {
            this.isim = isim;
        }

        // sadece okunabilir örnek
        public int getYas() {
            return yas;
        }
    }

💡 Ek Bilgi (bunu da bil bebiş 😉)

    Encapsulation, sadece veriyi gizlemekle kalmaz, aynı zamanda veriye nasıl erişileceğini kontrol etmeni sağlar.

            Getter/setter içinde ek koşullar veya kontroller de yazabilirsin:

    public void setYas(int yas) {
        if (yas > 0) this.yas = yas;
        else System.out.println("Yaş negatif olamaz!");
    }


🔹 Böylece yanlış veri girişlerini engellemiş olursun (veri güvenliği artar).*/


}
