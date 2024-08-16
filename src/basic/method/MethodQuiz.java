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

    // 원하는 인덱스 위치에 요소를 삽입하는 메서드를 작성하세요.
    // void insert(int targetIndex, String newFoodName)
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.
    static void insert(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) return;
        String[] temp = copy(1);
        for (int i = foods.length; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }
        temp[targetIndex] = newFoodName;
        foods = temp;
    }



    // 원하는 인덱스 위치의 요소를 수정하는 메서드를 작성하세요.
    // void modify(int targetIndex, String newFoodName)
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.
    static void modify(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) return;
        foods[targetIndex] = newFoodName;
    }

    // 특정 인덱스가 범위 내의 올바른 인덱스인지를 확인하는 메서드를 작성하세요.
    // boolean isOutOfBounds(int targetIndex)
    // 작성이 완료되면 타 메서드에서 활용할 수 있을 것입니다.
    static boolean isOutOfBounds(int targetIndex) {
        return targetIndex > foods.length - 1 || targetIndex < 0;
//        if (targetIndex > foods.length - 1 || targetIndex < 0) {
//            System.out.println("인덱스 범위가 올바르지 않아요!");
//            return true;
//        }
//        return false;
    }

    // 특정 인덱스의 요소를 삭제하는 메서드를 작성하세요.
    // void remove(String deleteTarget)
    static void remove(String deleteTarget) {
        int index = indexOf(deleteTarget);
        if (index == -1) return;

        for (int i = index; i < foods.length-1; i++) {
            foods[i] = foods[i + 1];
        }
        pop();
    }

    // 배열 내부를 깔끔하게 비워버리는 메서드를 작성하세요. (삭제 반복 x)
    // void clear()
    static void clear() {
        foods = new String[] {};
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

        insert(500, "apple");
        printFoods();

        modify(1, "hamburger");
        printFoods();

        remove("beef");
        printFoods();

        clear();
        printFoods();

        push("banana");
        printFoods();



    }

}
















