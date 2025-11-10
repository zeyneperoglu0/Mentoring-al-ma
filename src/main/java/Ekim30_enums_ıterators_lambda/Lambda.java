package Ekim30_enums_ıterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {



/*

🧩 Şimdi sadece bu kısma göre (stream + forEach) sorular 👇
            1️⃣ Bir List<Integer> oluştur. İçine birkaç sayı koy.
            → Sonra lambda kullanarak tüm elemanları yazdır.

            2️⃣ Aynı listeyi klasik for-each ile yazdır.
→ Yani iki yöntemi de kıyasla.

3️⃣ Bir List<String> oluştur (örneğin: Ali, Can, Ayşe, Veli).
            → Lambda ile her ismi büyük harfle yazdır.
            (İpucu: t -> System.out.println(t.toUpperCase()))

            4️⃣ Bir List<Integer> oluştur.
→ Lambda ile her sayının 2 fazlasını ekrana yazdır.
            (İpucu: t -> System.out.println(t + 2))

*/



List<String> names = new ArrayList<>(Arrays.asList( "Ali", "Can", "Ayşe","Veli" + "\n"));
        System.out.println(" ");
names.stream().forEach(t-> System.out.print(t.toUpperCase() + " "));

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,4,6,8,9,12));
        nums.stream().forEach(t-> System.out.println(t));
nums.stream().forEach(t-> System.out.println(t+2));





    }







}
