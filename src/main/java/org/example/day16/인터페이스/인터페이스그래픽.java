package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;

public class 인터페이스그래픽 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        JButton b1 = new JButton("나를 눌러요.");
        JButton b2 = new JButton("나도 눌러요.");
        f.add(b1);
        f.add(b2);
        Font font = new Font("궁서", Font.BOLD, 50);
        b1.setFont(font);
        b2.setFont(font);

        TextArea list = new TextArea(6, 13);
        list.setFont(font);
        f.add(list);

        b1.addActionListener(new 버튼1처리클래스());
        //b2처리할 수 있는 클래스를 만드세요.
        //1.버튼2처리클래스 implements ActionListener
        //2.b2에 버튼 처리기능을 add하시고
        //3.b2처리하는 클래스로 버튼2처리클래스를 지정하세요.
        b2.addActionListener(new 버튼2처리클래스());
        //맨끝!!
        f.setVisible(true);

    }
}
