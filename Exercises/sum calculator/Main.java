public class Main {
    public static void main( String[] args ) {
        simpleCalculator calculate = new simpleCalculator();
        calculate.setFirstNumber(23.34);
        calculate.setSecondNumber(34.28);
        System.out.println("first number= "+ calculate.getFirstNumber() + " second number= " + calculate.getSecondNumber());
        System.out.println("add = " + calculate.getAdditionResult());
        System.out.println("sub = " + calculate.getSubtractionResult());
        System.out.println("multiplying = " + calculate.getMultiplicationResult());
        System.out.println("div = " + calculate.getDivisionResult());
    }
}
