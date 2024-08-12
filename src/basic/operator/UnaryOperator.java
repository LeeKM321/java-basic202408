package basic.operator;

import java.util.zip.ZipEntry;

public class UnaryOperator {

    public static void main(String[] args) {

        // 증감 연산자 (++, --)
        // 변수의 값을 단순히 하나 올리거나 내릴 때 사용합니다.

        int i = 1;
        int j = i++; // 후위 연산 (선연산 후증감)
        int k = i--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        System.out.println("------------------------------------------");

        int x = 1;
        int y = ++x; // 전위 연산 (선증감 후연산)
        int z = --x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}


















