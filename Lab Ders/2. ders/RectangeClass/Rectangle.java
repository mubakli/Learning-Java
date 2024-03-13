public class Rectangle {
    double firstSide;
    double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle() {
    }

    public double getArea(){
        double area = firstSide * secondSide;
        return area;
    }
}
