package Paket3;
import java.util.Scanner;
public class Po3 {
    public static void main(String[] args) {
        int sayi,b=0,c=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi= inp.nextInt();

        for (int i=4;i<=sayi;i+=4){
            b+=1;
            if (b==1) { System.out.println("4 in katları: "); }
            System.out.println(i);
        }
        if (b==0) {
            System.out.println("4 ün katı yoktur!!!");
        }


        for (int k=5;k<=sayi;k+=5){
            c+=1;
            if (c==1) { System.out.println("5 in katları: "); }
            System.out.println(k);
        }
        if (c==0) {
            System.out.println("5 in katı yoktur!!!");
        }
    }
}
