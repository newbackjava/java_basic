package org.example.day11.스태틱static;

import java.time.LocalDateTime;

public class 날짜확인문제 {
    public static void main(String[] args) {
        //p. 44페이지!
        //LocalDateTime을 이용해서 현재 날짜를 구하세요.(시작일)
        //종료일을 구하세요. 2주후 날짜를 구하세요.(종료일)
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusWeeks(2);
        System.out.println(start);
        System.out.println(end);
        //종료일이 시작일 후이면, 아직 대여중입니다.
        //종료일이 시작일과 동일하면, 대여종료날입니다.
        if(start.isBefore(end)) {
            System.out.println("아직 대여중입니다");
        }else{
            System.out.println("대여를 종료합니다.");
        }

    }
}
