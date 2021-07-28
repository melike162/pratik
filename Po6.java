package Paket3;
import java.util.Scanner;
public class Po6 {
    public static void main(String[] args) {
        int sayi,sonuc,c=0;
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        sayi= input.nextInt();

        for (int i=0; i<1000;i++){
            sonuc=sayi%10;
            c+=sonuc;
            int d=sayi/10;
            if (d<10){ i=10000; c+=d;}
            sayi=d;

        }

        System.out.println("sayının rakamları toplamı= "+c);
    }
}
