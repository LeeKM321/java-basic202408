package oop.static_.singleton;

public class Main {

    public static void main(String[] args) {

//        Singleton s = new Singleton();
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
        Singleton s5 = Singleton.getInstance();
//        Singleton.s = null;
        s.method1();
        s.method2();

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }
}
