package vn.plusplus.javacore.lesson2;

public class Lesson2 {
    int x2 = 10;
    static int z = 20;
    static final int CONSTANT = 10;
    public static void main(String[] args) {
         // * * * * * * * *
        byte max = 127; //2^n -1
        byte min = -128; // -(2^n)
        int x = 10; // max int = 2^32-1, min int = -(2^32)
        int y = 2; //

        float soThuc = 3.5f;
        double soThucLon = 3.5;

        int tong = x + y;
        int hieu = x - y;
        int tich = x*y;
        int chia = x/y;

        x *= 2; // x = x*2;
        x -= 2; // x = x -2;
        x += 2; // x = x+2;
        x /= 2; // x = x/2;

        long a = 10;
        long b = a;
        a = 1 + a;
//        System.out.println(b);

//        System.out.println("Tong cua x va y la: " + tong);


        int c = 5;
        int d = 5;
        boolean result = c != d;
//        System.out.println(result);

        int e = 12;
        boolean flag2 = e%2 == 0;
        boolean flag5 = e%5 == 0;

        String text = (flag2 && flag5) ? "E chia het cho 10" : "E khong chia het cho 10";

//        System.out.println(text);

        int f = 20; // 10100
        int g = f >> 1; // 1010
        int h = f << 1;
        System.out.println(g);
    }

    private int getIntNumber(){
        return z;
    }
}
