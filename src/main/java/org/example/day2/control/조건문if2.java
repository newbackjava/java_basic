package org.example.day2.control;

public class 조건문if2 {
    public static void main(String[] args) {
        int hour = 16;
        while (true) {
            if (hour < 11) {
                System.out.println("아직 멀었구나.");
            } else if (hour < 14) {
                System.out.println("좀 남았구나");
            } else if(hour < 18){
                System.out.println("조금 남았구나");
            } else{
                System.out.println("집에 가자! 공부 끝!");
                break;
               //System.exit(0);
            } //else
        }//while
        System.out.println("공부 많이 함.");
    }
}
