import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Check check = new Check();
        String deneme;
        do {
            System.out.println("Please enter your e-mail.");
            check.email = sc.nextLine();
        } while (check.isEmailIllegal());
        do{
            check.bool = false;
            System.out.println("Please enter your IP adress. ");
            check.ipAdress = sc.nextLine();
            deneme = check.splitNumbers(check.ipAdress,check.ipAdress.length());
        }while (check.bool);

    }
}
