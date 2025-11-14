package kasım14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiArraysLambda {

//multi arrayleri cevirirken flapMap kullaniriz yapilis sekli iki turludur
//1) lamda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR




        public static void main(String[] args) {
            String arr[][] = {
                    {"Elma", "Muz"},
                    {"Portakal", "Cilek", "Limon"},
                    {"Havuc","Erik"}
            };
startsWithE(arr);
list(arr);
startsWithEList(arr);
endsWithKAddSymbol(arr);
        }
        // S1 : tum elemanlari list yapayim
public static void list(String arr[][]) {
  List<String> conList =   Arrays.stream(arr).flatMap(t->Arrays.stream(t)).toList();
    List<String> con2List =   Arrays.stream(arr).flatMap(Arrays::stream).toList();
    List<String> co3nList =
            Arrays.stream(arr).flatMap(t -> Arrays.stream(t))
                    .collect(Collectors.toList());
    System.out.println(co3nList);
        }

        // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim

    public static void startsWithE(String arr[][]) {
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.startsWith("E")).forEach(t-> System.out.println(t+t));
    }

        // S3: E ile baslayan elemanlari liste olarak yazdiralim
        public static void startsWithEList(String arr[][]) {
            List<String> a = Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.startsWith("E")).toList();
            System.out.println(a);
        }


        //S4 : k ile bitenlerin sonuna '*' ekleyelim
public static void endsWithKAddSymbol(String arr[][]){
    Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.endsWith("k")).forEach(t-> System.out.println(t + "*"));

    }




























}
