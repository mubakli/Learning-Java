public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //car.describeCar();
        System.out.println("make = " + car.getMake() );
        car.setMake("Porche");
        System.out.println("make = " + car.getMake() );
    }
}