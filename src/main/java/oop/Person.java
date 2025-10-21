package oop;

public class Person {

    private  String name ;
    private  int age ;


    public void setName(String name) {
this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {
this.age = age;
    }


    public void sayHello(String name){
       System.out.println("Hello, my name is "+ name);
   }
    public void isAdult(int age){
        boolean a = true;
        boolean b = false;
        if (age>=18){

            System.out.println(a);
        }else {
            System.out.println(b);
        }
  }
//    public boolean isAdult() {
//        return age >= 18;
//    } bu da çalışır






}
