package com.springbootdemo.playWithFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//test for FileInputStream class(Byte oriented)
public class Main1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
             fileInputStream = new FileInputStream("src/main/java/com/springbootdemo/playWithFile/readMe.txt");
             fileOutputStream = new FileOutputStream("src/main/java/com/springbootdemo/playWithFile/output.txt");

             int c;
             while((c = fileInputStream.read()) != -1) {
                 System.out.println(c + " " + (char)c);

                 fileOutputStream.write(c);
             }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileInputStream != null) {
                fileInputStream.close();
                System.out.println("fileInputStream closed!!!");
            }
             if(fileOutputStream != null) {
                 fileOutputStream.close();
                 System.out.println("fileOutputStream closed!!!");
             }
        }

    }
}
