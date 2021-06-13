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

        Human[] humans = new Human[16];
        humans[0] = new Student();
        humans[1] = new Teacher();
        humans[2] = new Employee();

        for(Human human : humans){
            human.getName();
        }
    }
    // 3,4,2,1,7,6
    //=> 1,2,3,4,6,7

    //Kiem, Lam, Hieu, tram, Nhi, Khang, Bao

}
