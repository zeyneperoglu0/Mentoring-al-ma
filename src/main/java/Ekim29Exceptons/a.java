package Ekim29Exceptons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*🧩 Soru 4 – finally bloğu

Bir dosyayı okumaya çalışan bir metot yaz.
Dosya bulunamazsa hata versin ama
finally bloğunda her durumda “Dosya bağlantısı kapatıldı” yazsın.

🧠 İpucu: FileReader, IOException, finally üçlüsünü düşün.*/
public class a {


    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr =null;
        try {
             fr = new FileReader("src/main/java/Ekim29Exceptons/file");
        } finally {
            System.err.println("Dosya bağlantısı kapatıldı");
        }

int k = 0;

while (true){

    try {
        if (!((k  = fr.read())!=-1)) {

        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    System.out.print((char) k);
}

    }


}
