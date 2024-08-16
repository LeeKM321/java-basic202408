package oop.static_.method;

import oop.static_.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        int result = Count.method2();

        Singleton s = Singleton.getInstance();
        s.method1();
        s.method2();

    }
}
