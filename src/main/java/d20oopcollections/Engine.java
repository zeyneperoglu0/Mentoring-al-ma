package d20oopcollections;

public interface Engine {

 void eco ();
 void turbo();
 void gas ();
void run();
//------------------------  Concrete
    default void power (){//buunlar da public
        System.out.println("200HP");
    }
static void speed(){
    System.out.println("Saatte 170 KM");  //static olduğu için override edilemez
}




    //---------------------Variables
 int fiyat = 300;//public static final int fiyat=300;


















}
