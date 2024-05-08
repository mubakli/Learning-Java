import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("number.txt");
        ArrayList<Integer> IntList = new ArrayList<Integer>();
        try {
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNext()){
                try{
                    int number = fileScanner.nextInt();
                    IntList.add(number);
                }catch (InputMismatchException e){
                    System.out.println("Error: file has invalid characters!");
                    break;
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("Error: The file is not found!");
        }
        System.out.println(IntList);
    }
}
