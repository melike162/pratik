package Paket3;
import java.util.Scanner;
public class Po4 {
    public static void main(String[] args) {
        int n,r,y=1,t=1,k=1;
        Scanner ret = new Scanner(System.in);

        System.out.print("combinasyonun n değerini giriniz: : ");
        n= ret.nextInt();
        System.out.print("combinasyonun r değerini giriniz: : ");
        r= ret.nextInt();

        for (int a=2; a<=n;a++) { y*=a; }
        for (int b=2; b<=r;b++) { t*=b; }
        for (int c=2; c<=(n-r);c++) { k*=c; }

        double m=t*k,j=y/m;
        System.out.println(j);

    }
}
