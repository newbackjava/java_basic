package org.example.day20.알고리즘문제풀이;

import java.util.Arrays;

public class 중앙값3_4번 {

    public static void main(String[] args) {

//        3. {66, 33, 55, 22, 11} 중 크기를 기준으로 중앙값은?
//        배열의 요소의 길이가 홀수일때는 가운데 있는 값을 찾음.
        int[] x = {66, 33, 55, 22, 11};
        Arrays.sort(x);
        //가운데위치를 찾아야함.
        System.out.println(x.length / 2);
        int index  = x.length / 2;
        System.out.println(x[index]);

//        4. {66, 33, 55, 22, 11, 66} 중 크기를 기준으로 중앙값은?
//        배열의 요소의 길이가 짝수일때는 가운데 있는 값들을 찾아
//        더한 후 2로 나누어서 찾음.
        int[] x2 = {66, 33, 55, 22, 11, 66};
        Arrays.sort(x2);
        // 6 / 2 ==> 3, 2중앙위치 인덱스
        System.out.println(x2.length / 2); //중앙값2 인덱스
        System.out.println(x2.length / 2 - 1); //중앙값1 인덱스
        int sum = x2[x2.length / 2] + x2[x2.length / 2 - 1];
        System.out.println(sum / 2);
    }
}
