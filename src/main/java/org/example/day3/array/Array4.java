package org.example.day3.array;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        //1. 정수 배열을 만들어 11, 22, 33, 44, 55를 넣으세요.
        int[] num = {11, 22, 33, 44, 55}; //7개
        //(처음부터 값을 알고 있는 경우)
       // 1-1. 첫번 째 값을 프린트
        System.out.println(num[0]);

       // 1-2. 세번 째 값을 프린트
        System.out.println(num[2]);
      //  1-3. 마지막 값을 프린트
        System.out.println(num[4]);
        System.out.println(num[num.length - 1]);
      //  1-4. 전체 프린트
        System.out.println(Arrays.toString(num));
    }
}
