package org.example.day20.알고리즘;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        Solution3 solution2 = new Solution3();
        int answer = solution2.solution(num1, num2);
        System.out.println(answer);
    }
}

class Solution3 {
    public int solution(int num1, int num2) {
        int answer = 0;
        //나누어서
        double result = (double)num1 / num2;
        //1000을 곱한 후
        double result1 = result * 1000;
        //정수만 리턴
        answer = (int)result1;
        return answer;
    }
}
