public class Main {
    public static void main(String[] args){
//        BankAccount bobsAccount = new BankAccount();


//        bobsAccount.setAccountNumber(1);
//        bobsAccount.setCostumerName("Bob william");
//        bobsAccount.setEmail("bobwilliam@outlook.com");
//        bobsAccount.setPhoneNumber(932353);
//        bobsAccount.setAccountBalance(1000.13);
//        BankAccount  bobsAccount = new BankAccount("bob william",1, 1000,"bobwilliam@outlook.com",932353);

        BankAccount bobsAccount = new BankAccount();

        bobsAccount.withdrawFunds(1200);
        bobsAccount.withdrawFunds(120);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(1000.23);
        bobsAccount.withdrawFunds(130);
    }
}
