package basic.constate;

import java.util.Scanner;

public class IfExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();

        if (age >= 20) {
            if (age < 40) {
                System.out.println("청년 입니다.");
            } else if (age < 65) {
                System.out.println("중년 입니다.");
            } else {
                System.out.println("노년 입니다.");
            }
        } else if (age >= 17) {
            // 17, 18, 19
            System.out.println("고등학생 입니다.");
        } else if (age >= 14) {
            // 14, 15, 16
            System.out.println("중학생 입니다.");
        } else if (age >= 8) {
            System.out.println("초등학생 입니다.");
        } else {
            System.out.println("미취학 아동입니다.");
        }

        sc.close();

    }
}













