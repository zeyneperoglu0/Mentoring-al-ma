package general;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

 String name ;
 int id ;

 List<Integer> grades = new ArrayList<>();

    public Student(String name,int id) {
        this.name = name;
        this.id = id;
    }


    public void addGrade(int score){
    grades.add(score);
      }

   public int getAverage(){
int notes = 0;
for (int w : grades ){
    notes = notes + w;

}
  return notes/grades.size(); }


 public void  printInfo(){

     System.out.println(name);
     System.out.println(id);
     System.out.println(grades);
     System.out.println(getAverage());


 }























}
