package Ekim25Collections;


import java.util.*;

public class Maps {
    public static void main(String[] args) {

        //1) Map'ler sozluk gibidir. Aciklamalidir.  orn: Ali = 13 .Map'ler collections degildir. Ordan miras almaz
//2) Sol taraf yani key'ler tekrarsizdir. Value tarafi tekrarli olabilir.
//3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
//4) Map'in elemanlarina komple 'entry set' (giris elemani) denir.

//put():Bir key-value çiftini map'e ekler.

//1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.

        HashMap<String,Integer> myMap = new HashMap<>();
        myMap.put("Zeynep",21);
        myMap.put("Ayşe",32);
        myMap.put("Ali",19);
myMap.put("Zeynep",24);//key tekrarli kullanilirsa son value aktif olur
        System.out.println(myMap);//{Ayşe=32, Zeynep=24, Ali=19}


        /*✅ 1️⃣ keySet() → Set Çünkü:

        Key’ler benzersiz olmalıdır (duplicate olmaz)

        Sıralama garantisi yok → HashMap rastgele tutar

        Bu yüzden Java, key’leri Set olarak döndürür*/
Set<String > keySide = myMap.keySet();
        System.out.println(keySide);//[Ayşe, Zeynep, Ali]


//values():Map'teki tüm value'ların bir collection'ını döndürür.Collection'ın sırası rastgeledir.
/*✅ 2️⃣ values() → Collection Çünkü:

        Value’lar tekrar edebilir

        Benzersizlik şartı yok

        Hangi Collection türü olacağını Java belirler (List olabilir, başka bir şey olabilir ama Set olmaz)*/

        Collection<Integer> valueSide = myMap.values();
        System.out.println(valueSide);//[32, 24, 19]


//get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir

        System.out.println(myMap.get("Ali"));//19

//Ornek 1: myMap'deki kisilerin yaslarinin ortalamasi nedir?
//Example 1: What is the average age of the people in myMap?


int total = 0;
Collection<Integer> ages = myMap.values();
for (Integer w : ages){

    total = total + w;
    }
    System.out.println(total/ages.size());//25


        //entrySet() metodu, HashMap'in tüm degerlerini içeren (key-value) bir Set döndürür.
// Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
//Bu yuzden ozel method gelistirilmis. Set'in icinde Map yapisi saklanir.

/*✅ entrySet() Kullanımı (Map’i Loop’ta dolaşmak için)

        Map döngüyle direkt dolaşılamaz → Bu yüzden entrySet() kullanılır:*/

Set<Map.Entry<String , Integer>> myEntrySet = myMap.entrySet();
        System.out.println(myEntrySet);//[Ayşe=32, Zeynep=24, Ali=19]

for (Map.Entry<String , Integer> w : myEntrySet){//Map.Entry<String, Integer> kismi data type'di
    System.out.println(w);
//    Ayşe=32
//    Zeynep=24
//    Ali=19

}

//Ornek 2:  Verilen Map'deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
//Example 2: Find the sum of the number of characters and the age of the person names in the given Map.


 Set<Map.Entry<String,Integer>> ort = myMap.entrySet();
int tot = 0;
for (Map.Entry<String,Integer> w : ort){
   tot = tot + w.getValue();


}
 System.out.println(tot);//75


HashMap<String,Integer> newHashMap = new HashMap<>();
newHashMap.put("A",23);
newHashMap.put("D",21);
newHashMap.put("B",22);

Set<Map.Entry<String,Integer>> set = newHashMap.entrySet();
int toplam = 0;
for (Map.Entry<String,Integer> w : set){
   toplam = toplam+ w.getKey().length() + w.getValue();

}
        System.out.println(toplam);//69

/*
✅ 1️⃣ replace() → Value güncelleme
        stdAges.replace("Tom",39);
        System.out.println(stdAges);


→ Key’i kullanarak yeni value atar
➡️ put ile de yapılır ama replace() daha açıklayıcı bir niyet gösterir ✅*/


HashMap<String,Integer> hashMap = new HashMap<>();
hashMap.put("Andrew",38);
hashMap.put("laura",23);
hashMap.put("Tom",25);
hashMap.put("Jack",45);
hashMap.put("Rosa",27);
 hashMap.put("Andrew",29);
        System.out.println(hashMap);//{laura=23, Tom=25, Andrew=29, Jack=45, Rosa=27}
hashMap.replace("Tom" , 43);
        hashMap.replace("Rosa" , 33,34);
hashMap.replace("Rosa" , 27,34);
        System.out.println(hashMap);//{laura=23, Tom=43, Andrew=29, Jack=45, Rosa=34}

//3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
// Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

hashMap.putIfAbsent("Tom",77);
        System.out.println(hashMap);//{laura=23, Tom=43, Andrew=29, Jack=45, Rosa=34}
hashMap.putIfAbsent("Andy",23);
        System.out.println(hashMap);//{laura=23, Tom=43, Andrew=29, Jack=45, Rosa=34, Andy=23}

//4- get() ve getOrDefault() method'lari eger aranan eleman map'te var ise, ikisi de ayni isi yapar
//key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
// bir varsayılan değer sağlama avantajına sahiptir.


        System.out.println(hashMap.get("Andy"));//23
        System.out.println(hashMap.getOrDefault("Andy",32));//23
        System.out.println(hashMap.get("larrson"));//null
        System.out.println(hashMap.getOrDefault("larrson",-1));//-1


//5)containsKey() metodu, Map'te bir key olup olmadığını kontrol eder.
//containsValue() metodu ise, Map'te bir value olup olmadığını kontrol eder.
//Boolean return ederler

        System.out.println(hashMap.containsKey("Tom"));//true
        System.out.println(hashMap.containsValue(23));//true
        System.out.println(hashMap.containsKey("TOm"));//false


 hashMap.put("Lola".toLowerCase(),34);
        System.out.println(hashMap);
//6)remove(); methodu key kullanarak entry silmeye yarar
        System.out.println(hashMap.containsKey("LOLa".toLowerCase()));
hashMap.remove("Lola".toLowerCase());
        System.out.println(hashMap);
//remove(“Can”,19); seklinde kullanilan method, hem key hemde value’yu kontrol eder eslesirse siler yoksa silmez
hashMap.remove("Tom",43);
        System.out.println(hashMap);


        String emoji = "\uD83D\uDC80";
        System.out.println("emoji = " + emoji);//emoji = 💀






    }
}
