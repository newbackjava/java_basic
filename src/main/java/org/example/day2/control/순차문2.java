package org.example.day2.control;

import javax.swing.*;

public class 순차문2 {
    public static void main(String[] args) {
        String answer = "맑음";

        //날씨가 어때? 입력!
        //String input = JOptionPane.showInputDialog("날씨가 어때?");

        //맑음과 같은지, 다른지 출력!
        //System.out.println(answer.equals(input));

        double temp = 20; //온도
        double humid = 70; //습도
        //현재 온도와 습도를 입력받아
        String temp2 = JOptionPane.showInputDialog("현재 온도");
        String humid2 = JOptionPane.showInputDialog("현재 습도");

        double temp3 = Double.parseDouble(temp2);
        double humid3 = Double.parseDouble(humid2);

        //온도가 20도 보다 높고, 습도가 70보다 높은지 출력!
        System.out.println(temp < temp3 && humid < humid3);
        JOptionPane.showMessageDialog(null, temp < temp3 && humid < humid3);
        //Double.parseDouble()이용

        //코드 포맷팅 컨트롤 + 알트 + L

        double d = 123.565678223332423;
        System.out.println((int)d);
        System.out.printf("%.2f", d);
    }
}
