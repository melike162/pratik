package Paket4;
import java.util.Scanner;
public class Pj3 {
    static void sum(int a,int b){
        System.out.println("Toplam: "+(a+b));
    }
    static void minus(int a,int b){

        System.out.println("Çıkarma: "+(a-b));
    }
    static void times(int a,int b){

        System.out.println("Çarpma: "+(a*b));
    }
    static void divided(int a,int b){
        if (b==0){ System.out.println("İkinci sayı 0'dan farklı olmalı."); }
        else {
            double c=a/b;
            System.out.println("Bölme: "+c); }
    }
    static void power(int a,int b){

        System.out.println("Üs hesabı : "+Math.pow(a,b));
    }
    static void mod(int a,int b){
        double c=a%b;
        System.out.println("mod hesabı : "+c);
    }
    static int f(int a){
        if (a==1){ return 1; }
        return f(a-1)*a;
    }
    static void calc(int a,int b){
        System.out.println("dikdörgenin alanı: "+(2*(a+b))+"\ndikdörgenin çevresi: "+(a*b));
    }

    public static void main(String[] args) {
        int select,n1=0,n2=0;
        Scanner ata = new Scanner(System.in);

        while(true){
            System.out.println("1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme işlemi\n5- Üslü Sayı Hesaplama\n6- Mod Alma\n7- Faktoriyel Hesaplama\n8- Dikdörtgen Alan ve Çevre Hesabı\n0-Çıkış");
            System.out.print("Seçim: ");
            select = ata.nextInt();

            if(select==0) { break; }

            if (select!=7){
                System.out.print("Birinci sayıyı giriniz: ");
                n1 = ata.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                n2 = ata.nextInt();
            }
            else{
                System.out.print("Bir sayı giriniz: ");
                n1 = ata.nextInt();
            }

            switch (select){
                case 1: { sum(n1,n2); break; }
                case 2: { minus(n1,n2); break; }
                case 3: { times(n1,n2); break; }
                case 4: { divided(n1,n2); break; }
                case 5: { power(n1,n2); break; }
                case 6: { mod(n1,n2); break; }
                case 7: { System.out.println(n1+" in faktöriyeli: "+f(n1)); break; }
                case 8: { calc(n1,n2); break; }
            }
        }
        System.out.println("Tekrar bekleriz.");
    }
}
