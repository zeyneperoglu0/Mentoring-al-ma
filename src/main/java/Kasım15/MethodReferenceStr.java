package Kasım15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceStr {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");

a(l);
b(l);
   c(l);
    }
    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
public static void a(List<String> l){
        l.stream().map(t->t.toUpperCase() + " ").forEach(System.out::print);
}

    //S2: Stringleri uzunluklarina gore siralayip yaziniz
    public static void b(List<String> l){
        l.stream().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
    }

    //S3: E ILE Baslayanlari yazdiralim
    public static void c(List<String> l){
        l.stream().filter(t->t.startsWith("E")).forEach(System.out::println);
    }
}
