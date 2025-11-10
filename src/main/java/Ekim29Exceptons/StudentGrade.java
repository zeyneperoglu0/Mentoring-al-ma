package Ekim29Exceptons;

import java.util.Scanner;

/*



            🧩 Soru 5 – Custom Exception

    Bir sınıfta öğrencilerin sınav notlarını kontrol eden sistem var.
    Eğer not 0–100 aralığında değilse,
    InvalidStudentGradeException adında kendi özel exception’ını fırlat.

            🧠 İpucu: kendi exception class’ını extends Exception ile oluştur.  */
public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int grade = input.nextInt();
studentGrades(grade);


    }

    public static void studentGrades (int grade ){

       if (grade<0||grade>100){
          try {
              throw new InvalidGradeException("not 100 den büyük veya 0 dan küçük olamaz ");
          }catch (InvalidGradeException e ){
              System.out.println(e.getMessage());
          }
       }else {
           System.out.println(grade);
       }


    }


}
