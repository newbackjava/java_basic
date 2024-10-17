package org.example.day12.상속;

public class 트럭사용 {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.color = "핑크"; //Car
        t.speed = 100; //Car
        t.weight = 1; //Truck
        System.out.println(t);
        t.start(); //Car
        t.move(); //Truck
        t.end(); //Car
    }
}
