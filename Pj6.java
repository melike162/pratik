package Paket4;
import java.util.Scanner;
public class Pj6 {
    static int number1(int a){

        if (a>0) { System.out.print(a+" "); return number1(a-5); }
        return a;
    }
    static int number2(int b,int a){

        if (b<=a) { System.out.print(b+" "); return number2(b+5,a); }
        return 1;
    }
    public static void main(String[] args) {
        int n,t,c;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        n = input.nextInt();

        t=number1(n);
        c=number2(t,n);

    }
}
