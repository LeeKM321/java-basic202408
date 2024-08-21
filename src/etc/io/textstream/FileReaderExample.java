package etc.io.textstream;

import etc.io.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample {

    public static void main(String[] args) {

        String targetPath = FileExample.ROOT_PATH + "/member.txt";

        try (FileReader fr = new FileReader(targetPath)) {

            BufferedReader br = new BufferedReader(fr);

            while (true) {
                String s = br.readLine();
                if (s == null) break;
                System.out.print(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
















