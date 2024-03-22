public class Sensor {
    private double sicaklik;
    private double nem;
    Sensor(){}
    Sensor(double sicaklik,double nem){
        this.sicaklik = sicaklik;
        this.nem = nem;
    }
    public double getSicaklik(){
        return this.sicaklik;
    }
    public double getNem(){
        return this.nem;
    }

}
