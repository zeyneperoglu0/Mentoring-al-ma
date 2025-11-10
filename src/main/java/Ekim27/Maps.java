package Ekim27;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
  /*
     🔥 MAP SORULARI (Sadece Map bilgisi yeterli)
✅ Soru 1

        Bir String veriliyor:

        "Java öğren, Java kazan, çok çalış kazan"


👉 Kelimelerin kaç defa tekrar ettiğini bulun — büyük/küçük harfe duyarsız
📌 Çıktı örneği:

        java=2
        öğren=1
        kazan=2
        çok=1
        çalış=1  */


       String a = "Java öğren Java kazan çok çalış kazan";
       a = a.toLowerCase();
        Map<String,Integer> count = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList(a.split((" "))));
        List<String> listNew = new ArrayList<>();
int num = 0;

        for (String w : list) {

count.put(w,count.getOrDefault(w,0)+1);

        }

        System.out.println(count);

/*
✅ Soru 2 — Maaş Güncelleme
        Aşağıdaki Map’i oluştur:
        Çalışan	Maaş
        Ahmet	40000
        Ayşe	35000
        Mehmet	38000
        Zeynep	42000
        Ali	39000
➡ Kurallar
        1️⃣ Maaşı 40000’den az olanların maaşını +2000 artır
        2️⃣ Güncel Map’i yazdır
🧠 İpucu
        entrySet() kullan
        replace() ya da setValue() kullanabilirsin (hangisini istersen)
❌ Sakın bunu yapma:
        for(...) {
            map.put(...)  // Doğrudan key değişikliği hataya götürür
        }
✅ Beklenen örnek çıktı:
        {Ahmet=40000, Ayşe=37000, Mehmet=40000, Zeynep=42000, Ali=39000}*/


Map<String,Integer> maaş = new HashMap<>();
maaş.put("Ahmet", 40000);
maaş.put("Ayşe", 35000);
maaş.put("Mehmet", 38000);
maaş.put("Zeynep", 42000);
maaş.put("Ali", 39000);


Set<Map.Entry<String,Integer>> güncelle = maaş.entrySet();

for (Map.Entry<String,Integer> w : güncelle){

    if (w.getValue()<40000){
     maaş.replace(w.getKey(),w.getValue()+ 2000 );
    }
}
System.out.println("maaş = " + maaş );


/*
✅ Soru 3 — En yüksek maaşı bulma
        Aynı Map üzerindeyiz 👇
➡ En yüksek maaş alan kişinin:

✔️ Adını
✔️ Maaşını
        bul ve şöyle yazdır:
        En yüksek maaş: Zeynep - 42000 TL
🧠 İpucu
        int max = Integer.MIN_VALUE;
        String maxName = "";
        Sonra:
        döngü → karşılaştırma → güncelleme → çıktı
⚠ Dikkat:
        Key: çalışan adı
        Value: maaş → karşılaştıracağın değer bu*/


int max = Integer.MIN_VALUE;
String maxname = "";


Set<Map.Entry<String,Integer>> maxi = maaş.entrySet();

for (Map.Entry<String,Integer> w : maxi){

  if (w.getValue()>max){
      max = w.getValue();
      maxname = w.getKey();
  }

}
        System.out.println( "En yüksek maaş alan kişi:  " +maxname + " Maaşı: " + max);

/*
✅ Soru 4 — Departmana göre grup yapma
➡ Klasik çalışan map’inden departmana göre çalışan isimlerini gruplayacağız

        Çalışanlar:
        Ad	Department
        Ahmet	IT
        Ayşe	HR
        Mehmet	Sales
        Zeynep	IT
        Ali	Finance
✅ Hedef Map Yapısı:
        IT=[Ahmet, Zeynep]
        HR=[Ayşe]
        Sales=[Mehmet]
        Finance=[Ali]
🧠 İpuçları:

✅ value → ArrayList<String> olacak
✅ getOrDefault() ya da containsKey() kullanabilirsin
✅ entrySet() ile dolaş*/

      /*  Mini Şablon
        Map<String, ArrayList<String>> depMap = new HashMap<>();
        for (Map.Entry<String, Integer> w : maaş.entrySet()) {
            String name = w.getKey();
    ??? department = ???  // Dikkat! nereden alacaksın?
        // ekleme işlemi
        }
⚠ Maaş map’inde department yok →
        Az önceki Employee Class Map’ine dönüp — onun üzerinden yapacağız ✅*/

Map<String,String> dept  = new HashMap<>();
       dept.put("Ahmet", "IT");
       dept.put("Ayşe", "HR");
       dept.put("Mehmet", "Sales");
       dept.put("Zeynep", "IT");
       dept.put("Ali", "Finance");
Set<Map.Entry<String,String>> entrySet = dept.entrySet();
Map<String , ArrayList<String>> gruplama = new HashMap<>();


for (Map.Entry<String,String> w : entrySet){

String name = w.getKey();
String department = w.getValue();

gruplama.putIfAbsent(department,new ArrayList<>());
gruplama.get(department).add(name);




}
        System.out.println(gruplama);


/*
✅ Soru 5 — Maaşa Göre Gruptandır + Sıralı Yazdır

        Aşağıdaki çalışan map’ini (adı → maaş) kullan:

        Ad	Maaş
        Ahmet	40000
        Ayşe	35000
        Mehmet	38000
        Zeynep	42000
        Ali	39000
        Fatma	35000
        Hasan	42000*/

        Map<String , Integer> maaşÇalışan = new HashMap<>();










/*
🧠 Görevler:

        1️⃣ Yeni bir Map oluştur:

        Map<Integer, ArrayList<String>> salaryGroups


        2️⃣ Maaşları key, aynı maaşa sahip kişileri liste olarak value yap

        3️⃣ Key’leri artan sırada yazdır (35000 → 38000 → 39000 → 40000 → 42000)

✅ Beklenen örnek çıktı
        35000 = [Ayşe, Fatma]
        38000 = [Mehmet]
        39000 = [Ali]
        40000 = [Ahmet]
        42000 = [Zeynep, Hasan]

🔍 İpuçları
        salaryGroups.putIfAbsent(salary, new ArrayList<>());
        salaryGroups.get(salary).add(name);


📌 Key’leri sıralamak için:
        TreeMap kullanabilirsin veya
        KeySet’i listeye çevirip sort() edebilirsin*/

































    }
}
