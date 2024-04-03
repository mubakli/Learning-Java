public class Employee extends Personel{
    private int hourlyPayment;
    public Employee(String name, int age, int hourlyPayment){
        super(name,age);
        this.hourlyPayment = hourlyPayment;
    }

    public void information(){
        super.information();
        System.out.println("Hourly Payment " + hourlyPayment);
    }
    public void information(String message){
        System.out.println(message);
        super.information();
        System.out.println("Hourly Payment " + hourlyPayment);
    }
}
