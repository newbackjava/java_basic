package org.example.day22.문자열;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        String myString = "bread"; //last index값 d -> a -> e
        //뒤집어서 스트링으로 모으자.!
        //StringBuilder
        //String에서 뒤에서 가지고 와서 sb에 그냥 쌓기만 함.!
        int last = myString.length() - 1;//4,3,2,1,0
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = last; i >= 0 ; i--) {
            stringBuilder.append(myString.charAt(i));
        }//for
        System.out.println(stringBuilder.toString());


    }
}
