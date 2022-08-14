package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

import java.util.Date;
import java.util.GregorianCalendar;

public class ResidenceInsurance extends Insurance{
    /*{
        Calendar takvim = new GregorianCalendar(2021, 01, 01);
        Date s_1= takvim.getTime();
        Calendar takvim2 = new GregorianCalendar(2023, 01, 01);
        Date s_2= takvim2.getTime();
        setS_fDate(s_1);
        setS_eDate(s_2);
    }

    private Date s_fDate;
    private Date s_eDate;
    private final Date fDate = new Date(2014, 02, 11);
    private final Date eDate = new Date(2021, 02, 11);*/


    public ResidenceInsurance() {
        super(1,"Konut sigortası", new GregorianCalendar(2014, 2, 11).getTime(), new GregorianCalendar(2023, 2, 11).getTime());

    }

    @Override
    public void calculate(String ad) {
        if (ad.equals("Enterprise")) {
            System.out.println("Ücret: 300000");
        }
        if (ad.equals("Individual")) {
            System.out.println("Ücret: 5000");
        }

    }
}
