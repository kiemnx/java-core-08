package vn.plusplus.javacore.lesson3;

import java.util.Scanner;

public class LoopSyntax {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();
        int i = 1;

        for(; i < a; i = i+1){
            System.out.println(i + " < " + a);
            if(i==2){
                break;
            }
        }
        while (i<a){
            System.out.println(i + " < " + a);
            i = i + 1;
        }

        do{
            System.out.println(i + " < " + a);
            i = i + 1;
        } while (i<a);*/

        /*int i, sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số:");
            i = scanner.nextInt();
            *//*
             * Nếu số nhập < 0 thì sẽ kết thúc vòng lặp
             * và thực hiện câu lệnh bên ngoài vòng lặp.
             *//*
            if (i < 0) {
                break;
            }
            sum = sum + i;
        } while (i >= 0);    // i còn lớn hơn hoặc bằng 0 thì còn tiếp tục
        System.out.println("Kết quả = " + sum);*/

        int count;
        for (count = 1; count < 5; count++) {
            System.out.println("Lần lặp " + count);
            /*
             * kiểm tra nếu count còn nhỏ hơn 4
             * thì còn quay lại vòng for kiểm tra điều kiện lặp
             */
            if (count < 4) {
                continue;
            }
            // Nếu count không nhỏ hơn 4 thì hiển thị "Chào bạn!"
            System.out.println("Chào bạn!");
        }

    }
}
