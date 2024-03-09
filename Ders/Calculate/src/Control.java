public class Control {
    String a;
    String b;
    public void anySpace(){
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == ' '){
                System.out.println("There is space!");
                break;
            }
        }
    }
    public void compStr(){
        if(a.contains(b)){
            System.out.println("Yep it is contains it");
        }
        else {
            System.out.println("NOPE");
        }
    }
}
