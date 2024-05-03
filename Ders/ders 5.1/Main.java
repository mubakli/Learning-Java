import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = sc.nextLine();
        try {
            check(name);
        } catch (UyelikException e) {
            System.out.println("Error: " +e.getMessage());
        }

    }
    public static void check(String name) throws UyelikException{
        if(name.equalsIgnoreCase("serpil")){
            System.out.println("You can't be a member");
            throw new UyelikException("You can't enter 'Serpil'");
        }
        else{
            System.out.println("You are a member now.");
        }
    }
}
