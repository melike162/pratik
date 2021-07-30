package Paket4;
import java.util.Scanner;
public class Pj1 {
    static boolean isPolidrom(int number){
        int temp=number,reversNumber=0,lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reversNumber=reversNumber*10+lastNumber;
            temp/=10;
        }
        if (number==reversNumber){ return true;}
        else { return false; }
    }
    public static void main(String[] args) {
        int sayi;
        Scanner inpu = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        sayi = inpu.nextInt();
        System.out.println(isPolidrom(sayi));

    }
}
