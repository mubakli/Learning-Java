public class Main {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.firstSide = 5;
        myRect.secondSide = 10;
        Rectangle theOther = new Rectangle(21,3);
        System.out.println(myRect.getArea());
        System.out.println(theOther.getArea());
    }
}
