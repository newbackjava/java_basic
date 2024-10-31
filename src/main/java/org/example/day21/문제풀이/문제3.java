package org.example.day21.문제풀이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문제3 {
    public static void main(String[] args) {
//        String[] s3 = {"제주도", "부산", "울릉도"};
//        s3 목록에 "울산", "파주", "인천"추가 후, 첫번째 위치에 있는 것 삭제
//        부산을 마산으로 변경후 하나의 String으로 묶어서 프린트
        String[] s3 = {"제주도", "부산", "울릉도"};
        List<String> list = new ArrayList<>(Arrays.asList(s3));
        list.add("울산");
        list.add("파주");
        list.add("인천");
        list.remove(0);
        list.set(1, "마산");
        //String.join(구분자, list나 array)
        //--> list, array에 있는데이터를 구분자를 넣어서 하나의 String으로 생성!
        String result = String.join(", ", list);
        System.out.println(result);
    }
}
