public class ClothingProduct extends Product{
    String type;
    String size;
    public ClothingProduct(String name, int price, String type, String size){
        super(name,price);
        this.type = type;
        this.size = size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type : " + type);
        System.out.println("Size : " + size);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
