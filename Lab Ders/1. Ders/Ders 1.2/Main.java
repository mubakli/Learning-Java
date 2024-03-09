import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chosenProcess = 0;
        double balance = 1000;
        double request = 0;
        while (chosenProcess != 4) {
            System.out.println("1- Withdraw");
            System.out.println("2- Deposit");
            System.out.println("3- Balance info");
            System.out.println("4- quit");
            System.out.println("please enter a number: ");
            chosenProcess = sc.nextInt();
            switch (chosenProcess) {
                case 1:
                    System.out.println("Enter withdraw request: ");
                    request = sc.nextInt();
                    if (request > balance) {
                        System.out.println(" insufficient balance your balance is " + balance);
                    } else {
                        balance -= request;
                        System.out.println(" Your new balance = " + balance);
                    }
                    break;
                case 2:
                    System.out.println("Enter deposit request: ");
                    balance += request;
                    System.out.println("your new balance is " + balance);
                    break;

                case 3:
                    System.out.println(" Your balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Quiting");
                default:
                    System.out.println("forbidden choices please try again!");

            }
        }

    }
}
