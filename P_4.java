import java.util.Scanner;

public class P_4 {
    public static void main(String[] args) {
        double km;
        double toplam;
        Scanner input= new Scanner(System.in);

        System.out.print("Gidilen km: ");
        km=input.nextInt();

        toplam=10+(2.2*km);

        double ücret= (toplam>=20) ? toplam : 20.0  ;
        System.out.println("ücret= "+ücret);
    }
}
