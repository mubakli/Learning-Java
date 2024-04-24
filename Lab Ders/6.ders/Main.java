public class Main {
    public static void main(String[] args) {
        Find square = new Find();
        Find rectangle = new Find();
        Find circle = new Find();

        System.out.println(square.fieldOfRectangle(5,5));
        System.out.println(square.perimeterOfRectangle(5,5));
        System.out.println(rectangle.fieldOfRectangle(6,7));
        System.out.println(rectangle.perimeterOfRectangle(6,7));
        System.out.println(circle.fieldOfCircle(6));
        System.out.println(circle.perimeterOfCircle(6));
    }
}
