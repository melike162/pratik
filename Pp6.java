package Paket6;

import java.util.Arrays;

public class Pp6 {

    static boolean isFind(int[] arr,int value){
        for (int i : arr){
            if (i== value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1,5,9,8,52,62,30,50,527,5,6,5,9,52,52};
        int c,str=0;
        int[] a= new int[list.length];

        System.out.println("Dizi= "+ Arrays.toString(list));

        for (int i=0;i< list.length;i++) {
            c = 0;
            for (int j = 0; j < list.length; j++) {
                if ( i!=j && list[i]==list[j]){
                    if (!(isFind(a,list[i]))){
                        c++;
                    }

                }
            }
            if (c > 0) {
                System.out.println(list[i] + " sayısı " +( c + 1 )+ " kere tekrar edildi.");
            }
            a[str++]=list[i];
        }
    }
}
