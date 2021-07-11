package vn.plusplus.javacore.lesson10.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\han-haop\\Desktop\\kiemnx\\project\\plusplus\\java-core-08\\data\\output.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, 10);
            bufferedWriter.write("5. name=Nguyen Van B,age=21");
            bufferedWriter.newLine();
            bufferedWriter.write("6. name=Nguyen Van C,age=22");
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Success...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
