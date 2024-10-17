package org.example.day10.정규표현식;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규표현식1 {
    public static void main(String[] args) {
        String pt = "^[a-zA-Z]*$";
        System.out.println(Pattern.matches(pt, "abcaa"));
        System.out.println(Pattern.matches(pt, "123"));
        System.out.println(Pattern.matches(pt, ""));
        System.out.println();

        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
        Matcher result1 = pattern.matcher("abcaa");
        System.out.println(result1);
        System.out.println(result1.find());
        call(200);
    }
    public static void call(int x){
        int sum = x + 100;
        System.out.println(sum);
    }


}
