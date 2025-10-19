package general;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
List<Student> name = new ArrayList<>();


for (int i = 1; i < 4; i++) {
            System.out.println( i + ". Öğrencinin adını giriniz");
            String isim = input.nextLine();

            System.out.println( i + ". Öğrencinin ID 'sini giriniz");
            int no = input.nextInt();

    Student s = new Student(isim,no);

            for (int k = 1; k < 3; k++) {
                System.out.println(isim + " adlı Öğrencinin " +  k  + ". notunu giriniz");
                int not = input.nextInt();
                input.nextLine();
                s.addGrade(not);
            }
   name.add(s);
        }

for (Student s : name) {
    s.printInfo();
}




}}
















