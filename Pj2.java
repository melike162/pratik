package Paket4;
import java.util.Scanner;
public class Pj2 {
    static int f(int n){
        if (n==1 || n==2){ return 1;}
        return f(n-1)+f(n-2);
    }
    public static void main(String[] args) {
        int sayi;
        Scanner inpu = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        sayi = inpu.nextInt();
        System.out.println(f(sayi));
    }
}
