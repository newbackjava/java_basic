package org.example.day15.컬렉션;

public class 제너릭추가문제 {
    public static void main(String[] args) {
        // 정수를 저장하는 Box
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
//        System.out.println("Integer Box: " + integerBox.getContent());
        // 문자열을 저장하는 Box
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
//        System.out.println("String Box: " + stringBox.getContent());
        System.out.println(Box.compare(integerBox, "asdf"));
    }
}