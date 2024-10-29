package org.example.day21.문제풀이;

import org.example.ArrPrint;

import java.util.Arrays;

public class 문제1 {
    public static void main(String[] args) {
//        String s = "감,배,위"; 각 글자를 추출 후(split())
//        오름차순으로 정렬하여 String에 넣어 프린트

        String s = "감,배,위";
        String[] s1 = s.split(",");
        ArrPrint.print(s1);
        Arrays.sort(s1);
        ArrPrint.print(s1);
        StringBuilder sb = new StringBuilder();
        for (String one: s1){
            sb.append(one);
        }
        System.out.println(sb);
        String result = sb.toString();
        System.out.println(result);

        //String배열에 있는 것을 String을 한번에 모아주는 함수.
        String result2 = String.join("", s1);
        System.out.println(result2);
    }
}
