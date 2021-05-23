package vn.plusplus.javacore.lesson2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
        int b = scanner.nextInt();

        System.out.println("Tong 2 so a va b la: " + tinhTong(a,b));

    }


    private static int tinhTong(int a, int b){
        //Logic here
        return (a+b);
    }
}
