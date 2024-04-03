public class Manager extends Personel{
    private String department;
    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    public void information(){
        super.information();
        System.out.println("Departman: " + department);
    }
    public void information(String message){
        System.out.println(message);
        super.information();
        System.out.println("Departman: " + department);
    }
}
