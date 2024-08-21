package etc.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

    // 파일을 저장할 기본 경로
    public static final String ROOT_PATH = "/Users/stephen/Desktop/develop/upload";
//    public static final String ROOT_PATH = "C:/users/Stephen/Desktop/upload";

    public static void main(String[] args) {

        // 폴더 생성 명령
        // 파일 정보를 가지는 객체 생성
        File directory = new File(ROOT_PATH + "/hello");

        // 폴더 생성
        if (!directory.exists()) directory.mkdir();

        // 파일 생성하기
        File newFile = new File(ROOT_PATH + "/hello/food.txt");

        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 생성 실패 ㅜㅜ");
            }
        }

    }

}
















