package org.example.day15.컬렉션;

public class Box<T> {
    T content;
    public void setContent(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
    public static <U1, U2> boolean compare(U1 a, U2 b) {
        return a.equals(b);
    }
}
