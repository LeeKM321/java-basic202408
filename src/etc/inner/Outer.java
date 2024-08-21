package etc.inner;

public class Outer {


    void testMethod() {
        System.out.println("hello");
    }

    class Inner {
        int j = 2;
        void method2() {
            Outer.this.testMethod();
        }
    }


}
