package D19OOP;

public class GetSetÖrnBankAccount {

/*❓ Uygulama Sorusu:

    Bir BankAccount class’ı oluştur.
    Kurallar:
    private değişkenler:
    accountNumber (String) → sadece okunabilir (read-only)
    balance (double) → hem okunabilir hem yazılabilir (read-write)
    Getter ve setter metodlarını doğru şekilde yaz.
    main methodunda:
    Bir BankAccount nesnesi oluştur
    accountNumber’ı ekrana yazdır (sadece getter kullan)
    balance’i önce 1000 olarak ayarla, sonra 500 ekle (setter ve getter ile)
    Son olarak balance’i ekrana yazdır*/

private String accountNumber = "123456789";
private  double balance = 1000;


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
