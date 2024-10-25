package org.example.day19.스트림;

import java.util.Arrays;

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
    }
}
