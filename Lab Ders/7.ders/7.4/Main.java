import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dosyaAdi = "cv.txt";
        String bilgi = "Bu bir test bilgisidir.\n";
        String bilgi2 = "2.deneme \n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
            writer.write(bilgi);
            writer.write(bilgi2);
            System.out.println("Bilgi başarıyla dosyaya yazıldı.");
        } catch (IOException e) {
            System.out.println("Hata: Dosya yazma işlemi sırasında bir hata oluştu.");
            e.printStackTrace();
        }
    }
}
