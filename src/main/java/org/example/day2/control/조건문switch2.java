package org.example.day2.control;

public class 조건문switch2 {
    public static void main(String[] args) {
// 1.
        int month = 9;
        //계절판별
        if (month >= 3 && month <= 5) {
            System.out.println("봄");
        }else if (month >= 6 && month <= 8) {
            System.out.println("여름");
        }else if (month >= 9 && month <= 11) {
            System.out.println("가을");
        }else{
            System.out.println("겨울");
        }

//2.
        String food  = "짬뽕";
        //먹고 싶은 음식이 짬뽕이면 중국집으로
        //               우동이면 분식집으로
        //               감자탕이면 한식으로
        //위에 것에 포함되지 않으면 집에서 먹자.

        switch (food) {
            case "짬뽕":
                System.out.println("중국집으로");
                break;
            case "우동":
                System.out.println("분식집으로");
                break;
            case "감자탕":
                System.out.println("한식으로");
                break;
            default:
                System.out.println("집에서 먹자");
        }

    }
}
