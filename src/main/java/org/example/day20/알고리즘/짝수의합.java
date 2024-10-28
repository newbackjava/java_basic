package org.example.day20.알고리즘;

public class 짝수의합 {
    public static void main(String[] args) {
        int n = 4; //0< n <= 1000
        int answer = 0; //짝수의 합
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
