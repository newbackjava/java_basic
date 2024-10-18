package org.example.day14.크롤링;

import javax.swing.*;

public class 증권크롤러Main {
    public static void main(String[] args) {
        String code = JOptionPane.showInputDialog("code입력");
        //005930, 035720
        증권크롤러1 naver = new 증권크롤러1();
        try {
            naver.crawl(code);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
