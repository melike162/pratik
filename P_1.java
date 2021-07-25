import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        int mat,fiz,kim,turk,tar,muz;

        Scanner inp= new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat=inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz=inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kim=inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tar=inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turk=inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muz=inp.nextInt();

        int toplam=(mat+fiz+kim+turk+tar+muz);
        double sonuc=toplam/6.0;
        System.out.println("Not ortalamanız= "+sonuc);

        String b= (sonuc>=60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(b);

    }
}
