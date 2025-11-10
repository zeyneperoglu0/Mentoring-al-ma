package Ekim30_enums_ıterators_lambda;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeRunner {
    public static void main(String[] args) {


  CoffeeType kahve = CoffeeType.MOCHA;
        System.out.println(kahve);

String kahveismi = CoffeeType.AMERICANO.getCoffeeName();
        System.out.println(kahveismi);

double price = CoffeeType.AMERICANO.getCoffeePrice();
        System.out.println(price);
CoffeeType[] datas = CoffeeType.values();
        System.out.println(Arrays.toString(datas));

        Scanner input = new Scanner(System.in);






    while (true) {

        System.out.println("Hangi kahveyi isityorsunuz");
        String hangiKahve = input.nextLine();
        boolean bulundu = false;
        for (CoffeeType w : datas) {

            if (hangiKahve.equalsIgnoreCase(w.getCoffeeName())) {
                bulundu = true;
                System.out.println(w.getCoffeeName() + " " + w.getCoffeePrice() + " tl");
                break;

            }

        }if (bulundu){
            break;
        }
        if (!bulundu) {
            try {
                throw new IllegalArgumentException("Böyle bir kahve yok");
            } catch (IllegalArgumentException e) {
                System.out.println("Başka bir kahve ismi giriniz");
                continue;
            }
        }
    }













    }
}
