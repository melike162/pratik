package Paket3;

import java.util.Scanner;

public class Po15 {
    public static void main(String[] args) {
        int deger,a=0,b=1,c=1,t=0;
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        deger= input.nextInt();


            if (deger==0){
                System.out.println(0);
            }
            else{
                for (t=0 ; t <deger-1 ;t++) {

                    c = a + b;
                    System.out.println(a + "+" + b + "=" + c);
                    a = b;
                    b = c;
                }

            }

    }
}
