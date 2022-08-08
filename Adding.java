package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev3;

import java.util.ArrayList;
import java.util.Scanner;

public class Adding {
    Scanner input=new Scanner(System.in);
    ArrayList<Phone> phones=new ArrayList<>();
    ArrayList<Notebook> notebooks=new ArrayList<>();
    ArrayList<String> markList=new ArrayList<>();
    Phone pho;
    Notebook note;
    int phoId=1;
    int noteId=1;
    public void listPhone(){
        boolean bl=true;
        while (bl){
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("1-Cep Telefonularını listele ");
            System.out.println("2-Bir markaya göre listele");
            System.out.println("0-Çıkış");
            int b;
            int a=0;
            do {
                if (a!=0){
                    System.out.print("Geçerli bir sqayı girilmiştir. Tekrar deneyiniz: ");
                }else {
                    System.out.print("Bir rakam giriniz: ");
                }
                b=input.nextInt();
                a++;

            }while(b<0 || b>2);
            if (b==1){
                System.out.println("Cep Telefonu Listesi");
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println("| ID | Ürün Adı   \t\t\t| Fiyat\t\t| Marka\t\t| Depolama\t\t| Ekran\t\t| Kamera\t\t| Pil\t\t| RAM\t\t| Renk\t\t|");
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                a=1;
                for(Phone p: phones){
                    System.out.printf("| %-2s | %-20s| %-10s TL | %-10s| %-10s| %-12s | %-10s |%-10s| %-12s | %-10s |\n",a,p.getMarkName()+" "+p.getName(),p.getCost(),p.getMarkName(),p.getStroge(),p.getScreen(),p.getCamera(),p.getBattery(),p.getRam(),p.getCloor());
                    a++;
                }
            }if (b==2){
                a=1;
                System.out.print("Listelemek isstediğiniz markayı giriniz: ");
                String marka=input.next();
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println("| ID | Ürün Adı   \t\t\t| Fiyat\t\t| Marka\t\t| Depolama\t\t| Ekran\t\t| Kamera\t\t| Pil\t\t| RAM\t\t| Renk\t\t|");
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                for(Phone p: phones){
                    if (p.getMarkName().equals(marka)){
                        System.out.printf("| %-2s | %-20s| %-10s TL | %-10s| %-10s| %-12s | %-10s |%-10s| %-12s | %-10s |\n",a,p.getMarkName()+" "+p.getName(),p.getCost(),p.getMarkName(),p.getStroge(),p.getScreen(),p.getCamera(),p.getBattery(),p.getRam(),p.getCloor());
                        a++;
                    }
                }
            }if (b==0){
                bl=false;
            }
        }

    }

    public void listNote(){
        boolean bl=true;
        while (bl){
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("1-Bütün Notebook ları listele ");
            System.out.println("2-Bir markaya göre listele");
            System.out.println("0-Çıkış");
            int b;
            int a=0;
            do {
                if (a!=0){
                    System.out.print("Geçerli bir sqayı girilmiştir. Tekrar deneyiniz: ");
                }else {
                    System.out.print("Bir rakam giriniz: ");
                }
                b=input.nextInt();
                a++;

            }while(b<0 || b>2);
            if (b==1){
                System.out.println("Notebook Listesi");
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println("| ID | Ürün Adı   \t\t\t| Fiyat\t\t| Marka\t\t| Depolama\t\t| Ekran\t\t|");
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                a=1;
                for(Notebook p: notebooks){
                    System.out.printf("| %-2s | %-20s| %-10s TL | %-10s| %-10s| %-12s |\n", a,p.getMarkName()+" "+p.getName(),p.getCost(),p.getMarkName(),p.getStroge(),p.getScreen());
                    a++;
                }
                System.out.println("-------------------------------------------------------------------------------------------------------------");
            }if (b==2){
                a=1;
                System.out.print("Listelemek isstediğiniz markayı giriniz: ");
                String marka=input.next();
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println("| ID | Ürün Adı   \t\t\t| Fiyat\t\t| Marka\t\t| Depolama\t\t| Ekran\t\t|");
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                for(Notebook p: notebooks){
                    if (p.getMarkName().equals(marka)){
                        System.out.printf("| %-2s | %-20s| %-10s TL | %-10s| %-10s| %-12s |\n", a,p.getMarkName()+" "+p.getName(),p.getCost(),p.getMarkName(),p.getStroge(),p.getScreen());
                        a++;
                    }
                }

            }if (b==0){
                bl=false;
            }
        }




    }

    public void addPhone(){
        String markName;
        boolean bl=true;
        while(bl){
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("1- Telefon eklemek: ");
            System.out.println("2- Telefonları listelemek: ");
            System.out.println("3- Telefon silmek");
            System.out.println("0- Çıkış");
            int b;
            int a=0;
            do {
                if (a!=0){
                    System.out.print("Geçerli olmayan bir marka girilmiştir. Tekrar deneyiniz: ");
                }else {
                    System.out.print("Bir rakam giriniz: ");
                }
                b=input.nextInt();
                a++;

            }while(b<0 || b>3);

            if (b==2){
                listPhone();
            }if(b==1){
                a=0;
                do {
                    if (a!=0){
                        System.out.print("Geçerli olmayan bir marka girilmiştir. Tekrar deneyiniz: ");
                    }else{
                        System.out.print("Marka giriniz: ");
                    }
                    markName=input.next();
                    a++;
                }while (!(markList.contains(markName)));
                System.out.print("Fiyatını giriniz: ");
                int cost= input.nextInt();
                System.out.print("Adını giriniz: ");
                String name=input.next();
                System.out.print("Depolama alanını giriniz: ");
                int stroge= input.nextInt();
                System.out.print("Ekran boyutunu giriniz[inç]: ");
                int screen= input.nextInt();
                System.out.print("RAM ını giriniz[GB]: ");
                int ram= input.nextInt();
                System.out.print("Kamera çözünürlüğünü gürünüz: ");
                int camera= input.nextInt();
                System.out.print("Bataryasını giriniz: ");
                int battery= input.nextInt();
                System.out.print("Rengini giriniz: ");
                String cloor=input.next();
                System.out.print("İndirim oranını giriniz: ");
                int sale= input.nextInt();
                System.out.print("Stok miktarını giriniz: ");
                int strogeM= input.nextInt();
                pho=new Phone(phoId,cost,markName,name, stroge,screen,ram,camera,battery,cloor,strogeM,sale);
                phoId++;
                phones.add(pho);
            }if(b==0){
                bl=false;
            }if (b==3){
                listPhone();
                System.out.print("Silmek istediğiniz telefonun id sini giriniz: ");
                int clear=input.nextInt();
                phones.remove(clear-1);
            }
        }
    }


    public void addNotebook(){

        String markName;
        boolean bl=true;
        while(bl){
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("1- Notebook eklemek: ");
            System.out.println("2- Notebook listelemek: ");
            System.out.println("3- Notebook silmek");
            System.out.println("0- Çıkış");
            int b;
            int a=0;
            do {
                if (a!=0){
                    System.out.print("Geçerli olmayan bir marka girilmiştir. Tekrar deneyiniz: ");
                }else {
                    System.out.print("Bir rakam giriniz: ");
                }
                b=input.nextInt();
                a++;

            }while(b<0 || b>3);

            if (b==2){
                listNote();
            }if(b==1){
                a=0;
                do {
                    if (a!=0){
                        System.out.print("Geçerli olmayan bir marka girilmiştir. Tekrar deneyiniz: ");
                    }else{
                        System.out.print("Marka giriniz: ");
                    }
                    markName=input.next();
                    a++;
                }while (!(markList.contains(markName)));
                System.out.print("Fiyatını giriniz: ");
                int cost= input.nextInt();
                System.out.print("Adını giriniz: ");
                String name=input.next();
                System.out.print("Depolama alanını giriniz: ");
                int stroge= input.nextInt();
                System.out.print("Ekran boyutunu giriniz[inç]: ");
                int screen= input.nextInt();
                System.out.print("RAM ını giriniz[GB]: ");
                int ram= input.nextInt();
                System.out.print("İndirim oranını giriniz: ");
                int sale= input.nextInt();
                System.out.print("Stok miktarını giriniz: ");
                int strogeM= input.nextInt();
                note=new Notebook(noteId,cost,markName,name,stroge,screen,ram,strogeM,sale);
                noteId++;
                notebooks.add(note);
            }if(b==0){
                bl=false;
            }if (b==3){
                listNote();
                System.out.print("Silmek istediğiniz telefonun id sini giriniz: ");
                int clear=input.nextInt();
                notebooks.remove(clear-1);
            }
        }
    }







    public void adding(){
        markList.add("Apple");
        markList.add("Asus");
        markList.add( "Casper");
        markList.add("HP");
        markList.add("Huawei");
        markList.add("Lenovo");
        markList.add("Monster");
        markList.add("Samsung");
        markList.add("Xiaomi");


        boolean a=true;
        while (a){
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1-Notebook işlemleri");
            System.out.println("2-Cep telefonu işlemleri");
            System.out.println("3-Marka listele");
            System.out.println("0-Çıkış yap");
            int area;
            int b=0;
            do {
                if (b!=0){
                    System.out.print("Geçerli bir rakam girmediniz. Tekrar deneyiniz: ");
                }else{
                    System.out.print("Bir rakam giriniz: ");
                }
                area= input.nextInt();
                b++;
            }while(!(area>=0&& area<4));

            switch (area){
                case 1:
                    addNotebook();
                    break;
                case 2:
                    addPhone();
                    break;
                case 3:
                    System.out.println("Markalarımız");
                    System.out.println("----------------");
                    for (int i=0;i< markList.size();i++){
                        System.out.println("- "+markList.get(i));
                    }
                    break;
                default:
                    a=false;
                    break;
            }
        }

    }

}
