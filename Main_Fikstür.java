package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Fikstür {
    public static void selectTeam(ArrayList<String> teams,String str){
        ArrayList<String> teams2=new ArrayList<>();
        ArrayList<String> teams3=new ArrayList<>();
        for (int j=0;j< teams.size();j++){
            for (int i = teams.size()-1; i >-1; i--) {
                String c = teams.get(i);
                teams2.add(c);
            }
        }
        for (int i=(teams.size()-3)/2;i>-1;i--){
            String c = teams.get(i);
            teams3.add(c);
        }

        for (int i=0;i< teams.size();i++){
            System.out.println("Round "+(i+1));
            int a=i;
            System.out.println(str+" vs "+teams2.get(a));
            teams3.add(teams2.get(a));
            a++;
            int c=teams3.size()-2;
            for (int j=(teams.size()-3)/2;j>-1;j--){
                System.out.println(teams3.get(c)+" vs "+teams2.get(a));
                c--;
                a++;
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0;i< teams.size();i++){
            System.out.println("Round "+(i+1+ teams.size()));
            int a=i;
            System.out.println(teams2.get(a)+" vs "+str);
            teams3.add(teams2.get(a));
            a++;
            int c=teams3.size()-2;
            for (int j=(teams.size()-3)/2;j>-1;j--){
                System.out.println(teams2.get(a)+" vs "+teams3.get(c));
                c--;
                a++;
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        System.out.println("Her takımdan sonra enter a basınız ve eğer takımlar bittiyse bir şey yazmadan enter a basınız.");
        System.out.println("Oynayacak olan takımları giriniz:");
        Scanner input= new Scanner(System.in);
        String str2 = null;
        ArrayList<String> teams=new ArrayList<>();
        ArrayList<String> teams2=new ArrayList<>();
        boolean checkTeam=true;
        String team;
        while (checkTeam){
            team= input.nextLine();
            if (team.isEmpty()){
                checkTeam=false;
                break;
            }
            teams.add(team);
        }

        if (teams.size()%2==0){
            for (int i = 0; i < teams.size(); i++) {
                String c = teams.get(i);
                if (i==0){
                    str2=c;
                }else{
                    teams2.add(c);
                }
            }
        }else {
            teams2.addAll(teams);
            str2="Bay";
        }

        for(String c: teams2){
            System.out.println("- "+c);
        }
        System.out.println();

        selectTeam(teams2,str2);
    }
}