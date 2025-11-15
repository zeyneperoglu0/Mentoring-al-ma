package Kasım15;

import java.util.Arrays;
import java.util.List;


public class MethodReference {

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz

    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,2,5,6,7,15,6,8);
//oddPrintWithSpace(intL);
//evenMultiply(intL);
//evenMultiply(intL);
        minusSquareSum(intL);
        posCubesMax(intL);
    }
    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
public static void oddPrintWithSpace(List<Integer> intL){
        intL.stream().filter(t->t%2!=0).map(t-> t + " ").forEach(System.out::print);
}

    // S2: ciftlein carpimini bulalim
public static void evenMultiply(List<Integer> intL){
  int a = intL.stream().filter(t->t%2==0).reduce(1,Math::multiplyExact);
    System.out.println(a);
}

    // S3: negatiflerin kare toplamlarini  bulalim
public static void minusSquareSum(List<Integer> intL){
int a = intL.stream().filter(t->t<0).map(t->t*t).reduce(Integer::sum).get();
    System.out.println(a);
}

    // S4: poziflerin kuplerinden max yazdiralim
public static void posCubesMax(List<Integer> intL){
 int a = intL.stream().filter(t->t>0).map(t->t*t*t).reduce(Math:: max).get();
    System.out.println(a);
}




















}
