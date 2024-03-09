public class BankAccount {
    private String costumerName;
    private int accountNumber;
    private double accountBalance;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this("bob william", 0, 5.7, "default_email",0 );
        System.out.println("Empty constructor called! ");
    }
    public BankAccount( String costumerName, int accountNumber, double accountBalance, String email, int phoneNumber){
        System.out.println("account constructor with parameters called! ");
        this.costumerName = costumerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getCostumerName() {
        return costumerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(double depositValue){
        accountBalance += depositValue;
        System.out.println("Deposit of $" + depositValue +" made. New balance is $" + accountBalance);
    }
    public void  withdrawFunds(double withdrawValue){
        if(accountBalance >= withdrawValue) {
            accountBalance -= withdrawValue;
            System.out.println("Withdraw of $" + withdrawValue + " made. New balance is $" + accountBalance);
        }
        else{
            System.out.println("İnsufficient funds. You only have $" + accountBalance);
        }
    }
}
