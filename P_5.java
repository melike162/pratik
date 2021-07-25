import java.util.Scanner;

public class P_5 {
    public static void main(String[] args) {
        int r,aci;
        double pi=3.14,alan;

        Scanner ina= new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r=ina.nextInt();
        System.out.print("Dairenin merkez açısısının ölçüsünü giriniz [derece]: ");
        aci=ina.nextInt();

        alan=(pi*(r*r)*aci)/360;
        System.out.println("dairenin alanı= "+alan);
    }
}
