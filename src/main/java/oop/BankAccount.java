package oop;

import java.sql.DataTruncation;

public class BankAccount {

/*
    Bir BankAccount sınıfı oluştur:

    Private alanlar: accountNumber (String), balance (double)

    Metotlar: deposit(double amount), withdraw(double amount), getBalance()

    Soru: Eğer balance negatif olamazsa, withdraw metodunu nasıl değiştirirsin?*/


  private String accountNumber = "123457z";
  private  double balance = 200000.0 ;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){
   balance = balance + amount;
        System.out.println("Hesabınıza "+ amount +" tl  para yattı ");
  }

public void withdraw(double amount){

     if (amount<= balance){
         balance =balance- amount;
         System.out.println("Hesabınızdan "+ amount +" tl para çekildi");
     }else {
         System.out.println(amount +" tl için bakiyeniz yetersiz");

     }

}



public void getBalance1(){
    System.out.println("Bakiyeniz : " + balance);
}











}
