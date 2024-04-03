public class ElectronicProduct extends Product{
    String brand;
    String energyClass;

    public ElectronicProduct(String name, int price, String brand, String energyClass){
        super(name,price);
        this.brand = brand;
        this.energyClass = energyClass;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Energy class " + energyClass);
    }
}
