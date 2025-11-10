package Ekim28MapsExceptions;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Exceptions2 {

    public  void exc (int quantity){

        try {
            if (quantity<0){
              throw new IllegalArgumentException("sayı neg olamaz");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("negatif bir değer girdiniz lütfen yeniden giriniz");


        }
    }

    public void neverLessThan(String product , int quantity){
        try{
            throw new IllegalArgumentException("stok düşüşü yeniden sipariş ver");

        }catch (IllegalArgumentException e){
            System.out.println("Stok düşüşü yeniden sipariş verilmesi gerekiyor " + product+ " : " + quantity+ " kilo " + " kalmış"   );
        }
    }

    public  void exc3 (int quantity){

        try {
            if (quantity<0){
                throw new IllegalArgumentException("sayı neg olamaz");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("stoğumuz yetersiz yeni  bir değer giriniz");


        }
    }
















}
