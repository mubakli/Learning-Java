import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String makeOfCar = "Mustang";
        boolean isDomestic = makeOfCar == "Mustang" ? false : true;
        if(isDomestic){
            System.out.println("This is not suppose to be happen ");
        }
    }
}