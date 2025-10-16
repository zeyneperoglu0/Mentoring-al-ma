package d20oopcollections;

public class AudiS5 implements Engine,AC,Brake {

    @Override
    public void eco (){
        System.out.println("Audi S5 ekonomik motor kullanır");
    }
    @Override
    public void turbo (){
        System.out.println(" S5 Turbo motor kullanır ");
    }
    @Override
    public void gas(){
        System.out.println(" S5 Benzinli motor kullanır ");

    }

    @Override
    public   void abs(){
        System.out.println("S5 abs sistemi kullanır");
    }

    @Override
    public void analog() {
        System.out.println("S5 analog klima sistemi kullanır");
    }

    @Override
    public void run() {
        System.out.println("s5 klima çalıştırır");
    }

    @Override
    public void power() {
        System.out.println("210 HP");;//istersem concrete default methodu override edebilirim
    }
}
