package Kasım7Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {


//Ornek: Verilen listteki elemanlari ayri satirlarda konsola yazdiriniz.
//Example: Print the elements in the given list to the console on separate lines.

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> printC = System.out::println;
numbers.forEach(printC);
    }
}
