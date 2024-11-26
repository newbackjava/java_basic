package org.example.dbcp;

import java.util.Scanner;

public class MemberInsertUI1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id입력>> ");
        String id값 = sc.next(); //apple
        System.out.print("pw입력>> ");
        String pw값 = sc.next(); //1234
        System.out.print("name입력>> ");
        String name값 = sc.next(); //apple
        System.out.print("tel입력>> ");
        String tel값 = sc.next(); //1111
        sc.close();

        MemberVO vo = new MemberVO();
        //vo.setId(id값);
        vo.setPw(pw값);
        vo.setName(name값);
        vo.setTel(tel값);
        for (int i = 0; i <1000; i++) {
            MemberDAO1 dao = new MemberDAO1();
            vo.setId(id값+i);
            dao.insert(vo);
        }
    }
}
