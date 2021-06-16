package vn.plusplus.javacore.lesson6.school;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        /*Student student = new Student();
        student.setName("KiemNX");
        System.out.println(student.getName());

        Teacher teacher = new Teacher();
        teacher.setAddress("Ha Noi");*/

       /* Student[] students = new Student[10];
        Teacher[] teachers = new Teacher[4];
        Employee[] employees = new Employee[2];*/

        Human[] humans = new Human[4];
        humans[0] = new Student();
        humans[1] = new Teacher(10000);
        humans[2] = new Employee(7000);
        humans[3] = new Officer(9000);

        ThiThuatToan hieu = new LamImplement();
        System.out.println(hieu.demSoNguyenTo(10));

//        humans[4] = new Human();

        for(Human human : humans){
            if(human instanceof Teacher){
                Teacher teacher = (Teacher) human;
                System.out.println("Luong thang: " + teacher.getMonthlySalary());
            }
            if(human instanceof Officer){
                Officer officer = (Officer) human;
                System.out.println("Luong thang: " + officer.getMonthlySalary());
            }
            if(human instanceof Employee){
                Employee employee = (Employee) human;
                System.out.println("Luong thang: " + employee.getMonthlySalary());
            }
        }
    }
    // 3,4,2,1,7,6
    //=> 1,2,3,4,6,7

    //Kiem, Lam, Hieu, tram, Nhi, Khang, Bao

}
