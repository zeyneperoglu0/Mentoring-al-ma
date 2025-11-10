package Ekim28MapsExceptions;

import Interface.Kullanıcı;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exceptions2 e = new Exceptions2();
        Stock s = new Stock();

//        Set<Map.Entry<String,Integer>> entrySet = s.stock.entrySet();

        s.addStock(s.product, s.quantity, input);

        System.out.println("Güncel stok miktarı : " );  s.displayStock();

        s.usage(input);

        s.stockControl();
        s.displayStock();
    }
}


















