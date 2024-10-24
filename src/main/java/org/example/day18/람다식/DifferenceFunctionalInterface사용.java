package org.example.day18.람다식;

public class DifferenceFunctionalInterface사용 {
    public static void main(String[] args) {
        // int subtract(int a, int b);
        DifferenceFunctionalInterface my = (a, b) -> a - b;
        System.out.println(my.subtract(300, 100));
    }
}
