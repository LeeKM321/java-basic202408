package basic.method;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"chicken", "pasta", "beef"};

    // 배열 내부 한눈에 보기
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 특정 요소가 배열에 포함되어 있는지의 여부 확인
    static boolean isInclude(String searchTarget) {
//        int idx = indexOf(searchTarget);
//        if (idx == -1) return false;
//        else return true;
        return indexOf(searchTarget) != -1;
    }

    // foods 배열에서 특정 데이터의 인덱스를 반환
    static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    // foods 배열에 데이터를 끝에 추가하는 함수
    static void push(String newFood) {
        String[] temp = copy(1);
        temp[temp.length-1] = newFood;
        foods = temp;
    }

    static void pop() {
        foods = copy(-1);
    }

    // 기존 배열 대비 크기가 다른 새 배열을 만들어 주는 메서드 (temp 만드는 것 메서드화)
    // size에 따라 크기가 큰 or 작은 배열을 만들어 줍니다.
    static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }

    static String[] copy(int size) {
        String[] temp = makeNewArray(size);

        int loopCount = (size >= 0) ? foods.length : temp.length;
        for (int i = 0; i < loopCount; i++) {
            temp[i] = foods[i];
        }
        return temp;
    }

    public static void main(String[] args) {

        printFoods();
        if (isInclude("bread")) {
            System.out.println("존재함!");
        }
        push("pork");
        push("icecream");
        printFoods();

        pop();
        printFoods();

    }

}















