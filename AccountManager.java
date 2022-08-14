package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev4;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;

public class AccountManager extends Account{
    private String name;
    private String surName;
    private String eMail;
    private String password;
    private String job;
    private int age;
    private Date date;
    private AuthenticationStatus status;
    User user=new User();




    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public boolean Login(String eMail, String password){
        if (eMail.equals(geteMail()) && password.equals(getPassword())){
            setStatus(Account.AuthenticationStatus.SUCCESS);
            setPassword(password);
            seteMail(eMail);
            return true;
        }else{
            setStatus(Account.AuthenticationStatus.FAIL);
            return  false;
        }

    }


    @Override
    public int compareTo(Address o) {
        if (o.equals(this.karAdress.comparator())){
            return 1;
        }
        return -8;

    }
}
