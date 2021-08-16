package Paket6;
import java.util.Scanner;
public class Pp7 {
    public static void main(String[] args) {
        int m,n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Marrisin satır sayısı: ");
        m= inp.nextInt();
        System.out.print("Marrisin sütun sayısı: ");
        n= inp.nextInt();

        int[][] matris= new int[m][n];
        int[][] transpoze= new int[n][m];

        for (int i=0; i<m;i++){
            for (int j=0; j<n;j++){
                System.out.print("martisin "+(i+1)+". satır "+(j+1)+". sütün elemanı: ");
                matris[i][j]=inp.nextInt();
                transpoze[j][i]=matris[i][j];
            }
        }

        System.out.println("Matris: ");
        for (int[] row :matris){
            for (int col :row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
        for (int[] row :transpoze){
            for (int col :row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
