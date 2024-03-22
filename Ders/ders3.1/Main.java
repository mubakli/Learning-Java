import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DBConnect d1 = new DBConnect("burak","123");
        DBConnect d2 = new DBConnect();
        System.out.println("please enter name: ");
        String input = sc.nextLine();
        System.out.println("please enter password: ");
        String input2 = sc.nextLine();
        if(d1.getdBName().equals(input) && d1.getdBPassword().equals(input2)){
            System.out.println("correct");
        }else{
            System.out.println("wrong password or name!!");
        }
        System.out.println("Please enter account name: ");
        d1.setdBName(sc.nextLine());
        System.out.println("Please enter password: ");
        d1.setdBPassword(sc.nextLine());
        System.out.println("Please enter password again: ");
        String check = sc.nextLine();

    }
}
