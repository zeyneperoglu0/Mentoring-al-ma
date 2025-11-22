package Kasım22;

public class BankAccount {

   private double balance;

   public void account(double balance){
       this.balance = balance;
       System.out.println("bakiye =  " +this.balance);
   }



public void addBalance (double amount){

this.balance = this.balance + amount;
    System.out.println("Bakiye =  " + this.balance);
}

public void decreaseBalance(double amount){

this.balance = this.balance - amount;
    System.out.println("Bakiye =  " + this.balance);
}












}






