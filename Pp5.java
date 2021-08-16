package Paket6;
import java.util.Arrays;
import java.util.Scanner;
public class Pp5 {
    public static void main(String[] args) {
        int n,t;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        n= inp.nextInt();

        int[] list= new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i=0; i<n;i++){
            System.out.print((i+1)+". Elemanı: ");
            list[i]=inp.nextInt();
        }

        Arrays.sort(list);
        System.out.print("Sıralama: ");
        for (int i=0; i< list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}
