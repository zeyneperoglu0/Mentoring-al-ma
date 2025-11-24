package Kasım23;

public class Constructor {

    public static void main(String[] args) {


        Cat c = new Cat();
        System.out.println(c);

        System.out.println(c.name + c.age) ;




Dog d = new Dog("max","gold");
        System.out.println(d.name + " " + d.color );



Book b = new Book();

Book b1 = new Book("Sefiller " , "Victor Hugo ");
        System.out.println(b1.title + " " + b1.author);
        Book b2 = new Book("Sefiller " , "Victor Hugo ",200);
        System.out.println(b2.price  );



   Student s = new Student();
   Student s1 = new Student(11,12,"aaa");
        System.out.println(s1.studentName);

        System.out.println(s.studentGrade);
        System.out.println(s.studentId);
        System.out.println(s.studentName);

Rectangle r1 = new Rectangle(4,6);
Rectangle r2 = new Rectangle(r1);
//r2 r1 den kopyalanmış bir constructor nesnesi
r1.printInfo();
r2.printInfo();

Account a  = new Account(null,-1 );

//ilkten değerler girelim
Car car = new Car("honda",2024);
        System.out.println(car.model + " " + car.year);
//ternarye gircek şek,lde değerler atıyorum
        Car car2 = new Car("",0);
        System.out.println(car2.model +  " " + car2.year );



Point point1 = new Point(4,5);
// Print the values of point1
point1.printPoint();

    // Create a Point object using the double constructor
    Point point2 = new Point(4.5,5.5);
    // Print the values of point2
        point2.printPoint();



//-----------------------------------
        System.out.println("------------------------------");


        // Create an array of student names
        String[] studentArray = {"Andrine", "Ruslan", "Martin"};
        // Create a Classroom object using the parameterized constructor
        Classroom classroom = new Classroom("Science 101", studentArray);
        // Print the values of the instance variables
        classroom.printClassroom();


        Singleton s0 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();









}





}





