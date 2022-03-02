package Paket5;

public class Employee {
    String name ;
    double salary;
    int workHours;
    int hireYear;
    double b=0;
    double c=0;
    double d=0;


    Employee(String name ,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        tax();
    }
    void tax(){

        if (this.salary>1000){
            this.d=this.salary*0.03;
        }
        bonus();
    }
    void bonus(){
        if (this.workHours>40) {
            this.c=(this.workHours-40)*30;
            }
        raiseSalary();
    }
    void raiseSalary(){
        int a=2021;
        if (a-hireYear<10){
            this.b+=this.salary*0.05;
        }
        if (a-hireYear>9 && a-hireYear<20){
            this.b+=this.salary*0.1;
        }
        if (a-hireYear>19){
            this.b+=this.salary*0.15;
        }
        toaString();
    }
    void toaString(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+this.d);
        System.out.println("Bonus: "+this.c);
        System.out.println("Maaş artışı: "+(this.b+this.d-this.d));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+(this.salary+this.c-this.d));
        System.out.println("Toplam maaş: "+(this.salary+this.b+this.d-this.d));
    }
}
