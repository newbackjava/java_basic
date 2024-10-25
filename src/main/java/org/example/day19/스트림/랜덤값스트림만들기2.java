package org.example.day19.스트림;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class 랜덤값스트림만들기2 {
    public static void main(String[] args) {
        Random r = new Random();
        //랜덤한 값 만들어서 바로 스트림에 넣을 수 있음.
        IntStream is = r.ints(100, 1, 100);
        //is.distinct().sorted().forEach(System.out::println);
        //System.out.println(result);

        //r.ints(100, 1, 100).sorted().forEach(System.out::println);
        //r.doubles(2000, 0, 100).forEach(System.out::println);
        DoubleStream ds = r.doubles(2000, 0, 100);
        //ds.distinct().peek(System.out::print);
        DoubleStream ds2 = ds.distinct();
        //System.out.println(ds2.peek(System.out::print));
        DoubleStream ds3 = ds2.sorted();
        System.out.println(ds3.count());

        //ds.forEach(System.out::println);
        //long count = ds.distinct().count();
        //System.out.println("중복 제거한 개수>> " + count + "개"); //2000
        //r.doubles(2000, 0, 100).distinct().sorted().forEach(System.out::println);
    }
}
