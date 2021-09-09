package Paket7;
import java.util.Scanner;
public class PR3 {

    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;

        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;

    }
    public static void main(String[] args) {
        String a;

        Scanner inp= new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        a=inp.nextLine();

        boolean b=isPalindrome(a);

        if (b==true){
            System.out.println(a+" palindrom bir kelimedir!");
        }else{
            System.out.println(a+" palindrom bir kelime değildir!");
        }
    }
}
