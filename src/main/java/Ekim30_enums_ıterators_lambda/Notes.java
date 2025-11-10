package Ekim30_enums_ıterators_lambda;

public class Notes {
/*    📌 2. Enum’daki bir sabite erişmek
    Cities il = Cities.AMASYA;
System.out.println(il);  // Çıktı: AMASYA


    Enum sabitlerine EnumAdı.SABİT_ADI şeklinde ulaşılır.
            toString() metodu override edilmediyse sabitin adı yazdırılır.

            📌 3. Enum sabitinin özelliklerine (field’larına) ulaşmak
    String ilIsmi = Cities.BURSA.getCityName();
System.out.println(ilIsmi);  // Çıktı: Bursa


    Enum içinde tanımlanmış get metotları sayesinde özel alanlara (cityName, postalCode, plateCode vb.) ulaşılır.

            📌 4. Ankara’nın posta koduna ulaşmak
    String post = Cities.ANKARA.getPostalCode();
System.out.println(post);


    getPostalCode() metodu, Cities enum’ındaki ilgili alanın değerini döndürür.

📌 5. Antalya’nın plaka koduna ulaşmak
    int plate = Cities.ANTALYA.getPlateCode();
System.out.println(plate);


    Her şehir için tanımlanmış plateCode alanına getPlateCode() metodu ile erişilir.

            📌 6. Kullanıcıdan plaka kodu alıp hangi ile ait olduğunu bulmak
    Scanner input = new Scanner(System.in);
System.out.println("Lütfen plaka kodunu giriniz:");
    int plaka = input.nextInt();


    Scanner sınıfı ile kullanıcıdan konsol üzerinden veri alınır.

            📌 7. Enum’daki tüm sabitleri listelemek (values() metodu)
    Cities[] sehirler = Cities.values();
// System.out.println(Arrays.toString(sehirler));


    values() metodu, enum’daki tüm sabitleri bir dizi (array) olarak döndürür.
            Arrays.toString() ile bu dizi ekrana yazdırılabilir.

📌 8. Girilen plaka kodunun geçerli olup olmadığını kontrol etmek
if (plaka < 1 || plaka > 81) {
        System.out.println("Lütfen 1 ile 81 arasında bir değer giriniz");
    }


    Türkiye’de plaka kodları 1–81 arasındadır.
    Bu kontrol geçersiz değerlerin hata mesajı vermesini sağlar.

            📌 9. Plaka koduna göre şehri bulmak
else {
        for (Cities w : sehirler) {
            if (plaka == w.getPlateCode()) {
                System.out.println("Girmiş olduğunuz plaka " + w.getCityName() + " iline aittir");
                break;
            }
        }
    }


for-each döngüsü ile enum’daki tüm şehirler dolaşılır.

    Girilen plaka, enum’daki getPlateCode() değeriyle eşleşirse şehir adı yazdırılır.

            break ile döngü sonlandırılır (şehir bulunduğunda durur).3️⃣ Iterator Oluşturma
Iterator<String> myItr = myList.iterator();

4️⃣ Iterator ile Eleman Kontrol ve Erişim
while (myItr.hasNext()) {  // Sonraki eleman var mı?
    String el = myItr.next();  // Elemanı al ve pointer’ı ilerlet
}

5️⃣ Iterator ile Eleman Silme
if (el.equals("tom")) {
    myItr.remove(); // Geçerli elemanı sil
}

6️⃣ ListIterator Oluşturma
ListIterator<String> listItr = myList.listIterator();

7️⃣ ListIterator ile Eleman Değiştirme
while (listItr.hasNext()) {
    String el = listItr.next();
    listItr.set(el + " * "); // Geçerli elemanı değiştir
}

8️⃣ ListIterator ile İleri-Geri Dolaşım
ListIterator<String> listItr2 = myList.listIterator(myList.size()); // pointer sondan başa
while (listItr2.hasPrevious()) {
    String el = listItr2.previous(); // Önceki elemanı al
    System.out.println(el);
}*/
}
