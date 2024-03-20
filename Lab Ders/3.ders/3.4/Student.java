public class Student {
    String name;
    double vizeNot;
    double odevNot;
    double finalNot;
    public void notHesapla(){
        double sonuc;
        sonuc = vizeNot * 0.3 + odevNot * 0.3 + finalNot * 0.4;
        if(sonuc < 100 && sonuc >85){
            System.out.println("Not: " + sonuc + " AA ");
        }
        else if(sonuc < 85 && sonuc >70){
            System.out.println("Not: " + sonuc + " BB ");
        } else if (sonuc < 70 && sonuc >60) {
            System.out.println("Not: " + sonuc + "CC");
        }
        else if(sonuc<60){
            System.out.println("Not: " + sonuc + " FF ");
        }
    }

    public Student(String name, double vizeNot, double odevNot, double finalNot) {
        this.name = name;
        this.vizeNot = vizeNot;
        this.odevNot = odevNot;
        this.finalNot = finalNot;
    }
}
