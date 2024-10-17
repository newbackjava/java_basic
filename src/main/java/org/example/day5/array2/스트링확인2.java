package org.example.day5.array2;

import java.util.Arrays;

public class 스트링확인2 {
    public static void main(String[] args) {
        String all = "국어, 영어, 수학, 컴퓨터";
        String[] all2 = all.split(", ");
        System.out.println(Arrays.toString(all2));
        for (int i = 0; i < all2.length; i++) {
            all2[i] = all2[i].trim();
        }
        System.out.println(all2.length);
        int count = 0;
        for (int i = 0; i < all2.length; i++) {
            if(all2[i].equals("컴퓨터")){
                System.out.println(i);
            }
            if (all2[i].length() < 3){
                count++;
            }
        }
        System.out.println(count);
    }
}
