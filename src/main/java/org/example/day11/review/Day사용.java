package org.example.day11.review;

public class Day사용 {
    public static void main(String[] args) {
        System.out.println(Day.getAvg());
        System.out.println(Day.count);
        Day day1 = new Day("공부", 8, "삼성동");
        System.out.println(day1);
        //System.out.println(day1.toString());

        Day day2 = new Day("선정릉", 1, "삼성동");
        System.out.println(day2);

        Day day3 = new Day("가만히있기", 8, "삼성동");
        System.out.println(day3);

        System.out.println(Day.count);
        System.out.println(Day.sum);
        System.out.println(Day.getAvg());
    }
}
