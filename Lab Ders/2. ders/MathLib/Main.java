import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("x degerini giriniz: ");
        x = sc.nextDouble();
        System.out.println("y degerini giriniz: ");
        y = sc.nextDouble();
        double higherOne = Math.max(x,y);
        double sqrtForX = Math.sqrt(x);
        double takePower = Math.pow(x,y);
        System.out.println("Higher one = " + higherOne + " x sqrt = " + sqrtForX + " x power y = " + takePower);
    }
}
