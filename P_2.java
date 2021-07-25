import java.util.Scanner;
public class P_2 {
    public static void main(String[] args) {
        double fy,kdv,a;

        Scanner inp= new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        fy=inp.nextDouble();

        double kdvorani=(fy>=1000) ? 0.08 : 0.18;
        kdv=fy*kdvorani;
        a=kdv+fy;

        System.out.println("fiyat= "+fy);
        System.out.println("KDV oranı= "+kdvorani);
        System.out.println("KDV'li fiyat= "+a);
        System.out.println("KDV tutarı= "+kdv);
    }
}
