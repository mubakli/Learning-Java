public class Personel {
     String name;
     int age;
    public Personel(){}
    public Personel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void information(){
        System.out.println("name: " + name );
        System.out.println("age: " + age);
    }
}
