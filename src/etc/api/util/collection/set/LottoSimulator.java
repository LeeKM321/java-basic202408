package etc.api.util.collection.set;

import java.util.*;

public class LottoSimulator {

    public static int prize1 = 0; // 1등 당첨 횟수를 기억할 변수.
    public static int prize2 = 0; // 2등 당첨 횟수를 기억할 변수.
    public static int prize3 = 0; // 3등 당첨 횟수를 기억할 변수.
    public static int prize4 = 0; // 4등 당첨 횟수를 기억할 변수.
    public static int prize5 = 0; // 5등 당첨 횟수를 기억할 변수.
    public static int failCnt = 0; // 미당첨 횟수를 기억할 변수.


    public static ??? createLotto() {
        /*
			 - 1~45 범위의 난수 6개를 생성하셔서
			  컬렉션 자료형에 모아서 리턴해 주세요.
			  무엇을 쓰든 상관하지 않겠습니다.
			  중복이 발생하면 안됩니다.
		 */
    }

    // 보너스 번호를 생성하는 메서드
    public static int createBonusNum(?? win) {
        // 당첨번호를 매개값으로 받아주세요.
        // 1 ~ 45 사이의 난수 중 당첨번호가 아닌 하나의 난수를 리턴하면 됩니다.
    }

    // 당첨 등수를 알려주는 메서드
    public static void checkLottoNumber(???) {
            /*
			 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
			 내 로또 번호와 당첨번호를 비교하여
			 일치하는 횟수를 세 주신 후 등수를 판단하세요.
			 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
			 6개 일치 -> 1등
			 5개 일치 + 보너스번호 일치 -> 2등
			 5개 일치 -> 3등
			 4개 일치 -> 4등
			 3개 일치 -> 5등
			 나머지 -> 꽝
		 */

    }


    public static void main(String[] args) {

        // 당첨 번호를 고정하세요.


        // 보너스 번호도 하나 고정하세요.


        int paper = 0; // 로또 구매 장수
        long cost = 0; // 로또 구매 금액

        while (true) {

            // 등수 확인 메서드를 호출하세요. 1등에 당첨될 때 까지 프로그램은 계속됩니다.

            if (prize1 == 1) {
                System.out.println("축하합니다! 1등에 당첨되셨습니다.");
                System.out.printf("누적 당첨 횟수\n2등: %d회\n3등: %d회\n4등: %d회\n5등: %d회\n꽝: %d회\n"
                        , prize2, prize3, prize4, prize5, failCnt);

                System.out.println("로또 구입한 장수: " + paper + "장");
                System.out.println("로또 구입한 총 금액: " + cost + "원");

                break; // 1등 당첨이 한 번이라도 된다면 반복문 종료.
            } else {
                System.out.println("로또 " + paper + "장 째 구매 중...");
            }

        }


    }

}
