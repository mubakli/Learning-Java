public class Student {
    String name;
    String id;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, String id){
        this(name,age);
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
