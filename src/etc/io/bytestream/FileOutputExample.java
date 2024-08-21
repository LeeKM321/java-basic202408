package etc.io.bytestream;

import etc.io.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 기반 출력 스트림: 영상, 이미지, 텍스트 등 모든 데이터 출력 가능.
public class FileOutputExample {

    public static void main(String[] args) {

        String message = "Hello world! Today is 8/21, Wednesday~!";

        // try with resource: close가 필요한 하드웨어 접근 코드에 대해
        // 메모리 자원 반납 처리를 자동화 해 주는 문법. (1.8부터 사용 가능)
        // close 하려는 객체가 AutoCloseable 인터페이스의 구현체여야 합니다.
//        FileOutputStream fos = null;
        try(FileOutputStream fos
                    = new FileOutputStream(FileExample.ROOT_PATH + "/hello.txt"))
        {
//            fos = new FileOutputStreamFileExample.ROOT_PATH + "/upload/hello.txt"(FileExample.ROOT_PATH + "/upload/hello.txt");
            fos.write(message.getBytes()); // 파일 출력 명령
        } catch (Exception e) {
            e.printStackTrace();
        }


        /*finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


    }

}













