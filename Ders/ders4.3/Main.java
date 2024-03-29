public class Main {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        FireMonster m2 = new FireMonster();
        WaterMonster m3 = new WaterMonster();
        StoneMonster m4 = new StoneMonster();

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());
        System.out.println(m4.attack());
    }
}
