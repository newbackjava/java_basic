package org.example.day19.스트림;

import java.util.stream.IntStream;

public class Test2 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 5)
                .filter(x -> x >= 3).peek(x -> System.out.println("필터 후: >> " + x))
                .sorted().peek(x -> System.out.println("소트 후: >> " + x))
                .forEach(x -> System.out.println("소트 후: >> " + x));
    }
}
