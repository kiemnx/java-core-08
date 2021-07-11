package vn.plusplus.javacore.lesson10;

import vn.plusplus.javacore.lesson8.Student;

import java.io.*;

public class ObjectIOExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student a = new Student(3.0f, "Kiemnx");
//        Student b = new Student(2.5f, "Hieu");
        String fileName = "C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\plusplus\\java-core-08\\data\\output.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(a);
        System.out.println("Success...");

        //Doc
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student stIn = (Student) objectInputStream.readObject();
        System.out.println(stIn);
    }

}
