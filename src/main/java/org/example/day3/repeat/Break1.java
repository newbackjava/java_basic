package org.example.day3.repeat;

public class Break1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //1~10
            if (i % 3 == 0) continue;
            if (i == 8) break;
            System.out.println(i);
        }
    }
}
