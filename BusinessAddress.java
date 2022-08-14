package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

public class BusinessAddress implements Address{
    private String province;//il

    private String country;//ilçe
    private String district;//mahalle
    private String street;//sokak
    private int no;

    public BusinessAddress(String province, String country, String district, String street, int no) {
        this.province = province;
        this.country = country;
        this.district = district;
        this.street = street;
        this.no = no;
    }

    @Override
    public void showAddressInfo(int id) {
        System.out.println("iş adresi= "+"ID: "+id+"\t\til: "+this.province+"\t\tilçe: "+this.country+
                "\t\tmahalle: "+this.district+"\t\tsokak:"+this.street+"\t\tNo: "+this.no);

    }



    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
