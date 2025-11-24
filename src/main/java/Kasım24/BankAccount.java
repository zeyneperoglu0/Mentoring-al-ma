package Kasım24;

public class BankAccount {

int balance;



public void deposit(int amount){
this.balance = this.balance + amount;
}


public void widthdraw(int amount){
  if (this.balance<100||this.balance-amount<100){
      System.out.println(" hesabınızda 100 tl ve üzeri miktarda para olması lazım ");
  }else {
      this.balance = this.balance-amount;
  }




}

}
