package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressManager {
    private int id=1;
    Scanner input=new Scanner(System.in);
    static void addAdress(User user){
        Scanner input=new Scanner(System.in);
        ArrayList<Address> addresses = user.getAddresses();
        Address add;
        int a;
        do {
            System.out.print("1- İş adresi\t\t2- Ev adresi: ");
            a=input.nextInt();
        }while (a<1 || a>2);
        System.out.print("İl giriniz: ");
        String province=input.next();
        System.out.print("İlçe giriniz: ");
        String country=input.next();
        System.out.print("Mahalle giriniz: ");
        String district=input.next();
        System.out.print("Sokak giriniz: ");
        String street=input.next();
        System.out.print("Numara giriniz: ");
        int no= input.nextInt();
        if (a==1){
            add=new BusinessAddress(province,country,district,street,no);
        }else {
            add=new HomeAddress(province,country,district,street,no);
        }
        addresses.add(add);
        user.setAddresses(addresses);
    }
    static void selectAddress(User user){
        Scanner input=new Scanner(System.in);
        ArrayList<Address> addresses = user.getAddresses();
        int id=1;
        for (Address c: addresses){
            c.showAddressInfo(id);
            id++;
        }
        System.out.print("Silmek istediğiniz adresin ID: ");
        int celectId=input.nextInt();
        if (addresses.size()<celectId || celectId<0){
            System.out.println("Böyle bir ID yoktur.");
        }else {
            addresses.remove(celectId-1);
        }
        user.setAddresses(addresses);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
