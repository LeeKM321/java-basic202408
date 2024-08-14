package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {

        /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드
            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("# 먹고 싶은 음식을 입력하세요.");
        System.out.println("# 입력을 중지하려면 <그만> 이라고 입력하세요.");

        // 음식 이름을 저장할 배열 -> 초기에는 입력값이 없으니 빈 배열로 생성.
        String[] foodList = {};

        while (true) {
            System.out.print("> ");
            String newFood = sc.next();

            if (newFood.equals("그만")) break;

            // 기존 배열보다 큰 새 배열 생성
            String[] temp = new String[foodList.length + 1];

            // 기존 foodList에 있는 음식들 새 배열로 복사
            for (int i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }

            // 새 음식을 끝 인덱스에 추가하자
            temp[temp.length-1] = newFood;

            // 주소값 이전
            foodList = temp; temp = null;

        } // end while

        System.out.println("먹고 싶은 음식 리스트: " + Arrays.toString(foodList));

        sc.close();
    }
}

















