package org.example.day8.class사용;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class 입력스트림2 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/data/imsi.txt");

            byte[] data = new byte[100];


            while(true){
                //int data = is.read();
                int num = is.read(data);
                if(num == -1) break;

                System.out.println(new String(data));
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}