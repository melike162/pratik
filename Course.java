package Paket6_NYP_nesneTabanlıProgramlama;

public class Course {
    Teacher teacher; // Teacher sınıfından teacher niteliğini(değişkenini) çağırır.
    String name;
    String code;
    String prefix;
    int note;
    int note2;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.note2=0;
    }
    void addTEacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacher();
        }
        else {
            System.out.println("öğetmen ve ders bölümleri uyuşmuyor!");
        }

    }

    void printTeacher(){

        this.teacher.print();
    }
}
