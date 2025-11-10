package Ekim28MapsExceptions;

public class Exceptions {
    public static void main(String[] args) {

        //-----------------------
        //1) ArithmeticException : Matematik kurallarinda herhangi bir hata yaparsaniz bu exception'i alirsiniz
//try-catch kullandiginizda sistem tarafindan "try" bolumu calistirilir,
// eger "try" bolumunde hata ile karsilasilmazsa "catch" blogu hic calismaz
//Eger "try" bolumunde hata ile karsilasilirsa hata alinan satirda calisma durdurulur
// ve "catch - yakalamak" bolumu calismaya baslar.
        division(4,0);
        division2(2,0);
        conersion("1234a");
        selectChar("hello",7);
        String[] arr = {"j","a","v","a"};
        array(arr, 7);
    } //main dışı
    public static void division(int a ,int b ){
        try {
            System.out.println(a/b);
            System.out.println("o olamaz");

        } catch (ArithmeticException e) {
            System.out.println("lütfen 0 a bölme işlemi yapmayınız");
        }
        System.out.println(1); // bu kod çalışır exceptionı maskeledik ve uyarı verdik çünkü
    }

    //Throw Exceptions : a/b gibi islem sirasinda degilde, istenmeyen durumu gorunce hatayi biz olusturalim


    public static void division2(int a ,int b ){
        try {
            if (b==0){
                throw new ArithmeticException("Sıfıra bölme hatası ");

            }
        }catch (ArithmeticException e ){
            System.out.println("lütfen 0 a bölme işlemi yapmayınızz");
        }
        System.out.println("devam mı");
    }


//2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
    //ARASTIRMA ODEVI: Java'da alınan hatayı (exception) konsola yazdırmanın yanı sıra, bu hatayı bir dosyaya yazdırmak,
// bir veritabanına kaydetmek veya bir ağ üzerinden disari göndermek mumkun mu?



public static void conersion(String a ){

    try {
        int b = Integer.valueOf(a);
        System.out.println(b + 1 );
    } catch (NumberFormatException e) {
        System.out.println("Rakam dışı karakter kullanmayınız " + e.getMessage());
    }
}


    //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
// geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

public static void selectChar(String s,int index ){
    try {
        System.out.println(s.charAt(index));
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println(" index dışına çıkmayınız " + e.getMessage());
        //e.printStackTrace();//bu developerın exceptionu görmesi için app çalışmaya devam eder
    }
}

    //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
// dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

public static void array(String [] arr , int index ){
    try {
        String a = arr[index];
        System.out.println(a);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("arrayin indexi dışına çıkmayın");



    }

}






    }
