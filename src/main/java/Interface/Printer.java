package Interface;

public interface Printer {

    void print(String msg);

    default void info() { System.out.println("Printer interface"); }

}
