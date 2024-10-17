package org.example.day12.상속;

public class 사람 {
    char gender;
    String name;

    public 사람(char gender, String name) {
        //super(); --> 컴파일할 때 무조건 생성자 첫줄은 super()자동생성됨.
        this.gender = gender;
        this.name = name;
    }

    public void 잠자다(){
        System.out.println("잠자는 중.");
    }

    public void 먹다(){
        System.out.println("먹는 중.");
    }
}
