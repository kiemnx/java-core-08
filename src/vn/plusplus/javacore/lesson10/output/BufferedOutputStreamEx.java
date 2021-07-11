package vn.plusplus.javacore.lesson10.output;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\plusplus\\java-core-08\\data\\output.txt");
            BufferedOutputStream bufOut = new BufferedOutputStream(fileOutputStream, 10);
            String data = "Java Core";
            bufOut.write(data.getBytes());
            bufOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
