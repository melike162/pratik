package Paket3;
import java.util.Scanner;
public class Po1 {
    public static void main(String[] args) {
        int sayi,b=0,c=0;
        Scanner ina = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi= ina.nextInt();
        for(int a=12;a<=sayi;a++){
            if (a%12==0){ b+=a; c++; }
        }

        if (c==0) { System.out.println(c); }
        else { System.out.println(b/c); }


    }
}
