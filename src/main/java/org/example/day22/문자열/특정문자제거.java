package org.example.day22.문자열;

public class 특정문자제거 {
    public static void main(String[] args) {
        String myString = "abcdef";
        String letter = "f";
        //myString에 있는 것 하나씩 빼서 f가 아니면 모으자!
        //String을 모을 때는 StringBuilder쓰자.
        StringBuilder sb = new StringBuilder();
        //1.char배열로
        //2.chatAt(인덱스)
        for (int i = 0; i < myString.length(); i++) {
            //System.out.println(myString.charAt(i));
            if(myString.charAt(i) != letter.charAt(0)){
                sb.append(myString.charAt(i));
            }
        }//for
        String result = sb.toString();
        System.out.println(result);

        String result2 = myString.replace(letter, "");
        System.out.println(result2);
    }

}