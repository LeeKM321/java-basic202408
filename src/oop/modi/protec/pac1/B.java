package oop.modi.protec.pac1;

public class B {

    void test() {

        A a = new A(10); // protected 생성자
        A a2 = new A(3.14); // default 생성자

        a.f1 = 10; a.f2 = 20;
        a.m1(); a.m2();

    }

}
