public class FoodProduct extends Product{
    String expirationDate;
    public FoodProduct(String name, int price, String expirationDate){
        super(name,price);
        this.expirationDate = expirationDate;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(expirationDate);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
