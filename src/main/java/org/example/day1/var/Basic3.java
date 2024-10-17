package org.example.day1.var;

public class Basic3 {
    public static void main(String[] args) {
        System.out.println("기본형 연습3");
        //기본형 4가지 : 정수, 실수, 문자1, 논리
     //정수 : byte(127), short, int, long
        byte age = 120; //120
        short count = 25000; //+-3만
        int money = 1000000; //+-21억
        long bank = 2222222222L;
        //실수 : float, double
        float weight = 55.5F; //f
        double height = 188.8888;

        String name = "홍길동"; //0글자이상(문자열)
        String job = "자바 프로그래머";

        //내가 미래에 가질 재산 프린트(money+bank)
        //홍길동은 자바 프로그래머이다. 프린트(name+job)
        System.out.println(money + bank);
        System.out.println(name + "은 " + job);

    }
}
