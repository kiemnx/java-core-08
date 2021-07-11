package vn.plusplus.javacore.lesson10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) throws IOException {
        String imageIn = "C:\\Users\\han-haop\\Downloads\\4kImage.jpg";
        String imageOut = "C:\\Users\\han-haop\\Downloads\\out\\outImage.jpg";

        //Doc luong byte cua anh
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream(imageIn);
        FileOutputStream fileOutputStream = new FileOutputStream(imageOut);

        int i = 0;
        while ((i=fileInputStream.read()) != -1){
            fileOutputStream.write(i);
        }
        fileInputStream.close();
        fileOutputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime)+ "ms");
    }
}
