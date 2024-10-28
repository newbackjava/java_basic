package org.example.day20.알고리즘문제풀이;

public class 머쓱이키7 {
    public static void main(String[] args) {
        int[] numbers = {149, 180, 192, 170};
        int height = 167;
        int answer = 0;
        for (int x: numbers){
            if (x > height) answer++;
        }
        System.out.println(answer);
    }
}
