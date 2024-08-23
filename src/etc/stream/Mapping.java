package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {} ]
// filter   : [ {}, {}, {} ]
// map      : [ "", "", "", "", "" ]
public class Mapping {

    public static void main(String[] args) {

        // 요리 이름만 추출
        List<String> nameList = menuList.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(nameList);

        System.out.println("==========================================");

        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );

        List<Integer> list = words.stream()
                .map(String::length) // String 클래스의 length 메서드를 매개변수에 적용.
                .toList();
        System.out.println(list);

        // words에서 각 요소의 첫글자만 추출
        List<Character> collect = words.stream()
                .map(w -> w.charAt(0))
                .collect(Collectors.toList());// 가변 리스트 리턴 (8버전)
//                .toList() // 불변 리스트 (16버전 이후)

        System.out.println(collect);

        System.out.println("================================================");

        // 메뉴 목록에서 메뉴 이름과 칼로리만 추출해서
        // 새로운 객체로 포장해서 받고 싶음.
        List<SimpleDish> simpleDishes = menuList.stream()
                .map(SimpleDish::new) // 생성자 메서드 참조식
                .collect(Collectors.toList());

        simpleDishes.forEach(System.out::println);

        System.out.println("=============================================");

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */
        List<DishDetail> detailList = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(DishDetail::new)
                .collect(Collectors.toList());

        System.out.println(detailList);

        System.out.println("========================================");

        // 메뉴 목록에 있는 요리들의 총 칼로리 구하기
        int sum = menuList.stream()
                .mapToInt(Dish::getCalories)
                .sum();

        System.out.println(sum);

        // 육류 메뉴의 평균 칼로리 구하기

        System.out.println("========================================");
        double averageCalories = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(Dish::getCalories)
                .average()
                .getAsDouble();

        System.out.println(averageCalories);

    }
}



















