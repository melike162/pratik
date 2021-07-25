import java.util.Scanner;

public class P_7 {
    public static void main(String[] args) {
        double ar,el,dom,muz,pat,toplam;
        Scanner inp= new Scanner(System.in);

        System.out.print("Armuttan alınan kilogram= ");
        ar=inp.nextDouble();
        System.out.print("Elmadan alınan kilogram= ");
        el=inp.nextDouble();
        System.out.print("Domatesten alınan kilogram= ");
        dom=inp.nextDouble();
        System.out.print("Muzdan alınan kilogram= ");
        muz=inp.nextDouble();
        System.out.print("Patlıcandan alınan kilogram= ");
        pat=inp.nextDouble();

        toplam=ar*2.14+el*3.67+dom*1.11+muz*0.95+pat*5.00;
        System.out.println("toplam ücret= "+toplam);
    }
}
