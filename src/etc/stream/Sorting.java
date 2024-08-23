package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(d -> d.getCalories()))
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        // 모든 메뉴들을 이름으로 내림차 정렬 (zyx순)
        System.out.println("=============================================");
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 칼로리가 300칼로리보다 큰 요리 중
        // 칼로리 낮은 순으로 앞에서 3개만 필터링
        System.out.println("=============================================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}

















