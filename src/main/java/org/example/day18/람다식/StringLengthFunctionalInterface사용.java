package org.example.day18.람다식;


public  class StringLengthFunctionalInterface사용 {
    //int getLength(String input);
    public static void main(String[] args) {
        StringLengthFunctionalInterface my = input -> input.length();
        System.out.println(my.getLength("오늘은 목요일이야!! 조금 신나.!"));
    }
}
