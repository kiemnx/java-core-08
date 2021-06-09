package vn.plusplus.javacore.lesson5.activity52;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] students;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        students = new Student[n];
        for(int i=0 ;i<n; i++){
            System.out.println("Nhap vao thong tin sv index: " + i);
            String name;
            double gpa;
            System.out.println("Nhao vao ten sv index: " + i);
            name = scanner.nextLine();
            System.out.println("Nhap vao gpa sv index: " + i);
            gpa = scanner.nextDouble();
            scanner.nextLine();
            Student sv = new Student();
            sv.setName(name);
            sv.setGpa(gpa);

            students[i] = sv;
        }

        StudentManagement studentManagement = new StudentManagement(students);

        int soSVDO = studentManagement.demSVDo();
        int soSVTruot = studentManagement.demSVTruot();

        Student maxStudent = studentManagement.timSVGPACaoNhat();
        Student minStudent = studentManagement.timSVGPAThapNhat();

        System.out.println("So SV DO: " + soSVDO);
        System.out.println("So SV Truot: " + soSVTruot);
        System.out.println("Sinh vien GPA cao nhat: ");
        maxStudent.printInfo();
        System.out.println("Sinh vien GPA thap nhat: ");
        minStudent.printInfo();

    }
}
