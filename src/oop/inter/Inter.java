package oop.inter;

public interface Inter {

    // 인터페이스에서 변수를 선언하면 상수(static final)로 인식합니다.
    static final int NUM = 5;

//    Inter() {
//        인터페이스는 생성자를 가질 수 없습니다. (객체화 될 수 없는 개념입니다.)
//    }

    // 인터페이스에서 메서드를 선언하면 추상 메서드로 지정됩니다.
    void method1();

    public static void staticMethod() {
        System.out.println("가능합니다~");
    }

}











