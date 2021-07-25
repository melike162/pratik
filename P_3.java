import java.util.Scanner;

public class P_3 {
    public static void main(String[] args) {
        int a,b,c;
        double alan,u;
        Scanner girdi= new Scanner(System.in);

        System.out.print("1. kenarı giriniz: ");
        a=girdi.nextInt();
        System.out.print("2. kenarı giriniz: ");
        b=girdi.nextInt();
        System.out.print("3. kenarı giriniz: ");
        c=girdi.nextInt();

        u =(a+b+c)/2;

        alan=Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("Üçgenin alanı= "+alan);
    }
}
