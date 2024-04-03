public class Main {
    public static void main(String[] args) {
        String deneme = "deneme";
        Employee p1 = new Employee("Burak",21,30);
        Personel p2 = new Personel("Kerem",19);
        Manager p3 = new Manager("Mahmut",47,"IT");
        p1.information();
        p2.information();
        p3.information();
        p3.information(deneme);
    }
}
