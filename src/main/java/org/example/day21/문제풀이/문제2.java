package org.example.day21.문제풀이;

public class 문제2 {
    public static void main(String[] args) {
//        String[] s2 = {"제주도", "부산", "울릉도"};
//        다음과 같이 출력되도록 하나의 String으로 묶어서 프린트
//        나는 제주도 가고 싶다. 나는 부산 가고 싶다. 나는 울릉도 가고 싶다.
        String[] s2 = {"제주도", "부산", "울릉도"};
        StringBuilder sb = new StringBuilder();
        for (String one: s2){
            sb.append("나는 " + one + " 가고 싶다. ");
        }
        System.out.println(sb);
        String result = sb.toString();
        System.out.println(result);
    }

}
