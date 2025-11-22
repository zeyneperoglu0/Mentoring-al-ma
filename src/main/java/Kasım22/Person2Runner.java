package Kasım22;

public class Person2Runner {
    public static void main(String[] args) {



  Person2 p1 = new Person2("zeynep",21);
  Person2 p2 = new Person2("Ali",27);
  Person2 p3 = new Person2("Ayşe",34);

p2.setAge(67);

        System.out.println(p1.getAge() +" " + p1.getName());
        System.out.println(p2.getAge()+" "  + p2.getName());
        System.out.println(p3.getAge()+" "  + p3.getName());





    }



}
