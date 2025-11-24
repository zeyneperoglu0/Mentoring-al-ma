package Kasım23;

public class Cat {
/*
1. Default Constructor

    Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default
    constructor that initializes the name to "Unknown"
    and the age to 0. Print the values of the variables.
*/

   String name;
   int age;


    public Cat() {
        this.name = "UNKNOWN";
        this.age = 0;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
