package basic.loop;

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // for문에서 continue는 증감식이 발동함.
            if (i == 5) continue;
            System.out.print(i + " ");
        }
        System.out.println("\n반복문 종료!");

        System.out.println("---------------------------------");

        int n = 0;
        while (n < 10) {
            // while에서 continue는 조건식으로 흐름이 이동.
            if (n == 5) continue;
            System.out.print(n + " ");
            n++;
        }
        System.out.println("\n반복문 종료!");

    }
}




















