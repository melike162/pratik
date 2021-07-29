package Paket3;
import java.util.Scanner;
public class Po8 {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        sayi= input.nextInt();

        for (int i = 0; i < sayi ; i++) {
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        for (int r=sayi-1;r>0;r--){
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
