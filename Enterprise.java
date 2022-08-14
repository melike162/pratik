package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

public class Enterprise extends Account { // kurumsal sigorta
    @Override
    public void howAcc(){}

    @Override
    public int compareTo(Address o) {
        if (o.equals(this.karAdress.comparator())){
            return 1;
        }
        return -8;
    }
}
