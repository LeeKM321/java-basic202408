package oop.exception.basic;

import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수1: ");
        int i = sc.nextInt();
        System.out.println("정수2: ");
        int j = sc.nextInt();

        System.out.printf("%d / %d = %d\n", i, j, i/j);


        try {
            // try 블록에는 예외 발생 가능성이 있는 코드를 배치합니다.
        } catch (Exception e) {
            // catch 블록에는 try에서 실제 예외가 발생했을 경우
            // 실행할 내용을 작성합니다.
            System.out.println("0으로 나누지 마세요!");
        }

        System.out.println("프로그램 정상 종료!");


    }

}












