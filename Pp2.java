package Paket6;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Pp2 {
    public static void main(String[] args) {
        int[] list1={15,12,788,1,-1,-778,2,0};
        int sayi;

        Scanner ina = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi= ina.nextInt();

        System.out.println("Dizi= "+ Arrays.toString(list1));
        System.out.println("Girilen sayı= "+sayi);

        Arrays.sort(list1);
        int k_s=list1[0];
        int b_s=list1[list1.length-1];
        for (int i=1;i<list1.length;i++){
            if (list1[i]>k_s && list1[i]<sayi){
                k_s=list1[i];
            }
            if (list1[i]<b_s && list1[i]>sayi){
                b_s=list1[i];
            }
        }

        if (k_s==sayi){
            System.out.println("Girilen sayıdan küçük sayı yoktur. ");
        }else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: "+k_s);
        }
        if (b_s==sayi){
            System.out.println("Girilen sayıdan büyük sayı yoktur. ");
        }else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: "+b_s);
        }

    }
}
