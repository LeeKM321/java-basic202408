package basic.array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // 배열의 특징
        // 1. 동종 모음 구조: 같은 데이터 타입끼리만 배열에 담을 수 있다.
        // 2. 크기가 불변임: 크기를 동적으로 늘이거나 줄일 수 없다.

        // 배열의 생성 순서

        // 1. 배열 변수 선언
        int[] numbers;

        // 2. 배열 객체를 생성
        numbers = new int[5];
        System.out.println("numbers = " + numbers); // 주소값

        // 3. 배열 내부 초기화
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 3.14;
        numbers[3] = numbers[0] + 20;
        numbers[4] = 100;
//        numbers[5] = 10;
//        numbers[6] = 55;

        // 배열의 길이
        System.out.println(numbers.length);

        // 배열의 순회
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }

        System.out.println("=========================================");

        // 배열의 순회 foreach (향상된 for문)
        for (int n : numbers) {
            System.out.println("n = " + n);
        }

        // 배열 내부를 문자열 형태로 간결하게 출력.
        System.out.println(Arrays.toString(numbers));

        // 배열 한번에 만들기
        int[] pointList = new int[] {10, 20, 30, 40};
        System.out.println(Arrays.toString(pointList));

        // 만약 배열 변수 선언과 동시에 값을 초기화 할때
        // 한 번만 가능한 문법
        String[] pets = {"멍멍이", "짹짹이", "야옹이"};
//        pets = {"멍멍이", "짹짹이", "야옹이", "춘식이"}; 배열은 크기가 고정되어 있음!
        pets = new String[] {"멍멍이", "짹짹이", "야옹이", "춘식이"};

        System.out.println("=======================================");

        // 배열을 생성만 하고 값을 안넣으면?
        // -> 각 타입의 기본값으로 미리 초기화됨.
        // 기본값: 정수 0, 실수 0.0, 논리 false, 문자(char) 공백, 기타 null
        byte[] bArr = new byte[3];
        double[] dArr = new double[6];
        boolean[] blArr = new boolean[4];
        String[] sArr = new String[5];

        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(blArr));
        System.out.println(Arrays.toString(sArr));



    }
}


















