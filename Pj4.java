package Paket4;
import java.util.Scanner;
public class Pj4 {
    static int Recursive(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        if (b==0){ return 1; }
        else{ return result; }
    }
    public static void main(String[] args) {
        int n1,n2;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("Sonuç: "+Recursive(n1,n2));

    }
}
