package D19OOP;

public class Employee {

   /* ❓ Uygulama Sorusu: “Employee Bilgi Sistemi”
    Kurallar:
    Employee class’ında private değişkenler olsun:
    name (String) → hem okunabilir hem yazılabilir (read-write)
    salary (double) → sadece okunabilir (read-only)
    password (String) → sadece yazılabilir (write-only)
    Getter ve Setter metodlarını kurallara uygun yaz.
    main methodunda:
    Bir Employee nesnesi oluştur
    name’i ekrana yazdır ve değiştir
    salary’yi ekrana yazdır
    password’u değiştir (setter ile), ama ekrana yazdırmayı deneme (read-only olmadığı için hata verir)*/



    private String name = "Zeynep";
    private  double salary = 400000.5;
    private String password = "133974Zeynep";


    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
