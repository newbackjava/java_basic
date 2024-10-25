package org.example.day19.스트림;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        li.stream()
                .peek(n -> System.out.println("filter 하기 전: " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("filter 로 홀수 제거: " + n)) // 짝수면 다음 스탭으로 현재순서의 값을 넘김
                .map(n -> n + 100)
                //.peek(n -> System.out.println("map 으로 100 더한 후: " + n))
               // .limit(1)
               .limit(2)
                .forEach(n -> System.out.println("-- forEach 최종 결과: " + n));
    }
}
