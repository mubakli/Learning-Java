public class Costumer {
    private String name;
    private String creditLimit;
    private String emailAddress;
    public  Costumer(){
        this("nobody","email@nobody.com");
    }

    public Costumer(String name, String emailAddress) {
        this(name,"1000",emailAddress);
    }

    public Costumer(String name, String creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
