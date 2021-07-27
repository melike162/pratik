package Paket2;
import java.util.Scanner;
public class Pr9 {
    public static void main(String[] args) {
        int yil,kalan;
        Scanner ina = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        yil= ina.nextInt();

        kalan=yil%4;
        if(kalan==0){ System.out.println(yil+" bir artık yıldır!"); }
        else { System.out.println(yil+" bir artık yıl değildir!"); }
    }
}
