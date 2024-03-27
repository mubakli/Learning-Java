public class Espresso extends coffee{
    public void createEspresso(){
        if( coffeeAmount > 13 && waterAmount > 10 && isClean){
        coffeeAmount -= 13;
        waterAmount -= 10;
        isClean = false;
        System.out.println("Espresso is ready.");}
        else{
            System.out.println("You haven't got enough resources.");
        }
        if(coffeeAmount <15 || waterAmount <15){
            System.out.println("Check resources");
        }
    }

}
