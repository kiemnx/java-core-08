package vn.plusplus.javacore.lesson5;

public class Refrigerator {
    private int eggNumber;
    private int litter;
    private String serialNumber;
    private String color;
    private int price;

    public Refrigerator() {
    }

    public Refrigerator(int eggNumber, int litter, String serialNumber, String color, int price) {
        this.eggNumber = eggNumber;
        this.litter = litter;
        this.serialNumber = serialNumber;
        this.color = color;
        this.price = price;
        System.out.println("");
    }

    public Refrigerator(int eggNumber, int litter) {
        this.eggNumber = eggNumber;
        this.litter = litter;
    }

    public Refrigerator(int litter) {
        this.litter = litter;
    }

    public Refrigerator(String input) {
        this.serialNumber = input;
    }

    public int getLitter() {
        return litter;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public boolean setEggNumber(int input){
        if(input > 0) {
            this.eggNumber = input;
            return true;
        }else {
            return false;
        }
    }

    public int getEggNumber(){
        return eggNumber;
    }

    public void setLitter(int input){
        if(input > 0)
            this.litter = input;
    }
    public void setSerialNumber(String serialNumber) {
        if(serialNumber != "" && serialNumber.length() == 16)
            this.serialNumber = serialNumber;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(){
        int a = 2;
        System.out.println("Egg number: " + eggNumber);
        System.out.println("Litter: " + litter);
        System.out.println("Serial: " + serialNumber);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}
