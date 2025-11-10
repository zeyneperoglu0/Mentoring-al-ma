package Interface;

public class AllInOneDevice implements Kullanıcı,Printer {


    @Override
    public void scan() {
        System.out.println("Device is scanned");
    }

    @Override
    public void print(String msg) {
        System.out.println("log " + msg );
    }

    @Override
    public void info() {
      Kullanıcı.super.info();
      Printer.super.info();

        System.out.println("AllInOneDevice info");
    }
}
