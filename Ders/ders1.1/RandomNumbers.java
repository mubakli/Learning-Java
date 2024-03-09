import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = 0;
        int x = (int)(Math.random() * 10);
        System.out.println("Welcome to guess game");
        System.out.println("Please enter your guess 0 - 10");
        while(true) {
            int guess = sc.nextInt();
            times++;
            if (guess == x) {
                System.out.println("You got it! in " + times + " guesses");
                break;
            } else if (guess > x) {
                System.out.println("try a smaller number");
            } else {
                System.out.println("try a bigger number");
            }
        }

    }
}
