public class Main {
    public static void main(String[] args) {
        String myName = " Burak Asarcikli ";
        for( int i = 0; i < myName.length();i++ ){
            if(myName.contains(" ")){
               myName = myName.replace(" ", "_");
            }

        }
        System.out.println(myName);
    }
}
