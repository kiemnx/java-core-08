package vn.plusplus.javacore.lesson9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class ExeptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*while (true){
            System.out.println("Nhap a: ");
            int a = scanner.nextInt();
            System.out.println("Nhap b: ");
            int b = scanner.nextInt();
            int c = a/b;
            System.out.println("a/b=" + c);
        }*/
       /* while (true){
            System.out.println("Nhap vao so phan tu: ");
            int n = scanner.nextInt();

            int[] numbers = new int[n];
            System.out.println("Nhap vao gia tri phan tu index 5");
            int a = scanner.nextInt();
            numbers[5] = a;
            System.out.println("Gia tri phan tu index 5 vua nhap la: " + numbers[5]);
        }*/

        byte[] content = null;
        try {
            content = Files.readAllBytes(new File("C:\\Users\\han-haop\\Desktop\\kiemnx\\text.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(content));
    }
}
