import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.nextLine();
        StrCounters s1 = new StrCounters(str);
        s1.strUpperCase();
        s1.strLowerCase();
        System.out.println(str.length());

    }
    static class StrCounters{
        String str;
        StrCounters(String str){
            this.str = str;
        }
        public int strLength(){
            return str.length();
        }
        public void strUpperCase(){
            System.out.println(str.toUpperCase());
        }
        public void strLowerCase(){
            System.out.println(str.toLowerCase());
        }


    }
}
