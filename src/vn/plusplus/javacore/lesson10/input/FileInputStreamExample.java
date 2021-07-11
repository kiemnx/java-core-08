package vn.plusplus.javacore.lesson10.input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream =
                    new FileInputStream("C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\plusplus\\java-core-08\\data\\student.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1){
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fileInputStream.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
