package d20oopcollections;

public class Car implements Engine2,Brake2 {

    @Override
    public void abs() {
        System.out.println("abs fren sistemi kullanılır");
    }

    @Override
    public void esp() {
        Brake2.super.esp();
    }

    @Override
    public void start() {
        System.out.println("Motor çalışıyor");
    }

    @Override
    public void power() {
        System.out.println("210 HP");
    }
}
