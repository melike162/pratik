package bitirme2;

import java.util.Random;
import java.util.Scanner;

public class btr {

    static int[][] tek(int [][] tablo){

        for (int i=0; i<tablo.length; i++) {
            for (int j = 0; j < tablo[1].length; j++) {
                    if (tablo[i][j] == 100) {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int l = j - 1; l <= j + 1; l++) {
                                if ((k >= 0 && k < tablo.length) && (l >= 0 && l < tablo[1].length)) {
                                    if (100!=tablo[k][l] ) {
                                        tablo[k][l] = tablo[k][l] + 1;
                                    }
                                }

                            }
                        }
                    }
                tablo[i][j] = tablo[i][j] + 1;
                }
            }
        return tablo;
    }

    static int[][] tabloYapma(int[][] tablo){

        for (int i=0; i<tablo.length; i++){
            for (int j=0; j<tablo[1].length;j++){

                if (tablo[i][j]==42){
                    //System.out.print('*');
                    tablo[i][j]=100;
                }else{
                    //System.out.print('-');
                    tablo[i][j]=0;
                }
            }
            //System.out.println();
        }
        //System.out.println("===========================");

        return tablo;

    }

    static void tabloYapma2(int[][] tablo){

        for (int i=0; i<tablo.length; i++){
            for (int j=0; j<tablo[1].length;j++) {

                if (tablo[i][j] != 0) {
                    System.out.print((tablo[i][j]-1 )+ " ");
                }else{
                    System.out.print('-'+" ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    static void tabloYapma3(int[][] tablo){

        for (int i=0; i<tablo.length; i++){
            for (int j=0; j<tablo[1].length;j++) {

                if (tablo[i][j] != 0) {
                    System.out.print((tablo[i][j]-1 )+ " ");
                }else{
                    System.out.print('*'+" ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    static double b_sayi(int satir,int sutun){
        double a1= satir*sutun/4;
        double a=Math.floor(a1);

        if (a1==a){
            return a-1;
        }else{
            return a;
        }
    }


    public static void main(String[] args) {
        int satir,sutun,sat,sut;

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        Scanner inp= new Scanner(System.in);
        System.out.print("Satır Sayısını Giriniz : ");
        satir=inp.nextInt();

        System.out.print("Sütun Sayısını Giriniz : ");
        sutun=inp.nextInt();

        System.out.println("===========================");

        int[][] tablo1 = new int[satir][sutun];
        int[][] tablo3 = new int[satir][sutun];

        double a = b_sayi(satir, sutun);

        for (int i=0;i<=a;i++) {


            Random rand = new Random();
            int number1 = rand.nextInt(satir);
            int number2 = rand.nextInt(sutun);

            tablo1[number1][number2]='*';
        }
        int[][]  tablo2=tabloYapma(tablo1);

        tablo2=tek(tablo1);

        for (int i=0;i<satir*sutun-a-1;i++){
            System.out.print("Satır Giriniz : ");
            sat=inp.nextInt();

            System.out.print("Sütun Giriniz : ");
            sut=inp.nextInt();



            if (tablo2[sat][sut]==101){
                System.out.println("Game over!"); break;
            }else{
                if (i==satir*sutun-a-2) {
                    System.out.println("kazandınız!");
                    tablo3[sat][sut]=tablo2[sat][sut];
                    tabloYapma3(tablo3); break;

                }
                tablo3[sat][sut]=tablo2[sat][sut];
                tabloYapma2(tablo3);

            }
        }
    }
}
