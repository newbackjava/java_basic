package org.example.day16.인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 버튼2처리클래스 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("b2클릭함.");
    }

    //추가기능도 더 넣을 수 있음.!
}
