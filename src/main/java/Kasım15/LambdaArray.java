package Kasım15;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LambdaArray {
    public static void main(String[] args) {

        // Arraylerde Stream kullanabilmek icin 2 yol vardir
        // 1) Stream <Integer> isim=StreamOf(cevrilecek olan) -> Stream objesi
        // 2) Arrays.stream(arr).  ->  Array sinifindan yararlanarak
        //Array ler collection sinifinda degillerdir..set ve MAp ler gibi degildir..
        // kullanabilmek icin donusum yapilmalidir

        Integer arr1 [] ={1,5,-5,6,12,-8,9,3,4};
arrayAsList(arr1);
arrayAsListSum(arr1);
arrayAvg(arr1);
    }
    //S1: arrayin elemanlarini bir liste yazdiralim
public static void arrayAsList(Integer arr1 []) {
    List<Integer> a = Arrays.stream(arr1).toList();
    System.out.println(a);
}

    //S2: Arrayin elemanlarini toplamini bulalim
    public static void arrayAsListSum(Integer arr1 []) {
Optional<Integer> sum = Stream.of(arr1).reduce((u, t)->u+t);
        System.out.println(sum.get());

    }
    // S3: Array in elemanlarinin ortalamasini bulalim yazdir
    public static void arrayAvg(Integer arr1 []) {
      int avg =   Arrays.stream(arr1).reduce((u,t) -> u + t ).get();
        System.out.println(avg/arr1.length);
        //2.yol
        double avg2 = Arrays.stream(arr1)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(avg2);
    }



}

