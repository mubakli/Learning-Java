import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayac = 0;
        String paragraph = " ali ata bin.";

        for(int i = 0; i < paragraph.length();i++){
            char character = paragraph.charAt(i);
            if(Character.isWhitespace(character) || !Character.isLetter(character)){
                continue;
            }
            else{
                sayac++;
            }

        }
        System.out.println("Girilen paragraftaki karakter sayısı = " + sayac);
    }
}