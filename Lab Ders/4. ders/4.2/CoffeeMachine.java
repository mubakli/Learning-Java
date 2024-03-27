public class CoffeeMachine {
    public static void main(String[] args) {
        Espresso es = new Espresso();
        Americano a = new Americano();
        Latte l = new Latte();
        es.createEspresso();
        a.createAmericano();
        l.createLatte();
        a.createAmericano();
        a.cleanMachine();
        a.createAmericano();
    }
}
