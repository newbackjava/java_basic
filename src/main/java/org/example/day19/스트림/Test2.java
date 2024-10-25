package org.example.day19.스트림;

import java.util.stream.IntStream;

public class Test2 {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1, 5)
//                .filter(x -> x >= 3).peek(x -> System.out.println("필터 후: >> " + x))
//                .sorted().peek(x -> System.out.println("소트 후: >> " + x))
//                .forEach(x -> System.out.println("최종 : >> " + x));

        System.out.println("---------------");
        IntStream.rangeClosed(1, 10)
                .filter(x -> x >= 3)           // 3, 4, 5로 필터링
                .sorted().peek(x -> System.out.println("소트후>> " + x))
                .limit(3)// 필터링된 값을 정렬하지만 실제로는 최종 연산이 있어야 실행됨
                .forEach(System.out::println); // 최종 연산으로 여기서 정렬된 결과가 평가됨
    }
}
