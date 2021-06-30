package vn.plusplus.javacore.lesson9;

public class FinallyExample {
    public static void main(String[] args) {
        System.out.println("Before loop");
        int sum = 0;
        for(int i = 0; i<5; i++){
            System.out.println(i);
            if(i ==3){
                return;
            }
            sum += i;
            System.out.println("Tong hien tai: " + sum);
        }

        System.out.println("End test");
    }
}
