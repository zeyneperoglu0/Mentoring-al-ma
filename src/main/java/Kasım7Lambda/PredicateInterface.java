package Kasım7Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    public static void main(String[] args) {

//        Predicate<T>: test(), Bir girdiyi alır ve bir koşul testi yapar, sonuç olarak true veya false döndürür
        //Ornek: Verilen listteki cift sayilari yazdiran bir method olusturunuz
//Example: Create a method that prints even numbers in the given list
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
        even(numbers);
        
        
        
        


    }
    public static void even(List<Integer> numbers){


        Predicate<Integer> isEven = x->x%2==0;//koşul kontrolü

        List<Integer> evens = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("evens = " + evens);

    }
    
    
}
