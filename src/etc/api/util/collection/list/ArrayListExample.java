package etc.api.util.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

         /*
             # ArrayList
             - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
             - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
             - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
		 */

//        String[] nick = new String[50];

        // <> -> 제네릭 (타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
        List<String> nick = new ArrayList<>();

        String str = "야옹이";
        // add(객체): 리스트에 객체를 추가하는 메서드
        nick.add(str);
        nick.add("멍멍이");
        nick.add(new String("개구리"));
        nick.add("짹짹이");
        nick.add("야옹이");
        System.out.println(nick);

        // add(인덱스, 객체): 원하는 위치에 객체 삽입
        nick.add(3, "어흥이");
        System.out.println(nick);
        nick.add("어흥이");

        // get(인덱스): 리스트 내부의 객체를 참조
//        String name = nick[3];
        String name = nick.get(3);
        System.out.println("name = " + name);
        System.out.println("name.length() = " + name.length());

        // size(): 리스트의 크기 반환
        System.out.println("nick의 크기: " + nick.size());

        // set(인덱스, 수정할 객체): 리스트 내부의 객체를 수정
        nick.set(2, "삐약이");
        System.out.println(nick);

        // remove(인덱스), remove(객체)
        nick.remove(5);
        System.out.println(nick);
        nick.remove(str);
        System.out.println(nick);

        // 리스트 반복문 처리
        for (int i = 0; i < nick.size(); i++) {
            System.out.println(nick.get(i));
        }

        System.out.println("---------------------------------------");

        for (String s : nick) {
            System.out.println(s);
        }

        // contains(객체): 리스트 내의 객체의 존재 유무를 파악
        System.out.println(nick.contains("삐약이"));

        // indexOf(객체): 특정 객체의 인덱스 탐색, 없으면 -1 리턴
        int idx = nick.indexOf("어흥이");
        System.out.println("어흥이의 인덱스: " + idx);

        System.out.println(nick);

        // clear(): 리스트 내부요소 전체 삭제
        nick.clear();
        System.out.println(nick);

        // isEmpty(): 리스트가 비어있는지의 여부 확인
        System.out.println(nick.isEmpty());


        System.out.println("-------------------------------------------");

        /*
            # 컬렉션 객체들은 Collections의 기능을 사용할 수 있습니다.
            Collections는 컬렉션 객체들의 부가 기능들을 지원합니다.
         */

        List<Integer> score = new ArrayList<>();
        score.add(65);

        // 리스트 생성과 동시에 객체 초기화하기
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Arrays.asList()를 통해서 리턴받은 리스트는 삽입/삭제가 불가능합니다. (고정된 크기를 가짐)
//        list.add(100);
//        list.remove(6);
        list.set(0, 100);
        System.out.println(list);


        // 한번에 객체 많이 추가하기
        Collections.addAll(score, 78, 100, 88, 79, 100, 21, 56, 100);
        System.out.println(score);

        // 컬렉션 내의 객체의 개수 구하기
        System.out.println("100점 학생 수: " + Collections.frequency(score, 100));

        // 최대값, 최소값
        System.out.println("최대값: " + Collections.max(score));
        System.out.println("최소값: " + Collections.min(score));

        // 정렬
        Collections.sort(score);
        System.out.println(score);

        // 내림차 정렬
//        Collections.reverse(score); // 단순 역순 배치 (정렬 x)
        Collections.sort(score, Collections.reverseOrder());
        System.out.println(score);

        // 두 요소의 위치를 교체: swap(리스트, i, j);
        Collections.swap(score, 3, 7);
        System.out.println(score);

        // 리스트 내의 요소를 무작위로 섞기
        Collections.shuffle(score);
        System.out.println(score);

        // 원하는 객체로 컬렉션을 전부 초기화
        Collections.fill(score, 100);
        System.out.println(score);

    }

}












