package Ekim28MapsExceptions;

public class ChatGptExcQuestions {
  /*  🧩 Zor Soru 1 – Çoklu Exception

    Bir metot içerisinde aşağıdaki işlemleri yapıyorsun:
    Bir string’i integer’a çeviriyorsun (Integer.parseInt)
    Ardından o integer ile 0’a bölme işlemi yapıyorsun
    Son olarak, bir array’in belirli indeksine erişiyorsun
❓ Eğer tek bir try-catch bloğu kullanırsan ve catch sadece ArithmeticException yakalıyorsa, diğer exception’lar ne olur?
    Program çalışır mı?
    Hangi hatalar yakalanır, hangi hatalar yakalanmaz?
eğer numberFormat exception alırsak ve try catch kullanmazsak program durur eğer hatalı bşr str girmezsek çalışır aritmethic için
0 a bir sayı bölünürse bu bir matematiksel hata olur bu da try catch sayesinde yakaalnır ve app durmaz en son array indexine erişmek için düzgün bir array verirsek ve array indexi dışındaki bşir indexe erişmeye çalışmazsak exception almayız fakat array indexi dşına çıkarsak arrayoutofboundsexception alırız bu da try catch kullanmadığımız için appi durdurur


            🧩 Zor Soru 2 – Try-Catch-Finally Mantığı

    Aşağıdaki kod parçasını düşün:

            try {
        System.out.println("1");
        int a = 10 / 0;
        System.out.println("2");
    } catch (ArithmeticException e) {
        System.out.println("3");
    } finally {
        System.out.println("4");
    }
System.out.println("5");


❓ Çıktı ne olur?
 1
3
 4
  5
  ❓ Finally bloğu neden çalışır, try içi exception oluşsa bile?

            🧩 Zor Soru 3 – Throw vs Throws

    Bir metodun içinde throw new ArithmeticException("Hata"); kullandın.
    Aynı metodu throws ile tanımlamazsan, derleyici ne der?
            ❓ throw ve throws arasındaki farkı açıklayabilir misin?
bunu öğrenmedik daha


            🧩 Zor Soru 4 – Exception Hiyerarşisi

    Exception sınıfı ve RuntimeException farkını düşün:

    Eğer RuntimeException’ı try-catch ile yakalamazsan program çalışmaya devam eder mi?

    Eğer checked exception olan IOException’ı yakalamazsan ne olur?

            🧩 Zor Soru 5 – Nested Try-Catch

    Aşağıdaki senaryoyu düşün:

            try {
        try {
            int a = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println("Inner Catch");
        }
    } catch (ArithmeticException e) {
        System.out.println("Outer Catch");
    }


❓ Çıktı ne olur?
            ❓ Inner catch yakalayamazsa outer catch devreye girer mi?*/

    /*

    🧩 Soru 1 – HashMap ve Null

    Aşağıdaki kodu düşün:

    Map<String, Integer> map = new HashMap<>();
map.put(null, 10);
map.put("Ali", null);
map.put(null, 20);


❓ Çıktı ne olur?
            ❓ Eğer aynı kod Hashtable ile çalıştırılsa ne olur?

            🧩 Soru 2 – ConcurrentHashMap Thread-Safety

    Bir ConcurrentHashMap’e aynı anda iki thread şu işlemi yapıyor:

    Thread 1: map.put("elma", 10)

    Thread 2: map.put("elma", 20)

            ❓ Thread güvenliği sayesinde bu durumda ne garanti edilir?
            ❓ Son değer ne olur, önceden tahmin edilebilir mi?

            🧩 Soru 3 – Try-Catch ve ArithmeticException
    int a = 10;
    int b = 0;
try {
        int c = a / b;
        System.out.println("Burası çalışır mı?");
    } catch (ArithmeticException e) {
        System.out.println("Hata yakalandı");
    }
System.out.println("Kod buradan devam eder mi?");


❓ Çıktı ne olur ve neden?

            🧩 Soru 4 – Nested Try ve ArrayIndexOutOfBounds
    int[] arr = {1, 2, 3};
try {
        try {
            System.out.println(arr[5]);
        } catch (NullPointerException e) {
            System.out.println("Inner catch");
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Outer catch");
    }


❓ Çıktı ne olur?
            ❓ Inner catch devreye girer mi, outer catch devreye girer mi?

            🧩 Soru 5 – NumberFormatException ile Combined
    String s = "123a";
try {
        int x = Integer.parseInt(s);
        int y = x / 0;
    } catch (ArithmeticException e) {
        System.out.println("Arithmetic hatası");
    } catch (NumberFormatException e) {
        System.out.println("Number format hatası");
    }


❓ Çıktı ne olur?
            ❓ Hangi exception önce fırlatılır ve hangisi yakalanır?




    */





















}
