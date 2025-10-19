package Interface;

public interface Scanner {

    void scan();

    default void info() { System.out.println("Scanner interface"); }



}
