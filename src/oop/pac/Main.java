package oop.pac;

import oop.pac.fruit.Apple;
import oop.pac.fruit.Banana;
import oop.pac.fruit.Melon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
        // 반드시 패키지 경로를 직접 표시해 주어야 합니다.

        Apple a = new Apple();
        oop.pac.juice.Apple a2 = new oop.pac.juice.Apple();
        Banana b = new Banana();
        Melon m = new Melon();

        new Scanner(System.in);

    }
}







