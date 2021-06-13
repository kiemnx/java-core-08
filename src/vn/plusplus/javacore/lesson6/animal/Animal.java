package vn.plusplus.javacore.lesson6.animal;

public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getTotalLeg(){
        return 0;
    }
    public int getTotalLeg(int quantity){
        return 2;
    }
}
