package vn.plusplus.javacore.lesson4;

public class ArrayExample2 {
    public static void main(String[] args) {
        //Tham tri
        int a = 10;
        System.out.println("Bien a ban dau: " + a);
        capNhatBien(a);
        System.out.println("Bien a sau khi goi ham: " + a);
        //Tham chieu
        int[] b = {10, 5};
        System.out.println("Phan tu dau tien cua mang ban dau: " + b[0]);
        capNhatMang(b);
        System.out.println("Phan tu dau tien cua mang sau: " + b[0]);
    }
    private static void capNhatBien(int a){
        a = 20;
    }
    private static void capNhatMang(int[] b){
        b[0] = 100;
    }
}
