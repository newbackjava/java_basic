package org.example.day3.repeat;

public class Pattern2 {
    public static void main(String[] args) {
     //1. 1부터 499까지 누적해서 프린트
        int sum = 0;
        for (int i = 1; i < 500; i++) { //1~499
            sum = sum + i;
        }
        System.out.println(sum);

     //2. 1부터 100까지 중 4의 배수만 누적해서 프린트
        int sum2 = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0) {
                sum2 = sum2 + i;
            }
        }

     //3. 500부터 1까지 2씩 감소하면서 5의 배수는 빼고,
        // continue;사용!
     //   누적해서 프린트.
        //1증가 ==> for(int i = 0; i < 100; i++)
        //2증가                         i = i + 2
        //2감소                         i = i - 2
        int sum3 = 0;
        for (int i = 500; i > 0; i = i - 2) {
            if (i % 5 == 0) {
              continue;
            }
            sum3 = sum3 + i;
        }
    }
}
