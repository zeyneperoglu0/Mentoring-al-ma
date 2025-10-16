package d20oopcollections;

public class AudiA4 implements Engine,Brake,AC {

@Override
public void eco (){
    System.out.println("Audi A4 ekonomik motor kullanır");
}
 @Override
public void turbo (){
     System.out.println(" A4 Turbo motor kullanır ");
 }
  @Override
   public void gas(){
      System.out.println(" A4 Benzinli motor kullanır ");

  }

  @Override
  public   void abs(){
      System.out.println("A4 abs sistemi kullanır");
  }

    @Override
  public void analog() {
        System.out.println("A4 analog klima sistemi kullanır");
    }

    @Override
    public void run() {
        System.out.println("Audi S5 lazer far çalıştırır");
    }
}
