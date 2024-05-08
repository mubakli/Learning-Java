import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            double number = sc.nextDouble();
            System.out.println("Your number is " + number);
        }
        catch (InputMismatchException e){
            System.out.println("Error: Input was not a number.");
        }
    }
}
