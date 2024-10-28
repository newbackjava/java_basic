package org.example.day20.알고리즘문제풀이;

public class 옷가게9 {
    public static void main(String[] args) {
        int price = 150000;
        int answer = 0;
        if(price >= 500000) {
            answer = (int)(price - price * 0.2);
        } else if(price >= 300000) {
            answer = (int)(price - price * 0.1);
        } else if (price >= 100000) {
            answer = (int)(price - price * 0.05);
        }else{
            answer = price;
        }
        System.out.println(answer);
    }
}
