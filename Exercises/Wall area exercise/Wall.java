public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public double getWeight() {
        return width;
    }

    public void setWeight(double width) {
        this.width = width;
        if ( width < 0 ){
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        if(height<0){
            this.height = 0;
        }
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if( width<0){
            this.height = 0;
        }
        else if(height<0){
            this.width = 0;
        }
    }
    public double area (){
        double area = width * height;
        return area;
    }
}
