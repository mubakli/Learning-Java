public class Main {
    public static void main(String[] args) {
        Employee burak = new Employee("Burak","01/01/2003","01/01/2024");
        System.out.println(burak);
        System.out.println("Age = " + burak.getAge());
        System.out.println("Pay = " + burak.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990","03/03/2020",35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970","03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
