package etc.api.util.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        /*
        # Map
        - Key / Value가 한 세트를 이루는 자료구조
        - Key값을 통해 Value를 참조하는 방식 (인덱스 x)
        - Key는 중복 저장을 허용하지 않음.
         */

        // Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설정.
        Map<String, String> map = new HashMap<>();

        // Map에 데이터를 추가: put(key, value)
        map.put("멍멍이", "김철수");
        map.put("야옹이", "홍길동");
        map.put("짹짹이", "박영희");
        System.out.println(map);

        // Key를 중복 사용하는 경우
        // 기존 Key에 맵핑된 Value가 수정됨.
        map.put("멍멍이", "김춘식"); // key 중복
        map.put("어흥이", "홍길동"); // value 중복
        System.out.println(map);

        // Key의 존재 유무를 확인하는 메서드: containsKey(key)
        System.out.println(map.containsKey("어흥이"));

        String nick = "메롱이";
        if (map.containsKey(nick)) {
            System.out.printf("별명이 %s인 학생의 이름은 %s입니다.\n", nick, map.get(nick));
        } else {
            System.out.println("그런 별명 없습니다~");
        }

        // Map에서 Key들만 추출하는 메서드 keySet()
        // 모든 Key들을 Set에 담아서 반환합니다 -> forEach 사용이 가능해짐.
        for (String s : map.keySet()) {
            System.out.printf("key: %s, value: %s\n", s, map.get(s));
        }

        // Map의 객체를 삭제: remove(key)
        // key를 주시면 value도 함께 제거됩니다.
        map.remove("야옹이");
        System.out.println(map);

        map.clear();

        // Collections의 메서드는 Collection 인터페이스 타입을 전달받기 때문에
        // Map은 사용이 힘듭니다.
//        Collections.addAll(map, 1,2,3,4); (x)

    }

}













