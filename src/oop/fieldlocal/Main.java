package oop.fieldlocal;

public class Main {

    public static void main(String[] args) {

        FieldAndLocal fl = new FieldAndLocal();

        fl.foo(100);

        fl.aaa = 50;
        System.out.println(fl.aaa);

    }
}
