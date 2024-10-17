package org.example.day13.상속;

import javax.swing.*;
import java.util.Timer;

public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerDoing task = new TimerDoing();
        //System.out.println("5초 타이머를 시작합니다.5초동안 게임을 할 수 있습니다.");
        JOptionPane.showMessageDialog(null, "5초 타이머를 시작합니다.5초동안 게임을 할 수 있습니다.");
        timer.schedule(task, 5000);
    }
}
