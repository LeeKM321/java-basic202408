package basic.array;

import java.util.Arrays;

public class ArrayPop {

    public static void main(String[] args) {

        // pop: 배열의 맨 끝 데이터 삭제하면서 꺼내옴.

        int[] numbers = {10, 20, 30, 40, 50, 60};

        // 1. 기존 배열보다 크기가 1개 작은 사이즈의 배열을 생성.
        int[] temp = new int[numbers.length - 1];

        // 2. 원본 배열에서 맨 끝 인덱스를 제외한 나머지 모든 내용을 복사.
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }

        // 3. 삭제값 백업
        int removedNumber = numbers[numbers.length-1];

        // 주소값 이전
        numbers = temp; temp = null;

        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("삭제된 값: " + removedNumber);


    }
}













