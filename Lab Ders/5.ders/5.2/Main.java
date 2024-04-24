public class Main {
    public static void main(String[] args) {
        Product electronicProduct = new ElectronicProduct("Laptop", 1500, "Dell","B");
        Product clothingProduct = new ClothingProduct("T-Shirt", 20, "T-shirt","M");
        Product foodProduct = new FoodProduct("Milk", 2, "2024-04-30");


        electronicProduct.displayInfo();
        System.out.println();
        clothingProduct.displayInfo();
        System.out.println();
        foodProduct.displayInfo();
    }
}
