package org.example.day13.상속;

import javax.swing.*;
import java.util.TimerTask;

public class TimerDoing extends TimerTask {

    @Override
    public void run() {
        //System.out.println("게임이 종료되었습니다.");
        JOptionPane.showMessageDialog(null, "게임이 종료되었습니다.");
    }
}
