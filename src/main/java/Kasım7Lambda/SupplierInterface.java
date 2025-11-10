package Kasım7Lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        
        //Ornek: Rastgele sayi ureten bir method olusturunuz.
//Example: Create a method that generates random numbers.  
//  Supplier<T>: get(), Herhangi bir girdi almadan bir çıktı üretir.   

//random sayı 
        Supplier<Double>random =() -> Math.random(); //boş parantez hiçbir girdi almıyor anlamında 

        Supplier<Double>random2 = Math::random;
        System.out.println("random2.get() = " + random2.get());//neden 0 ve 1 arasında 


        //------------------------sabit sayı döndürmek
        
      Supplier<Double> constant = ()->234.0;
        System.out.println("constant.get() = " + constant.get());
        
        
        Supplier<Boolean> constantBoolean = ()->true;
        System.out.println("constantBoolean.get() = " + constantBoolean.get());
        
        
        
        
        
        
        
        
    }


    
    
    
}

