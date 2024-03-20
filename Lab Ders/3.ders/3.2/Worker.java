public class Worker {
    double salary;
    String name;
    String department;
    public void setDepartment(String department){
        this.department = department;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void raiseSalary(){
        this.salary *= 1.1;
    }
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
