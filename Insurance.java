package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

import java.util.Date;

public abstract class Insurance {
    private int id;

    private String S_name;
    private Date S_fDate;
    private Date S_eDate;

    public Insurance(int id, String s_name, Date s_fDate, Date s_eDate ) {

        this.id = id;
        S_name = s_name;
        S_fDate = s_fDate;
        S_eDate = s_eDate;
    }



    public void calculate(String ad){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getS_name() {
        return S_name;
    }

    public void setS_name(String s_name) {
        S_name = s_name;
    }

    public Date getS_fDate() {
        return S_fDate;
    }

    public void setS_fDate(Date s_fDate) {
        S_fDate = s_fDate;
    }

    public Date getS_eDate() {
        return S_eDate;
    }

    public void setS_eDate(Date s_eDate) {
        S_eDate = s_eDate;
    }
}
