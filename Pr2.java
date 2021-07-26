
package Paket2;
import java.util.Scanner;
public class Pr2 {
    public static void main(String[] args) {
        String userName, password,apassword;
        int a;

        Scanner inp = new Scanner(System.in);
        System.out.print("kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();
        System.out.print("şifrenizi giriniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("giriş yaptınız.");
        }
        else if (userName.equals("patika") && !(password.equals("java123"))) {
            System.out.println("1-şifremi sıfırlamak istiyorum\n2-şifremi sıfırlamak istemiyorum");
            System.out.print("seçim= ");
            a = inp.nextInt();

            if (a == 1) {
                Scanner inpa = new Scanner(System.in);
                System.out.print("yeni şifreyi giriniz: ");
                apassword = inpa.nextLine();

                if (!(apassword.equals("java123"))) {
                    System.out.println("Şifre oluşturuldu");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        }
        else {
                System.out.println("bilgileriniz yanlış.");
            }
        System.out.println("program bitti.");

    }
}