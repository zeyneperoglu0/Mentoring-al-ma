package Ekim29Exceptons;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Reader {
    public static void main(String[] args) throws IOException {

     FileInputStream file =new FileInputStream("src/main/java/Ekim29Exceptons/file");
     // FileReader file = new FileReader("src/main/java/Ekim29Exceptons/file");
        InputStreamReader file2 = new InputStreamReader(file, StandardCharsets.UTF_8);

        int k = 0;
        while ((k = file2.read())!=-1){
            System.out.print((char) k);
        }


    }
}
