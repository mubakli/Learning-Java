public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            Student s = new Student("s92300" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Lisa";
                case 5 -> "Harry";
                default -> "Anonymous";
            },"05/11/2001","Learning Java" );
            System.out.println(s);
        }
    }
}
