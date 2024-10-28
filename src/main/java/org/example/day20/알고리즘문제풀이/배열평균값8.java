package org.example.day20.알고리즘문제풀이;

public class 배열평균값8 {
    public static void main(String[] args) {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double answer = 0;
        int sum = 0;
        for (int x: numbers){
            sum += x;
        }
        answer = (double)sum / numbers.length;
        System.out.println(answer);
    }
}
