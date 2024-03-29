public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(3,5));
        System.out.println(c1.add(3.5f, 4.3f));
        System.out.println(c1.add(3.2f ,2.1f, 5.1f, 4.7f ));
        System.out.println(c1.add(2,3,4,5));
    }
}
