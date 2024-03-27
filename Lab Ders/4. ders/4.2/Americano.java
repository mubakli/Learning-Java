public class Americano extends coffee{
    public void createAmericano(){
        if( coffeeAmount > 15 && waterAmount > 14 && isClean){
            coffeeAmount -= 15;
            waterAmount -= 14;
            isClean = false;
            System.out.println("oAmerican is ready.");}
        else{
            System.out.println("You haven't got enough resources.");
        }
        if(coffeeAmount <15 || waterAmount <15){
            System.out.println("Check resources");
        }
    }

}
