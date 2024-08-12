package basic.constate;

import java.util.Scanner;

public class SwitchExample1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("성별을 입력하세요. (M/F)");
        String gender = sc.next();

        switch (gender) {

            // java 14버전 개선된 switch
            case "M", "m":
                System.out.println("남성입니다.");
                break; // 해당 케이스만 실행하고 switch문을 종료해라!

            case "f": case "F": case "ㄹ":
                System.out.println("여성입니다.");
                break;

            default: // case를 설정하지 않은 값들은 모두 default로 빠집니다.
                System.out.println("잘못된 입력입니다.");

        }

        sc.close();
    }
}















