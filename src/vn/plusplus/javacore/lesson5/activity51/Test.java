package vn.plusplus.javacore.lesson5.activity51;

import vn.plusplus.javacore.lesson5.activity52.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        int width;
        int height;
        System.out.println("Moi nhap vao chieu dai: ");
        height = scanner.nextInt();
        System.out.println("Moi nhap vao chieu rong: ");
        width = scanner.nextInt();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        int chuVi = rectangle.tinhChuVi();
        int dienTich = rectangle.tinhDienTich();
        //in dien tich, chu vi
        System.out.println("Chu vi la: " + chuVi);
        System.out.println("Dien tich la: " + dienTich);

        // in chieu dai, rong
        rectangle.inWidthHeight();

        //Kiem tra hinh vuong
        boolean ketqua = rectangle.kiemTraHinhVuong();
        Student student = new Student();
        boolean gpaCheck = student.checkGPA();
        if(gpaCheck == true){
            System.out.println("Abc");
        }
    }
}
