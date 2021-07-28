package Paket3;
import java.util.Scanner;
public class Po2 {
    public static void main(String[] args) {
        int sayi,b=0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            sayi= inp.nextInt();
            if (sayi==2){ b+=2; }
            else if (sayi%4==0){ b+=sayi; }
        }while(sayi%2==0);

        System.out.println(b);

    }
}
