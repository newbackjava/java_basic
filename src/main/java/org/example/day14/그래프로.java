package org.example.day14;

import javax.swing.*;
import java.awt.*;

public class 그래프로 extends JPanel{

private int[] data = {10, 20, 30, 40, 50}; // 그래프로 그릴 데이터
private String[] names = {"a", "b", "c", "d", "e"}; // 각 막대의 이름
private Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA}; // 각 막대의 색상

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int width = getWidth();
    int height = getHeight();
    int barWidth = width / data.length;
    int maxValue = 50; // 데이터의 최대값

    // 막대 그래프 그리기
    for (int i = 0; i < data.length; i++) {
        int barHeight = (int) ((double) data[i] / maxValue * height * 0.8); // 비율에 맞게 막대 높이 설정
        g.setColor(colors[i]); // 막대별로 다른 색상 설정
        g.fillRect(i * barWidth, height - barHeight - 30, barWidth - 10, barHeight); // 막대 그리기

        // 막대 아래에 이름 그리기
        g.setColor(Color.BLACK);
        g.drawString(names[i], i * barWidth + (barWidth / 4), height - 10); // 이름 위치 조정
    }
}

public static void main(String[] args) {
    JFrame frame = new JFrame(); // JFrame 생성
    그래프로 chart = new 그래프로(); // 그래프 패널 생성
    frame.add(chart); // 패널을 프레임에 추가
    frame.setSize(400, 400); // 프레임 크기 설정
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); // 프레임 보이게 설정
}
}