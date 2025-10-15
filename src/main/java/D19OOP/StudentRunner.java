package D19OOP;

public class StudentRunner {

    public static void main(String[] args) {



     Student s = new Student();
        System.out.println(s.getAge());//21
        s.setAge(12);//age i değiştirdim burda//12
        System.out.println(s.getAge());//artık setlediğim değişken gelcek buraya--12
        System.out.println(s.isSuccessful());//true
        s.setSuccessful(false);//setliyoruz burda
        System.out.println(s.isSuccessful());//şimdi yine değiştitdiğim gelcek--false





    }
}
