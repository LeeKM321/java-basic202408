package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A {

    C() {
        super(100); // protected
    }

    @Override
    protected void m1() {
        super.m1();
    }

    void test() {

//        A a = new A(10); 상속 받기 전 (x)
//        A a = new A(3.14); 상속 받기 전 (x)

        super.f1 = 10;
//        super.f2 = 20; 상속 받은 후(x) -> default

        super.m1();
//        super.m2(); 상속 받은 후(x) -> default




    }

}











