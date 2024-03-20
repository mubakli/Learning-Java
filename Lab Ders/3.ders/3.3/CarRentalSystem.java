public class CarRentalSystem {
    String brand;
    String model;
    String year;
    double rentPrice;
    Boolean isAvailable = true;

    public CarRentalSystem(String brand, String model, String year,double rentPrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentPrice = rentPrice;
    }
    public void rentCar(){
        if(isAvailable == true){
            System.out.println("brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", year='" + year + '\'' +
                    ", rentPrice=" + rentPrice);
            System.out.println("You are successsfully rent this car.");
            isAvailable = false;
        }
        else{
            System.out.println("This car is not available :(");
        }
    }

    @Override
    public String toString() {
        return "CarRentalSystem{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", rentPrice=" + rentPrice +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
