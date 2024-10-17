package org.example.day9.문자파일;

import java.io.*;

public class 버퍼읽기 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:/new_java/start1/build.gradle");
            Reader os = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(os);
            long start = System.nanoTime();
            while (true){
                String line = bf.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            long end = System.nanoTime();
            System.out.println(end - start);
            bf.close();
            os.close();
            is.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
