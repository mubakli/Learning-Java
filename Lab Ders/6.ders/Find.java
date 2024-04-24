public class Find extends ShapeThings{
    @Override
    double fieldOfRectangle(double a, double b) {
        double field = a*b;
        return field;
    }

    @Override
    double perimeterOfRectangle(double a, double b) {
        double perimeter = 2 * ( a + b );
        return perimeter;
    }

    @Override
    double fieldOfCircle(double r) {
        return (Math.PI * r * r);
    }

    @Override
    double perimeterOfCircle(double r) {
        return (2 * Math.PI * r);
    }
}
