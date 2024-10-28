package org.example.day20.알고리즘문제풀이;

import java.util.Arrays;

public class 최대값1_2번 {

    public static void main(String[] args) {
//        1. { 11, 55, 33, 22, 44 } 중 두 수를 곱해서 나올 수 있는 최대값은?
        int[] x = {11, 55, 33, 22, 44};
        Arrays.sort(x);
        System.out.println(x[x.length - 1] * x[x.length - 2]);

//        2. { 22, -88, -4, 11, 55} 중 두 수를 곱해서 나올 수 있는 최대값은?
        int[] x2 = { 22, -88, -4, 11, 55};
        Arrays.sort(x2);
        int post = x2[x2.length - 1] * x2[x2.length - 2];
        int pre = x2[0] * x2[1];
        int max = post;
        if (pre > post){
            max = pre;
        }
        System.out.println(post);
        System.out.println(pre);
        System.out.println(max);


    }
}
