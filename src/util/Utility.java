package util;

import java.util.Scanner;

public class Utility {

    public static final String FILE_PATH;

    private static Scanner sc;

    static {
        FILE_PATH = "/Users/stephen/Desktop/develop/upload";
        sc = new Scanner(System.in);
    }

    // 단순 줄을 그어주는 메서드
    public static void makeLine() {
        System.out.println("=============================================");
    }

    // 문자열 입력을 처리
    public static String input(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

}














