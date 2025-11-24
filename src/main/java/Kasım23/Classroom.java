package Kasım23;

public class Classroom {

String className;
String[] students ;

    public Classroom(String className, String[] students) {
        // Initialize instance variables with provided parameters
        this.className = className;
        this.students = students;
    }

    public void printClassroom() {
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();}






}
