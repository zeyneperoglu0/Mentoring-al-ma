package Ekim29Exceptons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class TryCatch {
    public static void main(String[] args) {


        FileInputStream file = null;
        try {
            file = new FileInputStream("src/main/java/Ekim29Exceptons/file");
        } catch (FileNotFoundException e) {

        }
        // FileReader file = new FileReader("src/main/java/Ekim29Exceptons/file");
        InputStreamReader file2 = new InputStreamReader(file, StandardCharsets.UTF_8);

        int k = 0;
        while (true) {
            try {
                if (!((k = file2.read()) != -1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print((char) k);
        }


    }
}
