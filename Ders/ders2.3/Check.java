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

//    public boolean isipAdressIllegal() {
//
//        int index = this.ipAdress.indexOf(".");
//        int number = Integer.valueOf(this.ipAdress.substring(0,index));
//        checkNumber(number);
//        index++;
//        String str = String.valueOf(this.ipAdress.substring(index,this.ipAdress.length()));
//        index = str.indexOf(".");
//        number = Integer.valueOf(str.substring(0,index));
//
//        index++;
//        String str2 = String.valueOf(str.substring(index,str.length());
//        index = str.indexOf(".");
//        number = Integer.valueOf(str.substring(0,index));
//
//        return bool;
//    }
    public void processDone(){
        System.out.println("Process done.");
    }
    public void checkNumber(int number){
        if(number > 256 || number < 0){
            this.bool = true;
        }
    }
    public String splitNumbers(String str, int stringLength){
            if(this.count < 3){
                int index = str.indexOf(".");
                int number = Integer.valueOf(str.substring(0, index));
                checkNumber(number);
                str = str.substring(1, str.length()-1);
                this.count++;
                    return splitNumbers(str, str.length());
            }
                else{
                     int number = Integer.valueOf(str.substring(0,str.length()));
                    checkNumber(number);
                }
    return null;
   }
}
