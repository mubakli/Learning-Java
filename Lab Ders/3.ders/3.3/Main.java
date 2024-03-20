public class Main {
    public static void main(String[] args) {
    CarRentalSystem car1 = new CarRentalSystem("Ford","Mustang","1967",90000);
    CarRentalSystem car2 = new CarRentalSystem("Hyundai","i20","2023",600);
     car1.rentCar();
     car1.rentCar();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
