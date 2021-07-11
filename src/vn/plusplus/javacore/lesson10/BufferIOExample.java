package vn.plusplus.javacore.lesson10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferIOExample {
    public static void main(String[] args) throws Exception{
        String imageIn = "C:\\Users\\han-haop\\Downloads\\4kImage.jpg";
        String imageOut = "C:\\Users\\han-haop\\Downloads\\out\\outImage.jpg";

        //Doc luong byte cua anh
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream(imageIn);
        BufferedInputStream bufIn = new BufferedInputStream(fileInputStream, 100);

        FileOutputStream fileOutputStream = new FileOutputStream(imageOut);
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOutputStream, 100);

        int i = 0;
        while ((i=bufIn.read()) != -1){
            bufOut.write(i);
        }
        bufIn.close();
        bufOut.flush();
        bufOut.close();
        fileInputStream.close();
        fileOutputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime)+ "ms");
    }
}
