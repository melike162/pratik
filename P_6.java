import java.util.Scanner;

public class P_6 {
    public static void main(String[] args) {
        double m,kg, vke;

        Scanner inp= new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz [metre]: ");
        m=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz [kilogram]: ");
        kg=inp.nextDouble();

        vke=kg/(m*m);

        System.out.println("Vüvut kütle endeksiniz: "+vke);

    }
}
