public class Main {
    public static void main(String[] args) {
        Costumer john = new Costumer("john","2000","this@john.com");
        System.out.println("Costumer name: " + john.getName());
        System.out.println("Credit Limit: " + john.getCreditLimit());
        System.out.println("e-mail address: " + john.getEmailAddress());
        System.out.println("-------------------------");

        Costumer billy = new Costumer("billy","email@billy.com");
        System.out.println("Costumer name: " + billy.getName());
        System.out.println("Costumer e-mail address: " + billy.getEmailAddress());
        System.out.println("Costumer Limit: " + billy.getCreditLimit());
        System.out.println("------------------------");

        Costumer thirdCostumer = new Costumer();
        System.out.println("name: " + thirdCostumer.getName());
        System.out.println("limit: " + thirdCostumer.getCreditLimit());
        System.out.println("email: " + thirdCostumer.getEmailAddress());
        // This one is important!!
    }
}
