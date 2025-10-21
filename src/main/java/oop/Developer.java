package oop;

public class Developer extends Employee2{

    public String programmingLanguage = "Java";

    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void displayInfo() {
        super.displayInfo() ;
        System.out.println("programmingLanguage = " + programmingLanguage);
    }
}



