package Paket7_Collection_CokSıkKullanılıyor_ONEMLI.Odev3;


public class Phone {
    private int id;
    private int cost;
    private String markName;
    private String name;
    private int stroge;
    private int screen;
    private int ram;
    private int camera;
    private int battery;
    private String cloor;
    private int strogeM;
    private int sale;


    public Phone(int id, int cost, String markName, String name, int stroge, int screen, int ram, int camera, int battery, String cloor,int strogeM ,int sale) {
        this.id = id;
        this.cost = cost;
        this.markName = markName;
        this.name = name;
        this.stroge = stroge;
        this.screen = screen;
        this.ram = ram;
        this.camera = camera;
        this.battery = battery;
        this.cloor = cloor;
        this.strogeM=strogeM;
        this.sale=sale;
    }


    public int getStrogeM() {
        return strogeM;
    }

    public void setStrogeM(int strogeM) {
        this.strogeM = strogeM;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStroge() {
        return stroge;
    }

    public void setStroge(int stroge) {
        this.stroge = stroge;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getCloor() {
        return cloor;
    }

    public void setCloor(String cloor) {
        this.cloor = cloor;
    }

}
