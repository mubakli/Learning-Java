import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dosyaAdi = "cv.txt";
        String name = "Name: Burak ASARCIKLI \n";
        String experience = "Experience: 5 years in java development \n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaAdi))) {
            writer.write(name);
            writer.write(experience);
            System.out.println("cv.txt successfully updated. ");
        } catch (IOException e) {
            System.out.println("Error: File writing unsuccessful.");
            e.printStackTrace();
        }
    }
}
