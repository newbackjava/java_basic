package org.example.day10.정적static;

public class 통장 {
    String name;
    String ssn;
    int money;
    static int count; //0
    //static키워드가 붙어있는 변수는
    //객체생성와 상관없이
    //클래스에서 바로 접근해서 사용 가능한 변수
    //정적변수, static변수, 클래스 변수
    //"클래스명.변수명" 접근해서 사용 가능
    //1)객체마다 공유할 목적으로!(누적용)
    //2)객체생성하지 않고 언제든지 접근해서 사용 목적으로!
    public 통장(String name, String ssn, int money) {
        this.name = name;
        this.ssn = ssn;
        this.money = money;
        count++;
    }

    public String toString() {
        return "통장{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", money=" + money +
                '}';
    }
}
