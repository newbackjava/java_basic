package org.example.day18.람다식;


public class StringFunctionalInterface사용 {

    public static void main(String[] args) {
        //String convert(String input);
        StringFunctionalInterface my = input -> input.toUpperCase();
        System.out.println(my.convert("abc"));
    }
}
