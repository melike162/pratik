package Paket3;
import java.util.Scanner;
public class Po12 {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı gireceksiniz: ");
        sayi = input.nextInt();
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){ toplam+=i;}
        }
        if (sayi==toplam){ System.out.print(sayi+" mükemmel sayıdır."); }
        else { System.out.print(sayi+" mükemmel sayı değildir."); }

    }
}
