package Paket3;
import java.util.Scanner;
public class Po11 {
    public static void main(String[] args) {
        int sayi,a,kar1=0,kar2=0,c=0;
        Scanner inpu = new Scanner(System.in);

        do {
            if (c!=0){ System.out.println("geçerli bir sayı giriniz."); }
            System.out.print("Kaç tane sayı gireceksiniz: ");
            sayi = inpu.nextInt();
            c++;
        } while (sayi<=0);


        for (int i=1; i<=sayi; i++){
            System.out.print(i+". Sayıyı giriniz: ");
            a= inpu.nextInt();
            if (i==1){
                kar1=a;
                kar2=a;
            }
            else {
                if (kar1>a){ kar1=a; }
                if (kar2<a){ kar2=a; }
            }
        }
        System.out.println("en küçük sayı= "+kar1);
        System.out.println("en büyük sayı= "+kar2);

    }
}
