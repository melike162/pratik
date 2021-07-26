package Paket2;
import java.util.Scanner;
public class Pr3 {
    public static void main(String[] args) {
        int mat, fiz, turk,kim,muz,a=0,b=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        if((mat>=0)&&(mat<=100)) { a+=mat; b+=1; }

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = inp.nextInt();
        if((fiz>=0)&&(fiz<=100)) { a+=fiz; b+=1; }

        System.out.print("Kimya notunuzu giriniz: ");
        kim = inp.nextInt();
        if((kim>=0)&&(kim<=100)) { a+=kim; b+=1; }

        System.out.print("Türkçe notunuzu giriniz: ");
        turk = inp.nextInt();
        if((turk>=0)&&(turk<=100)) { a+=turk; b+=1; }

        System.out.print("Müzik notunuzu giriniz: ");
        muz = inp.nextInt();
        if((muz>=0)&&(muz<=100)) { a+=muz; b+=1; }

        double avarage=a/b;

        if(avarage>=55) { System.out.println("sınıfı geçtiniz."); }
        else { System.out.println("sınıfta kaldınız."); }

        System.out.println("ortalamanız= "+ avarage );


    }
}
