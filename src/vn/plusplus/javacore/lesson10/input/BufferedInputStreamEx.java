package vn.plusplus.javacore.lesson10.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        BufferedInputStream buf = null;
        try {
            fileInputStream =
                    new FileInputStream("C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\plusplus\\java-core-08\\data\\student.txt");

            buf = new BufferedInputStream(fileInputStream, 10);
            int i = 0;
            while ((i = buf.read()) != -1){
                System.out.print((char) i);
            }
            fileInputStream.close();
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fileInputStream.close();
                buf.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
