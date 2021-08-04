package Paket6_NYP_nesneTabanlıProgramlama;

public class Student {
    Course s_c1;
    Course s_c2;
    Course s_c3;

    String name;
    String stuno;
    String classes;
    double f;
    double t;
    double k;
    double avarage;
    boolean isPass;

    Student(String name, String stuno,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuno=stuno;
        this.classes=classes;
        this.s_c1=c1;
        this.s_c2=c2;
        this.s_c3=c3;
        this.avarage=0.0;
        this.isPass=false;
        double f=0;
        double k=0;
        double t=0;
    }

    void addBulkExamNote(int s_note1,int y_note1,int s_note2,int y_note2,int s_note3,int y_note3){
        if (s_note1>=0 && s_note1<=100){
            this.s_c1.note=s_note1;
        }
        if (y_note1>=0 && y_note1<=100){
            this.s_c1.note2=y_note1;
        }
        if (s_note2>=0 && s_note2<=100){
            this.s_c2.note=s_note2;
        }
        if (y_note2>=0 && y_note2<=100){
            this.s_c2.note2=y_note2;
        }
        if (s_note3>=0 && s_note3<=100){
            this.s_c3.note=s_note3;
        }
        if (y_note3>=0 && y_note3<=100){
            this.s_c3.note2=y_note3;
        }

    }
    void isPass(){
        this.f=s_c1.note*0.2+s_c1.note2*0.8;
        this.t=s_c2.note*0.2+s_c2.note2*0.8;
        this.k=s_c3.note*0.2+s_c3.note2*0.8;

        this.avarage=(this.f+this.t+this.k)/3.0;
        if (this.avarage>=55){
            System.out.println("sınıfı geçtiniz.");
        }else{
            System.out.println("sınıfta kaldınız.");
        }
        printNote();
    }


    void printNote(){
        System.out.println(this.s_c1.name+" sözlü notu: "+this.s_c1.note);
        System.out.println(this.s_c1.name+" yazılı notu: "+this.s_c1.note2);
        System.out.println(this.s_c1.name+" ortalaması: "+this.f+"\n");
        System.out.println(this.s_c2.name+" sözlü notu: "+this.s_c2.note);
        System.out.println(this.s_c2.name+" yazılı notu: "+this.s_c2.note2);
        System.out.println(this.s_c2.name+" ortalaması: "+this.t+"\n");
        System.out.println(this.s_c3.name+" sözlü notu: "+this.s_c3.note);
        System.out.println(this.s_c3.name+" yazılı notu: "+this.s_c3.note2);
        System.out.println(this.s_c3.name+" ortalaması: "+this.k+"\n");
        System.out.println("avarege: "+this.avarage);
    }

}
