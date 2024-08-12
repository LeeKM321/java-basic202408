package basic.loop;

public class WhileExample1 {

    public static void main(String[] args) {

        /*
             # while문의 진행 순서.
             1. 제어변수를 선언함. (시작값이 정해짐)
             2. while문의 조건식을 검사해서 true면 반복문이 시작.
              false라면 반복문 종료.
             3. while문 블록 내부가 한 번 진행되면(끝까지 내려가면)
              다시 조건식을 검사하여 true라면 반복문 계속 진행,
              false라면 반복문 종료.
             4. 반복문 내에는 증감식을 배치해서 제어변수의 값을 조정.
		 */

        int i = 1; // begin (제어변수)
        while (i <= 10) { // end (논리형 조건식) -> 제어변수의 끝을 지정
            System.out.println("안녕하세요~ 반갑습니다~!");

            i++; // step (증감식) -> 끝값에 도달하기 위한 제어변수의 조작.
        }

        System.out.println("=========================================");

        // 1 ~ 10까지의 누적 합계 구하기
        // 1 2 3 4 5 6 7 8 9 10

        int j = 1; // begin
        int total = 0; // 누적합을 기억해줄 변수.
        while (j <= 10) { //end
            total += j;
            j++; //step

            System.out.println("total = " + total);
            System.out.println("j = " + j);
            System.out.println("-------------------------------------");
        }

        System.out.println("total = " + total);



    }
}











