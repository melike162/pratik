package Paket3;
import java.util.Scanner;
public class Po5 {
    public static void main(String[] args) {
        int a,b,sonuc=1;
        Scanner ret = new Scanner(System.in);

        System.out.print("üssü alınacak sayıyı giriniz: ");
        a= ret.nextInt();
        System.out.print("üst olacak sayıyı giriniz: : ");
        b= ret.nextInt();

        for (int i=1;i<=b;i++){
            sonuc*=a;
        }
        System.out.println("sonuç= "+sonuc);
    }
}
