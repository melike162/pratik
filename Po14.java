package Paket3;

public class Po14 {
    public static void main(String[] args) {
        int a=0,i;
        for (i=2;i<=100;i++){
            for (int j=1;j<i;j++){
                a=0;
                if (j!=1 && (i%j==0)){
                    a+=1; break;
                }

            }
        if (a==0){ System.out.print(i+ " "); }
        }
    }
}
