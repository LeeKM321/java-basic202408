package basic.loop;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {

        /*
        int j = 1;
        int total = 0;
        while (j <= 10) {
            total += j;
            j++;
        }
        */

        int total = 0;
        for (int i=1; i<=10; i++) {
            total += i;
        }

        // 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력(for)
        for (int i = 1; i <= 200; i++) {
            if (i % 6 == 0 && i % 12 != 0) {
                System.out.print(i + " ");
            }
        }

        // 정수를 하나 입력받아서
        // 입력받은 정수까지의 팩토리얼 값을 구하세요.
        // 팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();

        int fac = 1; // 팩토리얼 최종 값을 담을 변수
        for (int i = num; i >= 1; i--) {
            fac *= i;
        }

        System.out.printf("%d! = %d\n", num, fac);

        sc.close();


    }
}













