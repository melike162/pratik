package Paket3;
import java.util.Scanner;
public class Po7 {
    public static void main(String[] args) {
        int sayi,sonuc;
        double c=0;
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        sayi= input.nextInt();

        for (int i=1;i<=sayi;i++){
            c+=1.0/i;
        }
        System.out.println("sonuc= "+c);
    }
}
