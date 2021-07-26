package Paket2;
import java.util.Scanner;
public class Pr4 {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklğı giriniz: ");
        heat = inp.nextInt();

        if (heat < 5) { System.out.println("Kayağa gidebilirsiniz."); }
        if (heat >= 5 && heat <= 15) { System.out.println("Sinamaya gidebilirsiniz."); }
        if (heat >= 15 && heat <= 25) { System.out.println("Pikniğe gidebilirsiniz."); }
        if (heat >= 15 && heat > 25) { System.out.println("Yüzmeye gidebilirsiniz."); }
    }
}
