package org.example.day21.문제풀이;

import java.util.Arrays;

public class 문제4 {
    public static void main(String[] args) {
        //String s4 = "마사아차가나"; 오름차순으로 정렬 후 프린트
        String s4 = "마사아차가나";
        char[] c = s4.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        String result = new String(c);
        //char[] --> String으로 변환
        //String s = new String(char배열);
        System.out.println(result);
    }
}

