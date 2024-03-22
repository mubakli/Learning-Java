public class Main {
    public static void main(String[] args) {
        Sensor s1 = new Sensor(30,34);
        kontrol(s1.getSicaklik(), s1.getNem());
    }
    public static void kontrol(double sicaklik,double nem){
        if(sicaklik > 25 && nem < 40){
            System.out.println("Sistem aktiflestirildi.");
        }
        else System.out.println("Sistem aktiflesmedi.");
    }
}
