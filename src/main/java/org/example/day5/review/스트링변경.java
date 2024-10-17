package org.example.day5.review;

public class 스트링변경 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("홍길동");
        sb.replace(0, 2, "감감");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
}
