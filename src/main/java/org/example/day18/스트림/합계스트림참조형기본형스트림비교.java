package org.example.day18.스트림;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class 합계스트림참조형기본형스트림비교 {
    public static void main(String[] args) {
        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};
        Double[] arr222 = {5.0, 3.0, 1.0, 33.0, 35.0};
        System.out.println(Arrays.stream(arr2).sum());
        System.out.println(Arrays.stream(arr222).mapToDouble(Double::doubleValue).sum());
        Arrays.stream(arr2).filter(x -> x > 3)
                .boxed()
                .collect(Collectors.toList());
                //참조형만 가능!


        int[] arr22 = {5, 3, 10, 40, 2};
        int max = Arrays.stream(arr22).max().getAsInt();
        System.out.println(max);

        OptionalInt max2 = Arrays.stream(arr22).max();
        System.out.println(max2);
        if (max2.isPresent()) {
            System.out.println(max2.getAsInt());
        }else {
            System.out.println("최대값이 없음.");
        }


    }
}
