package org.example.day23.스레드기본;

public class 스레드메인2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new 스레드만들기());
        Thread t2 = new Thread(new 스레드만들기2());

        t1.start();
        t2.start();
    }
}
