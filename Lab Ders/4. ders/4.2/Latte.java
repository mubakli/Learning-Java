public class Latte extends coffee{
    public void createLatte(){
        if( coffeeAmount > 10 && waterAmount > 15 && isClean){
            coffeeAmount -= 10;
            waterAmount -= 15;
            isClean = false;
            System.out.println("Latte is ready.");}
        else{
            System.out.println("You haven't got enough resources. or machine uncleaned.");
        }
        if(coffeeAmount <15 || waterAmount <15){
            System.out.println("Check resources");
        }
    }
}
