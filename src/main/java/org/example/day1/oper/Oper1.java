package org.example.day1.oper;

import javax.swing.*;

public class Oper1 {
    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog("당신의 이름을 입력하시오.");//"홍길동"
       String age = JOptionPane.showInputDialog("당신의 나이를 입력하시오."); //"100"

       int age2 = Integer.parseInt(age);

        System.out.println(name + " " + age2);
        //age2에 1을 더해서 age3에 넣었다가 프린트
        int age3 = age2 + 1;
        System.out.println("age3 " + age3);
    }
}
