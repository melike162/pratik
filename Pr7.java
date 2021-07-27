package Paket2;
import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Pr7 {
    public static void main(String[] args) {
        int km, yas,tip;
        double ucret;
        Scanner inw = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi giriniz[km]: ");
        km= inw.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas= inw.nextInt();
        System.out.println("1-gidiş\n2-gidiş dönüş");
        System.out.print("Yolculuk tipinizi giriniz: ");
        tip= inw.nextInt();

        ucret=km*0.1;


        boolean a=(tip>=1)&&(tip<=2);
        if((yas>=0)&& (km>=0)&&(a)){

            if(tip==1){
                System.out.println(ucret);
                if(yas<12) { System.out.println("ücretiniz="+(ucret*0.5)+"TL"); }
                else if(yas>=12 && yas<=24) { System.out.println("ücretiniz="+(ucret*0.9)+"TL"); }
                else if(yas>65) { System.out.println("ücretiniz="+(ucret*0.7)+"TL"); }
            }
            else if(tip==2){
                ucret*=2;
                System.out.println(ucret);
                if(yas<12) { System.out.println("ücretiniz="+(ucret*0.5*0.8)+"TL"); }
                else if(yas>=12 && yas<=24) { System.out.println("ücretiniz="+(ucret*0.9*0.8)+"TL"); }
                else if(yas>65) { System.out.println("ücretiniz="+(ucret*0.7*0.8)+"TL"); }
            }

        }
        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
