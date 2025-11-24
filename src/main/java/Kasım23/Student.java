package Kasım23;

public class Student {
    int studentId;
    int studentGrade;
    String studentName;

    public Student() {
this(123, 89 , "ali");


    }

    public Student(int studentId, int studentGrade, String studentName) {
        this.studentId = studentId;
        this.studentGrade = studentGrade;
        this.studentName = studentName;
        //System.out.println("student oluşturuldu" );


    }



}
