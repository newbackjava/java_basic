package org.example.day20.알고리즘;

import java.util.Arrays;

public class 최댓값2 {
    public static void main(String[] args) {
       int[] numbers = {-20, -31, 24, 10, 1, 9};
        //정렬한 후,
        //맨 끝값 * 두번째 끝값
        Arrays.sort(numbers);
        int answer = 0;
        int post = numbers[numbers.length - 1]
                    * numbers[numbers.length - 2];
        int pre = numbers[0] * numbers[1];
        if (post > post) {
            answer = post;
        }else {
            answer = pre;
        }
        System.out.println(answer);
    }
}
