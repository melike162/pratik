package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;

public abstract class Account implements Comparable<Address>{
    private String name;
    private String surName;
    private String eMail;
    private String password;
    private String job;
    private int age;
    private Date date;
    private AuthenticationStatus status;
    User user;
    ArrayList<Insurance> sigorta=new ArrayList<>();
    TreeSet<Address> karAdress;

    public Account() {
        seteMail("1");
        setPassword("1");
    }
    final void showUserInfo(){
        System.out.println("İsminiz: "+this.getName()+"\t\tSoy isminiz: "+getSurName()+"\t\te Mailiniz: "+geteMail()+
                "\t\tŞifreniz: "+getPassword()+"\t\tİşiniz: "+getJob()+"\t\tYaşınız: "+getAge()+"\t\tSon girme tarihinniz: "+getDate());
    }

    public TreeSet<Address> getKarAdress() {
        return karAdress;
    }

    public void setKarAdress(TreeSet<Address> karAdress) {
        this.karAdress = karAdress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public void howAcc(){}


    public enum AuthenticationStatus{
        SUCCESS,
        FAIL
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Insurance> getSigorta() {
        return sigorta;
    }

    public void setSigorta(ArrayList<Insurance> sigorta) {
        this.sigorta = sigorta;
    }
}
