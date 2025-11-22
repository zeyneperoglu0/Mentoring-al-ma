package Kasım22;

public class LaptopRunner {

    public static void main(String[] args) {


  Cpu cpu = new Cpu();
  cpu.cores=8;
  cpu.speed = 3.5;

Laptop laptop= new Laptop();
laptop.cpu=cpu;
laptop.brand ="x";


        System.out.println("markası : " + laptop.brand +  " cpu hızı : " + cpu );




    }

}
