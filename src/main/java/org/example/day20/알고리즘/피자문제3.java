package org.example.day20.알고리즘;

public class 피자문제3 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 15; //1, 15
        //7조각보다 적은 인원이 왔을 때 --> 1
        //7의 배수가 왔을 때 --> 14 / 조각
        //7의 배수가 아닐 때
        // --> 15 / 조각 = 2(몫) + 1
        int slice = 6;
        if ( n < slice){
            answer = 1;
        } else if (n % slice == 0) {
            answer = n / slice;
        } else if (n % slice != 0) {
            answer = n / slice + 1;
        }
        System.out.println(answer);
    }
}
