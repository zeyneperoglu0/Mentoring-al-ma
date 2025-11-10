package Kasım1;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    String text ;
    String answer;
int skor ;


    public Question(String text,String answer, int level ) {
        this.skor = skor;
        this.answer = answer;
        this.text = text;
    }

public void Questions(Scanner input , ArrayList<String> questions ) {
    for (int i = 0; i < questions.size(); i++) {
        System.out.println(questions.get(i) + "1" + " . sorunun cevabı nedir ?");
        String cevap = input.nextLine();

        if (i == 0 && cevap.equalsIgnoreCase("extends")) {
            System.out.println("Tebrikler doğru cevap");
            skor++;

        } else if (i == 1 && cevap.equalsIgnoreCase("encapsulation")) {
            System.out.println("Tebrikler doğru cevap");
            skor++;

        } else if (i == 2 && cevap.equalsIgnoreCase("overload")) {
            System.out.println("Tebrikler doğru cevap");
            skor++;

        } else if (i == 3 && cevap.equalsIgnoreCase("abstract")) {
            System.out.println("Tebrikler doğru cevap");
            skor++;

        } else if (i == 4 && cevap.equalsIgnoreCase("arraylist")) {
            System.out.println("Tebrikler doğru cevap");
            skor++;

        } else {
            System.out.println("Yanlış cevap verdiniz");


        }

    }


}


public void printScore( ){
    System.out.println("skor : " + skor);
}





}
