package vn.plusplus.javacore.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3.5f, "HieuPC"));
        students.add(new Student(2.5f, "KiemNX"));
        students.add(new Student(3.0f, "Lam"));

        // Cach 1: Implement interface trong Student
        /*// Sap xep theo collection
        System.out.println("SAP XEP XUOI");
        Collections.sort(students);
        for(Student st : students){
            System.out.println(st);
        }
        System.out.println("SAP XEP CHIEU NGUOC LAI");
        Collections.reverse(students);
        for(Student st : students){
            System.out.println(st);
        }*/

        //Cach 2: Su dung Comparator tai vi tri can sap xep
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGpa() > o2.getGpa()){
                    return 1;
                } else if(o1.getGpa() < o2.getGpa()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for(Student st : students){
            System.out.println(st);
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Student st : students){
            System.out.println(st);
        }


        // Sap xep theo cach thong thuong
       /* List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(13);
        int temp;
        for(int i=0; i< numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {
                if(numbers.get(i) < numbers.get(j)){
                    temp = numbers.get(i).intValue();
                    numbers.set(i, numbers.get(j).intValue());
                    numbers.set(j, temp);
                }
            }
        }

        for(Integer nu : numbers){
            System.out.println(nu);
        }*/
    }
}
