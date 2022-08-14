package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

import java.util.Date;
import java.util.GregorianCalendar;

public class TravelInsurance extends Insurance{
    public TravelInsurance() {
        super(4,"Seyahat sigortası", new GregorianCalendar(2014, 2, 11).getTime(), new GregorianCalendar(2023, 2, 11).getTime());

    }

    @Override
    public void calculate(String ad){
        if (ad.equals("Enterprise")) {
            System.out.println("Ücret: 200000");
        }
        if (ad.equals("Individual")) {
            System.out.println("Ücret: 500");
        }
    }

}
