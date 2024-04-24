import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1,x2,x3,x4;
        String input;
        System.out.println("değerleri aralarında birer boşluk bırakarak girin ");
        input = sc.nextLine();
        x1 = Integer.parseInt(input.substring(0,1));
        System.out.println(input);
        x2 = Double.parseDouble(input.substring(2,3));
        x3 = Double.parseDouble(input.substring(2,3));
        x4 = Double.parseDouble(input.substring(4,5));
        double ort = (x1 + x2 + x3 + x4)/4;
        double st = Math.pow((x1-ort),2)+Math.pow((x2-ort),2)+Math.pow((x3-ort),2)+Math.pow((x4-ort),2);
        st = Math.sqrt((st/4));
        System.out.println(st);
    }
}
