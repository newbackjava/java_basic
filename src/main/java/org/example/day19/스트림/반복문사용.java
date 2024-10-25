package org.example.day19.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 반복문사용 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        boolean result = Arrays.stream(intArr).allMatch(x -> x >= 3);
        if (result){
            System.out.println("모두 3이상 맞음.!");
        }else{
            System.out.println("모두 3이상 아니다.!");
        }
        System.out.println(result);
        Arrays.stream(intArr)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x)); //맨 끝에!
        System.out.println("-----------");

        int sum = Arrays.stream(intArr)
                    .filter(x -> x % 2 == 0)
                    .peek(x -> System.out.println(x)) //중간 결과 출력!
                    .sum();
        System.out.println("-----------");
        System.out.println(sum);

        System.out.println("=======================");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result2 = numbers.stream()
                .filter(n -> n % 2 == 0)               // 짝수 필터링
                .peek(n -> System.out.println("필터 후: " + n))  // 필터 후 상태 확인
                .map(n -> n * 10)                      // 요소를 10배로 변경
                .peek(n -> System.out.println("맵 후: " + n))    // 맵 후 상태 확인
                .collect(Collectors.toList());         // 최종 수집

        System.out.println(result2);

        System.out.println("=======================");
        numbers.stream()
                .filter(n -> n % 2 == 0)               // 짝수 필터링
                .peek(n -> System.out.print("필터 후: " + n + ", "))  // 필터 후 상태 확인
                .map(n -> n * 10)                      // 요소를 10배로 변경
                .peek(n -> System.out.println("맵 후: " + n + ", "))    // 맵 후 상태 확인
                .forEach(n -> System.out.print("최종: " + n + " "));       // 최종 수집
        System.out.println();
        System.out.println("=========================>");
        List<Integer> numbers2 = Arrays.asList(3, 1, 6, 2, 5, 4);

        numbers2.stream()
                .filter(n -> n % 2 == 0)                 // 짝수 필터링
                .peek(n -> System.out.print("필터 후: " + n + ", "))
                .sorted()  // 소트전까지는 filter를 하고, 다 sort한 후
                //sort한 결과의 스트림의 요소를 하나씩 꺼내서 map한 후 foreach로 요소 하나씩 출력!
                .peek(n -> System.out.print("소트 후: " + n + ", "))
                .map(n -> n * 10)
                .peek(n -> System.out.print("맵 후: " + n + ", "))// 요소를 10배로 변경
                .forEach(n -> System.out.print("최종: " + n + " "));
        //필터링하기 전까지는 filter하고 map하고
        //중간에 sort한번 해주고
        //sort한 이후에는 sort한 결과의 요소를 하나씩 다시 map하고 foreach해주고
        //                         다시 다음 요소를 하나씩 다시 map하고 foreach하고
        //limit가 있는 경우 전체를 다 꺼내서 map하고 foreach해줄 필요 없이,
        //sort한 것 중 세번만 map하고 foreach하면 끝!
    }
}
