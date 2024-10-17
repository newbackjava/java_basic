package org.example.day9.문자파일;

import java.io.FileReader;
import java.io.Reader;

public class 문자읽기 {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("c:/data/공부.txt");
            char[] data = new char[30];
            int count = 0;
            while (true) {
                int data2 = reader.read(data);
                if (data2 == -1) break;
                for (char c : data) {
                    System.out.print(c);
                }
                count++;
                System.out.println();
            }
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("에러 정보 " + e.getMessage());
        }
    }
}
