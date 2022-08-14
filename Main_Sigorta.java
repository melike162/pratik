package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

import java.util.ArrayList;
import java.util.Scanner;

import static Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4.AddressManager.addAdress;
import static Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4.AddressManager.selectAddress;

public class Main_Sigorta extends Exception{
    public static void addInsurance(String ad,AccountManager accountManager){
        Scanner input=new Scanner(System.in);
        Insurance[] ins={new ResidenceInsurance(),new HealthInsurance(),new CarInsurance(), new TravelInsurance()};
        for (Insurance i: ins ){
            System.out.print("ID: "+i.getId()+"\t\tİsim: "+i.getS_name()+"\t\tBaşlama tarihi: "+i.getS_fDate()+"\t\tBitiş tarihi: "+i.getS_eDate()+"\t\t");
            i.calculate(ad);
        }
        System.out.print("Almak istediğiniz sigortanın ID sini giriniz: ");
        int insuranceId=input.nextInt();
        ArrayList<Insurance> sigorta = accountManager.getSigorta();
        switch (insuranceId){
            case 1:
                sigorta.add(new ResidenceInsurance());
                break;
            case 2:
                sigorta.add(new HealthInsurance());
                break;
            case 3:sigorta.add(new CarInsurance());
                break;
            case 4:sigorta.add(new TravelInsurance());
                break;
            default:
                System.out.println("Geçerli bir ID girikmedi!! ");
        }
        accountManager.setSigorta(sigorta);
    }


    public static void main(String[] args) {
        User user = new User();
        ArrayList<String> insuranceName=new ArrayList<>();

        AccountManager accountManager=new AccountManager() ;
        Scanner input=new Scanner(System.in);
        System.out.print("Mail adresinizi girniz: ");
        String mail= input.next();
        System.out.print("Şifrenizi giriniz: ");
        String password= input.next();
        System.out.println("-------------");
        try{
            if (accountManager.Login(mail,password)){
                System.out.println("Giriş yapılmıştır. ");
            }else{
                throw new Main_Sigorta();
            }
        }catch (Main_Sigorta a){
            System.out.println("Hatalı giriş.");
        }

        if (accountManager.getStatus().equals(Account.AuthenticationStatus.SUCCESS)){
            boolean anew= true;
            int a=0;
            while (anew){
                System.out.println("1- Bireysel sigorta ");
                System.out.println("2- Kurumsal sigorta ");
                System.out.println("3- Alınan sigortaları görmek");
                System.out.println("4- Adres eklemek ");
                System.out.println("5- Adres silmek ");
                System.out.println("6- Adresleri görmek");
                System.out.println("0- Çıkış");
                System.out.print("Bir rakam giriniz: ");
                int selectAccount= input.nextInt();
                String ad;
                switch (selectAccount){
                    case 1:
                        ad="Individual";
                        addInsurance(ad,accountManager);
                        insuranceName.add(ad);
                        break;
                    case 2:
                        ad="Enterprise";
                        addInsurance(ad,accountManager);
                        insuranceName.add(ad);
                        break;
                    case 3:
                        ArrayList<Insurance> sigorta3 = accountManager.getSigorta();
                        int c=1;
                        System.out.println("Alınan sigortalar: ");
                        int n=0;
                        for (Insurance i: sigorta3){
                            System.out.print(insuranceName.get(n)+" sigorta= ID: "+c+"\t\tİsim: "+i.getS_name()+"\t\tBaşlangıç tarihi: "+
                                    i.getS_fDate()+"\t\tBitiş tarihi: "+i.getS_fDate()+"\t\t");
                            i.calculate(insuranceName.get(n));
                            n++;
                        }
                        break;
                    case 4:
                        addAdress(user);
                        break;
                    case 5:
                        selectAddress(user);
                        break;
                    case 6:

                        ArrayList<Address> addresses = user.getAddresses();
                        int id=1;
                        for (Address h: addresses){
                            h.showAddressInfo(id);
                            id++;
                        }
                        if (addresses.size()==0){
                            System.out.println("Sistemde adres bulunmamaktır. ");
                        }

                        break;
                    case 0:
                        anew=false;
                        break;
                    default:
                        a++;
                        System.out.println("Geçerliş bir rakam girilmiştir. ");
                        if (a>1){
                            anew=false;
                        }


                }
                System.out.println("---------------");
            }

        }
        System.out.println("Yine bekleriz..");


    }
}
