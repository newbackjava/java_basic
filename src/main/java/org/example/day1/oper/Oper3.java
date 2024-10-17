package org.example.day1.oper;

import javax.swing.*;

public class Oper3 {
    public static void main(String[] args) {
        //JOptionPane.showInputDialog()이용
        //정수1 입력 --> a변수 저장, 333
        String a = JOptionPane.showInputDialog("정수1 입력"); //String
        //정수2 입력 --> b변수 저장, 222
        String b = JOptionPane.showInputDialog("정수2 입력"); //String

        //입력을 받은 데이터를 int로 각각 변환하여 a2, b2로 저장
        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);
        //두 입력값의 평균을 구하시오.(실수로)
        double result =  (a2 + b2) / 2.0;
        System.out.println(result);
        JOptionPane.showMessageDialog(null, "결과는 \n" + result );
    }
}
