package Paket2;
import java.util.Scanner;
public class Pr8 {
    public static void main(String[] args) {
        int yil,kalan;
        Scanner inw = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        yil= inw.nextInt();

        kalan=yil%12;

        switch (kalan){
            case 0: System.out.println("Çin Zodyağınız= "+"Maymun"); break;
            case 1: System.out.println("Çin Zodyağınız= "+"Horoz"); break;
            case 2: System.out.println("Çin Zodyağınız= "+"Köpek"); break;
            case 3: System.out.println("Çin Zodyağınız= "+"Domuz"); break;
            case 4: System.out.println("Çin Zodyağınız= "+"Fare"); break;
            case 5: System.out.println("Çin Zodyağınız= "+"Öküz"); break;
            case 6: System.out.println("Çin Zodyağınız= "+"Kaplan"); break;
            case 7: System.out.println("Çin Zodyağınız= "+"Tavşan"); break;
            case 8: System.out.println("Çin Zodyağınız= "+"Ejderha"); break;
            case 9: System.out.println("Çin Zodyağınız= "+"Yılan"); break;
            case 10: System.out.println("Çin Zodyağınız= "+"At"); break;
            case 11: System.out.println("Çin Zodyağınız= "+"Koyun"); break;
        }
    }
}
