package Kasım1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        int skor = 0;
        ArrayList<String > questions = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Question q = new Question( "a","b" , skor);
        System.out.println(q.text);
        questions.add("Java’da miras almak için hangi anahtar kelime kullanılır?");
        questions.add("Veri gizleme (data hiding) ilkesini sağlayan OOP kavramı nedir?");
        questions.add("Bir methodun, aynı isimle farklı parametrelerle tanımlanmasına ne ad verilir?");
        questions.add("Soyut sınıflarda gövdesiz (body’siz) methodlara ne ad verilir?");
        questions.add("Java’da elemanlara hızlı erişim sağlayan, ancak ekleme ve silme işlemleri yavaş olan liste türü hangisidir?");

        q.Questions(input,questions);
        q.printScore();


}




























    }

