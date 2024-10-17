package org.example.day7.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class 일기쓰기화면 {
    public static void main(String[] args) {
        /*
        1. JFrame frame = new JFrame();
            frame.setSize(350, 700);
            //맨끝!
            frame.setVisible(true);
           */
        JFrame frame = new JFrame();
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //2. 오늘의 날짜, 오늘의 제목, 오늘의 내용
        //      --> JLabel today, title, content 3개
        JLabel today = new JLabel();
        JLabel title = new JLabel();
        JLabel content = new JLabel();

        today.setText("오늘의 날짜");
        title.setText("오늘의 제목");
        content.setText("오늘의 내용");


        //3. 20200123, 목요일, 오늘은 연휴 전날임
        //--> JTextField today2, title2, content2
        // 3개 필요
        JTextField today2 = new JTextField(10);
        JTextField title2 = new JTextField(10);
        JTextField content2 = new JTextField(10);


        //4. 파일에 일기 저장
        //--> JButton save 1개 필요
        JButton save = new JButton();
        save.setText("파일에 일기 저장");

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        frame.add(today);
        frame.add(today2);
        frame.add(title);
        frame.add(title2);
        frame.add(content);
        frame.add(content2);
        frame.add(save);

        Font font = new Font("굴림", Font.BOLD, 25);
        today.setFont(font);
        today2.setFont(font);
        title.setFont(font);
        title2.setFont(font);
        content.setFont(font);
        content2.setFont(font);
        save.setFont(font);

        today2.setBackground(Color.PINK);
        title2.setBackground(Color.PINK);
        content2.setBackground(Color.PINK);
        save.setBackground(Color.YELLOW);

       // 5. 파일에 일기 저장을 클릭하면
        //today2, title2, content2에 입력한
       // 내용 가지고 와서 콘솔에 출력

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String today3 = today2.getText(); //get~~() <--> set~~()
                String title3 = title2.getText();
                String content3 = content2.getText();
                System.out.println(today3 + " " + title3 + " " + content3);
                
                //파일을 만드는 부품
                //가지고 온 데이터를 파일에 저장

                //파일도 만들어주고, 스트림으로 데이터를 저장까지 해주는 기능을 부품!
                try {
                    FileWriter file = new FileWriter(today3 + ".txt");
                    file.write(today3 + "\n");
                    file.write(title3 + "\n");
                    file.write(content3 + "\n");
                    file.close();
                    JOptionPane.showMessageDialog(frame, "파일 저장 성공");
                } catch (IOException ex) {
                    System.out.println("파일과 관련된 문제가 생김.");
                }
            }
        });
        frame.setVisible(true);
    }
}
