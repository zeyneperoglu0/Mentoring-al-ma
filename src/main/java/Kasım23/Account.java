package Kasım23;

public class Account {

 String accountNumber;
 double balance;

    public Account(String accountNumber, double balance) {

        if ( accountNumber == null||accountNumber.isEmpty()){
            System.out.println("account number shouldnt be null or empty");
            return;
        }


        if (balance<0){
            System.out.println("balance shouldnt be negative");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }



}
