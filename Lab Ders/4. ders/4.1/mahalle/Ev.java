package mahalle;

public class Ev {
    public String evSahibi;
    int kapıNo = 3;
    protected boolean anahtar = true;
    private double kasadakiPara = 1000;
    protected double kasa(){
        return kasadakiPara;
    }
    public void zilCal(){
        System.out.println("zil çaldi:");
    }
    private void kapıyaTılka(){
        System.out.println("kapıya tıklandı.");
    }

}
