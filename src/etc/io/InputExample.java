package etc.io;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputExample {

    public static void main(String[] args) throws IOException {

        // 1 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        // split()
//        String[] arr = str.split(" ");
//        System.out.println(
//                Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])
//        );

        // StringTokenizer
        StringTokenizer st = new StringTokenizer(str, " ");
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        bw.write(i + j + "\n");

        bw.flush();
        bw.close();
    }

}















