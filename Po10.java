package Paket3;
import java.util.Scanner;
public class Po10 {
    public static void main(String[] args) {
        int n1,n2,c=1;
        Scanner inpu = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        n1= inpu.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        n2= inpu.nextInt();

        if (n1>n2){
            int t=n1;
            n1=n2;
            n2=t; }
        int i=1;
        while (i<=n1){
            if ((n1%i==0 ) && (n2%i==0)){
                c=i;
            }
            i++;
        }
        System.out.println("EBOB= " + c);

        int g=((n1*n2)/c);
        System.out.println("EKOK= "+g);
    }
}
