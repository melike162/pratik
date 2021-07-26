package Paket2;

import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input= new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2=input.nextInt();

        System.out.println("1-çarpma\n2-bölme\n3-toplama\n4-çıkarma");
        System.out.print("seçim= ");
        select =input.nextInt();

        switch (select){
            case 1: System.out.println("çarpıma= "+ (n1*n2)); break;
            case 2: if(n2!=0) { System.out.println("bölüme= "+ (n1/n2)); } break;
            case 3: System.out.println("toplama= "+ (n1+n2)); break;
            case 4: System.out.println("çıkarma= "+ (n1-n2)); break;
            default: System.out.println("doğru ifade girilmedi. tekrar deneyiniz.");
        }
    }
}
