public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.setDepartment("developer");
        w1.setSalary(3000);
        w1.setName("Burak");
        System.out.println(w1.toString());
    }
}
