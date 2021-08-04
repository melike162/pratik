package Paket6_NYP_nesneTabanlıProgramlama;

public class F4 {
    public static void main(String[] args) {
        Fighter f1=new Fighter("ali",10,120,100,50);
        Fighter f2=new Fighter("arda",20,85,85,50);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
