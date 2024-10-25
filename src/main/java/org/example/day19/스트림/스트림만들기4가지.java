package org.example.day19.스트림;

import java.util.*;
import java.util.stream.IntStream;

public class 스트림만들기4가지 {
    public static void main(String[] args) {

//    1. List<Double> list1 = new ArrayList<>();
//   1000, 2000, 3000, 4000, 5000을 넣은 후
//    list1을 stream에 넣어 각각 1000을 뺀 후
//    전체 출력
        List<Double> list1 = new ArrayList<>();
        list1.add(1000.0);
        list1.add(2000.0);
        list1.add(3000.0);
        list1.add(4000.0);
        list1.add(5000.0);
        //List<Double> list12 = Arrays.asList(1000.0, 2000.0, 3000.0, 4000.0, 5000.0);
        list1.stream().map(x -> x - 1000).forEach(System.out::println);

//2. double[] list2 = {11.1, 22.2, 33.3, 44.4};
//    list2를 stream에 넣어 각각 10을 더한 후
//    전체를 합해서 출력
        double[] list2 = {11.1, 22.2, 33.3, 44.4};
        double sum = Arrays.stream(list2).map(x -> x + 10).sum();
        System.out.println(sum); //151.0

//3. 범위의 값 1500~3500까지를 만들어 stream에 넣어
//    전체의 평균을 구한 후 출력
        OptionalDouble avg =IntStream.rangeClosed(1500, 3500).average();
        //Optional~ : 결과가 있는지 없는지 체크하는 기능까지를 포함하는 객체
        if (avg.isEmpty()){
            System.out.println("결과값이 없음.");
        }else{
            System.out.println(avg.getAsDouble()); //2500.0
        }

       double avg2 =IntStream.rangeClosed(1500, 3500).average().orElse(0);

        //average가 없을 때 기본값 0을 설정하면 바로 double로 리턴 가능!
//4. 랜덤한 정수 값 100개, 3500부터 4000까지 만들어 stream에 넣어
//    중복 제거후 오름차순으로 정렬 후 출력
        Random r = new Random();
        r.ints(100, 3500, 4001)
            .distinct().sorted().forEach(System.out::println);
    }
}
