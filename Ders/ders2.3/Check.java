import javax.swing.*;

public class Check {
    String email;
    String ipAdress;
    boolean bool = false;
    int count = 0;
    public boolean isEmailIllegal() {
        int index = this.email.indexOf("@");
        if (index == 0 || this.email.length() - index <= 5) {
            System.out.println("This e-mail is unvalid please use a valid e-mail");
            return true;
        }
        return false;
    }
    public void checkNumber(int number){
        if(number > 256 || number < 0){
            this.bool = true;
            System.out.println("this IP adress is unvalid please enter a valid IP adress");
        }
    }
    public String splitNumbers(String str, int stringLength){
            if( stringLength > 0) {
                int index = str.indexOf(".");
                if (index != -1) {
                    int number = Integer.valueOf(str.substring(0, index));
                    checkNumber(number);
                    str = str.substring(index + 1);
                    return splitNumbers(str, str.length());
                }
            }
        return "Process done.";
   }
}
