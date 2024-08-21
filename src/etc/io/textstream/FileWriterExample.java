package etc.io.textstream;

import etc.io.FileExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

// 텍스트 기반 스트림: 텍스트 입출력에 특화된 스트림
// 2바이트 이상 데이터를 처리 가능.
public class FileWriterExample {

    public static void main(String[] args) {

        String targetPath = FileExample.ROOT_PATH + "/hobby.txt";
        Scanner sc = new Scanner(System.in);

        try (FileWriter fw = new FileWriter(targetPath);
             BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.println("취미를 입력하세요: ");
            String hobby = sc.next();

            String outputMsg = String.format("내 취미는 %s 입니다.\n", hobby);

            // 파일 생성 및 데이터 출력
            bw.write(outputMsg);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}













