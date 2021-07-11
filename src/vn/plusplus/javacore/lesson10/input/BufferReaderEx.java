package vn.plusplus.javacore.lesson10.input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEx {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\plusplus\\java-core-08\\data\\student.txt");
            BufferedReader buf = new BufferedReader(fileReader, 10);
            //Cach 1
           /* int i = 0;
            while ((i=buf.read()) != -1){
                System.out.print((char) i);
            }*/

            //Cach 2
            String line ="";
            while ((line = buf.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
