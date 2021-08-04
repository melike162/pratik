package Paket6_NYP_nesneTabanlıProgramlama;

public class F3 {
    public static void main(String[] args) {
        Teacher t1= new Teacher("mahmut","555","fzk");
        Teacher t2= new Teacher("Graham Bell","958","kim");
        Teacher t3= new Teacher("Newton","752","trh");

        Course fizik =new Course ("fizik","101","fzk");
        fizik.addTEacher(t1);

        Course kimya =new Course ("kimya","102","kim");
        kimya.addTEacher(t2);

        Course tarih =new Course ("tarih","102","trh");
        tarih.addTEacher(t3);

        Student s1= new Student("ada","0319","11",tarih,fizik,kimya);
        // note1=tarih,note2=fizik,note3=kimya
        s1.addBulkExamNote(55,55,65,65,45,45);
        s1.isPass();
    }

}
