package org.example.day22.문자열;

public class 문자반복출력 {
    public static void main(String[] args) {
        String n = "hello";
        int k = 3;
        //1. n을 char로 분리시켜서 - 1)배열, 2)charAt(인덱스)
        //2. k만큼 반복해서 -for문
        //3. 붙이자. - StringBuilder
        char[] c = n.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char one: c) {
            for (int i = 0; i < k; i++) {
                sb.append(one);
            }
        } //for
        System.out.println(sb.toString());
    }
}
