package Paket6;

public class Pp1 {
    public static void main(String[] args) {
        int[] list={1,2,3};
        double harmonik=0.0;
        double h_avarage;

        for (int i=0; i< list.length; i++){
            harmonik +=1.0 / list[i];
        }
        h_avarage=(list.length)/harmonik;
        System.out.println(h_avarage);
    }
}
