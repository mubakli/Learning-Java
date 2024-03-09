import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputName, inputPass;
        String name1 = "brk", name2 = "krm", name3 = "slh";
        String pass1 = "111", pass2 = "222", pass3 = "333";
        System.out.print("Please enter your name: ");
        inputName = sc.next();
        System.out.print("Please enter your password: ");
        inputPass = sc.next();
        switch (inputName){
            case "brk": if(inputPass.equals(pass1)){
                            System.out.println("successful!");
                        }
                        else {
                            System.out.println("İncorrect password");
                        } break;
            case "krm": if(inputPass.equals(pass2)){
                            System.out.println("successful!");
                        }
                        else {
                            System.out.println("İncorrect password");
                        } break;
            case "slh": if(inputPass.equals(pass3)){
                            System.out.println("successful!");
                        }
                        else {
                            System.out.println("İncorrect password");
                        } break;
        }

    }
}