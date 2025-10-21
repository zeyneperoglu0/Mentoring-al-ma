package oop;

public class Employee2 {

 /*   2. Inheritance ve super() (Kod Tamamlama)

    Bir Employee sınıfın ve ondan türeyen Developer sınıfın olsun.
    Employee içinde:

    Özellikler: name, salary
    Constructor: name ve salary alsın
    displayInfo(): bilgileri yazsın
    Developer, Employee’den türesin ve:
    Ek özellik: programmingLanguage
    Constructor: tüm alanları alsın
    displayInfo()’yı override edip ayrıca dili de yazsın

🧩 Soru:
    Bu iki sınıfı kodla ve main içinde bir Developer nesnesi oluşturup bilgileri göster.*/

public String name ;
public int salary ;


    public Employee2(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }

public void displayInfo(){
    System.out.println("name = " + name);
    System.out.println("salary = " + salary);
}






















}
