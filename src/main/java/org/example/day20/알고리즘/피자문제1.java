package org.example.day20.알고리즘;

public class 피자문제1 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 155; //1, 15
        //7조각보다 적은 인원이 왔을 때 --> 1
        //7의 배수가 왔을 때 --> 14 / 조각
        //7의 배수가 아닐 때
        // --> 15 / 조각 = 2(몫) + 1
        if ( n < 7){
            answer = 1;
        } else if (n % 7 == 0) {
            answer = n / 7;
        } else if (n % 7 != 0) {
            answer = n / 7 + 1;
        }
        System.out.println(answer);
    }
}
