package Paket3;
import java.util.Scanner;
public class Po9 {
    public static void main(String[] args) {
        String userName,password;
        int c=0,balance=1500;
        Scanner input = new Scanner(System.in);
        int select;

        do {
            c+=1;
            System.out.print("kullanıcı adınızı giriniz: ");
            userName= input.nextLine();
            System.out.print("şifrenizi giriniz: ");
            password= input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("sisteme giriş yapıldı.");
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:{System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;} break;
                        case 2: {System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            if (price > balance) { System.out.println("Bakiye yetersiz."); }
                            else {  balance -= price; } }break;
                        case 3: { System.out.println("Bakiyeniz : " + balance); } break;

                    }

                }while(select!=4);
            System.out.println("tekrar bekleriz.");
            break;
            }


            else{

                if (c==3){
                    System.out.println("hesap bloke edilmiştir.Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("kullanıcı adı veya şifre hatalı.tekrar deneyiniz.");
                    System.out.println("kalan hak:"+(3-c));}
            }
        }while (c<3);



    }
}
