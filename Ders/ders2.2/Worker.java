public class Worker {
    String name;
    String id;
    int salary;
    Worker() {
    }
    Worker (String name, String id) {
        this(name, id, 0);
    }

    Worker(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
