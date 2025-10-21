package oop;

public class Manager extends Employee implements Promotable {


    @Override
    public void calculateBonus() {
double bonus=salary*0.3;
        System.out.println("Bonus : " + bonus);
    }

    @Override
    public void displayEmployeeİnfo() {
       super.displayEmployeeİnfo();
    }

    @Override
    public void promote(String level) {
        System.out.println(name + " promoted to " + level );
    }
}
