package oop.modi.member.pac1;

import oop.modi.member.pac2.C;

public class B {


    void test() {

        A a1 = new A(50); // public
        A a2 = new A(5.55); // default
//        A a3 = new A(true); (x) private

        a1.f1 = 20;
        a1.f2 = 30;
//        a1.f3 = 40; // private

        a1.m1();
        a1.m2();
//        a1.m3(); // private

        C c = new C();
        c.c1 = 500;
//        c.c2 = 2;
//        c.c3 = 3;

    }

}











