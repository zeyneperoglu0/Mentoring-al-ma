package D19OOP;

public class BankAccRunner {
    public static void main(String[] args) {

     GetSetÖrnBankAccount b = new GetSetÖrnBankAccount();
        System.out.println(b.getAccountNumber());//123456789
        System.out.println(b.getBalance());//1000.0
        b.setBalance(b.getBalance()+500);
        System.out.println(b.getBalance());//1500.0

    }
}
