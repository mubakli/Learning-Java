import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("please enter a Stirng without special characters:");
            String input = sc.nextLine();
            try {
                checkInput(input);
            } catch (InputExection e) {
                System.out.println("Error " + e.getMessage());
                break;
            }
        }
        sc.close();

    }
    public static void checkInput(String input) throws InputExection{
        for(int i = 0; i< input.length(); i++){
            char x = input.charAt(i);
            if(!Character.isLetterOrDigit(x)){
                throw new InputExection("Input contains invalid character!");
            }
        }
    }
}
