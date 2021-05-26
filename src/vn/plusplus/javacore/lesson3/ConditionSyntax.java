package vn.plusplus.javacore.lesson3;

import java.util.Scanner;

public class ConditionSyntax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();
        //Kiem tra so nhap chia het cho 2 hay ko, neu chia het thì in ra A chia het cho 2. Sau do in ra ket thuc chuong trinh

        int soDu = a%5;
      /*  if(soDu == 1){
            System.out.println(a + " chia 5 du 1");
        } else if(soDu == 2){
            System.out.println(a + " chia 5 du 2");
        } else if(soDu == 3){
            System.out.println(a + " chia 5 du 3");
        } else {
            System.out.println(a + " chia 5 du 4");
        }*/

        switch (soDu){
            case 1:
                System.out.println(a + " chia 5 du 1");
                break;
            case 2:
                System.out.println(a + " chia 5 du 2");
                break;
            case 3:
                System.out.println(a + " chia 5 du 3");
                break;
            case 4:
                System.out.println(a + " chia 5 du 4");
                break;
        }

       /*
        if(soDu == 2){
            System.out.println(a + " chia 5 du 2");
        }
        if(soDu == 3){
            System.out.println(a + " chia 5 du 3");
        }
        if(soDu == 4){
            System.out.println(a + " chia 5 du 4");
        }*/

        System.out.println("Ket thuc chuong trinh");
    }
}
