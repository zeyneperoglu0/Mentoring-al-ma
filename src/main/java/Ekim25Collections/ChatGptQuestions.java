package Ekim25Collections;

import java.util.*;

public class ChatGptQuestions {
    public static void main(String[] args) {
/*
✅ Bölüm 1 — Temel İşlemler

📌 Aşağıdaki Map’i oluştur:

        İsim	Maaş
        Ayşe	25000
        Veli	31000
        Ali	27000
        Zeynep	29000

✔ Bu Map üzerinde:

        1️⃣ "Ali"nin maaşını 30000 yap
        2️⃣ "Fatma" maaşı 28000 → Eğer yoksa ekle
        3️⃣ "Veli"beyin maaşını sil
        4️⃣ Konsolda tüm Map’i yazdır

*/

        HashMap<String, Integer> isimMaaş = new HashMap<>();
        isimMaaş.put("Ayşe", 37000);
        isimMaaş.put("Veli", 31000);
        isimMaaş.put("Ali", 27000);
        isimMaaş.put("Zeynep", 29000);

        isimMaaş.replace("Ali", 30000);
        isimMaaş.putIfAbsent("Fatma", 28000);
        isimMaaş.remove("Veli");
        System.out.println(isimMaaş);
/*
✅ Bölüm 2 — Kontrol Soruları

        Aynı Map’ten devam ederek:

        5️⃣ "Ayşe" isimli çalışan Map'te var mı?
        6️⃣ 50000 maaşlı biri var mı?
        7️⃣ "Mehmet" varsa maaşını yazdır yoksa -1 yaz*/


        Boolean b = isimMaaş.containsKey("Ayşe");
        Boolean c = isimMaaş.containsValue(50000);
        System.out.println(b);
        System.out.println(c);
        System.out.println(isimMaaş.getOrDefault("Mehmet", -1));

/*
✅ Bölüm 3 — Döngü Soruları

        8️⃣ Map’i Loop ile gez → Her çalışan için şu formatta yazdır:

        Ayşe : 30000 TL
        Ali : 27000 TL
…


        9️⃣ Maaşların ortalamasını bulup yazdır*/


        Set<Map.Entry<String, Integer>> set = isimMaaş.entrySet();
        int sum = 0;

        for (Map.Entry<String, Integer> w : set) {
            sum = sum + w.getValue();
            System.out.println(w + " TL");

        }
        System.out.println("Ortalama = " + sum / set.size());

/*
✅ Bölüm 4 — Senaryo

        10️⃣ Şirket çalışanları arasında 30000 TL’nin üzerinde maaşı olanların
        isim uzunluğu + maaşlarını topla

        Örnek:
        Ali (3 harf + 27000 TL = 27003)

➡️ Çıkan sonucu ekrana yaz*/

        int top = 0;

        for (Map.Entry<String, Integer> w : set) {

            if (w.getValue() > 30000) {

                top = top + w.getValue() + w.getKey().length();


            }

        }

        System.out.println(top);



/*
🧠 BONUS (Güzel düşünme sorusu)

❓ "Zeynep"’in maaşı 29000 ise 35000 yap, değilse hiçbir şey yapma
➡️ Tek satır kod ile yap
*/

        System.out.println(isimMaaş.replace("Zeynep", 29000, 35000));
        System.out.println(isimMaaş);

   /*🔥 Senaryo Soruları
✅ Soru 1

Aşağıdaki çalışan-maaş Map’ini oluştur:

Çalışan	Maaş
Elif	42000
Cem	38000
Hasan	45000
Kemal	38000
Eda	50000

➡️ Kurallar:

1️⃣ Maaşı 40000’den küçük olanların maaşlarını +3000 artır
2️⃣ Maaşı 50000 olan varsa, “Zam yok ❌” diye bir mesaj yaz
3️⃣ Güncel Map’i yazdır*/

        Map<String, Integer> maaş = new HashMap<>();
        maaş.put("Elif", 42000);
        maaş.put("Cem", 38000);
        maaş.put("Hasan", 45000);
        maaş.put("Kemal", 38000);
        maaş.put("Eda", 50000);
        System.out.println("---------------------------");
        Set<Map.Entry<String, Integer>> a = maaş.entrySet();

        for (Map.Entry<String, Integer> w : a) {
            if (w.getValue() < 40000) {
                maaş.replace(w.getKey(), w.getValue() + 3000);


            } else if (w.getValue() == 50000) {
                System.out.println(w.getKey() + " zam yok ");
            }


        }
        System.out.println(maaş + "yeni maaş");
        System.out.println("---------------------------");


        /*

❗ İpucu yok → tüm mantığı SEN kuracaksın

✅ Soru 2

Bu Map’te maaşı en yüksek olan kişinin:

adını

maaşını

bul ve şu şekilde yazdır:

En yüksek maaş: Eda - 50000 TL


döngü + karşılaştırma kullanman gerek
*/
        Set<Map.Entry<String, Integer>> d = maaş.entrySet();

        int max = maaş.get("Kemal");
        String max2 = "Kemal";
        for (Map.Entry<String, Integer> w : d) {


            if (w.getValue() > max) {


                max = w.getValue();
                max2 = w.getKey();
            }

        }
        Set<String> keys = maaş.keySet();

        System.out.println(max2 + " en yüksek maaş = " + max);










        /*

✅ Soru 3

Maaşı 40000 ve üzerinde olan çalışanları sil
→ Tekrar Map’i yazdır

UYARI ⚠
Döngü içinde doğrudan silmeye kalkarsan hata alırsın
Onu düşünerek çöz 👀
(Burada mantık kurmani istiyorum)

*/
        Set<Map.Entry<String, Integer>> e = maaş.entrySet();

        List<String> sil = new LinkedList<>();
        List<Integer> sil2 = new LinkedList<>();

        for (Map.Entry<String, Integer> w : e) {
            if (w.getValue() > 40000) {
                sil.add(w.getKey());
                sil2.add(w.getValue());
            }
        }
        for (String w : sil){
            maaş.remove(w);
        }
        System.out.println(maaş + " sildik");


            /*



✅ Soru 4

Map’te olmayan "Mehmet" için:

👉 Varsa maaşını yazdır
👉 Yoksa "Bu çalışan sistemde yok" yazdır

getOrDefault mı? başka yöntem mi? → Sen karar ver ✅*/

        System.out.println(maaş.getOrDefault("Mehmet", -1));






/*
🧠 BONUS (Mantık oyunu)

Map’te maaşı tekrar eden kişileri tespit et
Şöyle çıktı ver:

38000 maaşını alan çalışanlar: Cem, Kemal


        Set<Map.Entry<String, Integer>> f = maaş.entrySet();

        Map<Integer, ArrayList<String>> yeni = new HashMap<>();

        for (Map.Entry<String, Integer> w : f) {

            int maas = w.getValue();
            String name = w.getKey();

            // Eğer bu maaş için daha önce liste oluşturulmamışsa → yeni liste oluştur
            if (!yeni.containsKey(maas)) {
                yeni.put(maas, new ArrayList<>());
            }

yeni.get(maas);

        }
        System.out.println(yeni);*/
    }}
