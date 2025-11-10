package Interface;

public interface Kullanıcı {

    void scan();

    default void info() { System.out.println("Scanner interface"); }



}
