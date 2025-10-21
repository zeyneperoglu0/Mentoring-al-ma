package oop;

public class Student {

   private String name ;
   private Integer age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age<0){
            System.out.println("yaş 0' dan küçük olamaz");

        }else {
            this.age = age;
        }
    }



public void displayInfo(){
    System.out.println("name = " + name);
    System.out.println("age = " + age);
}










}
