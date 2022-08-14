package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;
import java.util.Date;
import java.util.GregorianCalendar;


public class HealthInsurance extends Insurance {

    public HealthInsurance() {
        super(2,"Sağlık sigortası" ,new GregorianCalendar(2014, 2, 11).getTime(), new GregorianCalendar(2023, 2, 11).getTime());

    }
    @Override
    public void calculate(String ad){
        if (ad.equals("Enterprise")) {
            System.out.println("Ücret: 15000");
        }
        if (ad.equals("Individual")) {
            System.out.println("Ücret: 3000");
        }
    }
}
