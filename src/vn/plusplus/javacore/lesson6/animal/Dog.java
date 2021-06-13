package vn.plusplus.javacore.lesson6.animal;

public class Dog extends Animal{
    public int getTotalLeg(){
        return 4;
    }

    public int getTotalLeg(int quantity){
        return quantity*4;
    }
}
