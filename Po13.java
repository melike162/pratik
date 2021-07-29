package Paket3;
import java.util.Scanner;
public class Po13 {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        sayi= input.nextInt();
        for (int r=sayi;r>0;r--){
            for (int e=0;e<=sayi-r;e++){
                System.out.print(" ");
            }

            for (int y=((2*r)-1);y>0;y-- ){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
