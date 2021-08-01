package Paket4;
import java.util.Scanner;
public class Pj5 {
    static void isAsal(int a){
        int b=0;
        for (int i=2; i<a;i++ ){
            if ((a%i)==0){
                b+=1;
            }
        }

        if (b==0) {
            System.out.println(a+" sayısı ASALDIR !");
        }
        else {
            System.out.println(a+" sayısı ASAL değildir !");
        }

    }
    public static void main(String[] args) {
        int n1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n1 = input.nextInt();
        isAsal(n1);
    }
}
