public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Salih","23112");
        Worker w2 = new Worker();
        Worker w3 = new Worker("Burak","4542",17002);
        System.out.println("w1:" + w1.name + " " + w1.id);
        System.out.println("w3: " + w3.name + " " + w3.id + " " + w3.salary);
    }
}
