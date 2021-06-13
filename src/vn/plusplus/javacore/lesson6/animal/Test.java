package vn.plusplus.javacore.lesson6.animal;

public class Test {
    public static void main(String[] args) {
        Animal animals;
        animals = new Dog();

        Animal dog = new Dog();

//        System.out.println("Dog total legs: " + animals.getTotalLeg());

        /*animals = new Chicken();
        System.out.println("Chicken total legs: " + animals.getTotalLeg());

        animals = new Spider();
        System.out.println("Spider total legs: " + animals.getTotalLeg());*/

        String s = "Hello";
        s = s.substring(6);
        System.out.println(s);
    }
}
