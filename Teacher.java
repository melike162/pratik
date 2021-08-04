package Paket6_NYP_nesneTabanlıProgramlama;

public class Teacher {
    String name;
    String mpno;
    String branch;
    int code;
    int prefix;
    int note;
    Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;

    }
    void print(){
        System.out.println("adı: "+this.name+"\nBranşı: "+this.branch+"\ntel no : "+this.mpno);
        System.out.println("\n");
    }
}
