package D19OOP;

public class Student{

//Ornek: Student class'i icinde data girislerini yaptiktan sonra getter ve setter method'larini uygulayiniz.

public String name = "Zeynep";
private int age = 21;
private boolean successful = true;

//1- age ve successful datalarini okunabilir yapalim. Getter metodu okuma yaptigi icin parametre almaz


    public int getAge() {
        return age;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setAge(int age) {
        this.age = age;// burda değişiklik yapabiliriz mesela yaşa 12 diyelim

    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;;// burda değişiklik yapabiliriz mesela false diyelim
    }
}






