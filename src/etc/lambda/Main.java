package etc.lambda;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static etc.lambda.Color.*;
import static etc.lambda.FilterApple.*;
import static etc.lambda.MappingApple.*;

public class Main {

    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========== 녹색 사과만 필터링 =========");
        List<Apple> greenApples = filterGreenApples(appleBasket);
        for (Apple apple : greenApples) {
            System.out.println(apple);
        }

        System.out.println("========== 다양한 색상의 사과 필터링 =========");
        List<Apple> redApples = filterAppleByColor(appleBasket, RED);
        for (Apple redApple : redApples) {
            System.out.println(redApple);
        }

        System.out.println("========== 원하는 조건의 사과 필터링 =========");
        List<Apple> lightApples = filterApple(appleBasket, new LightApplePredicate());
        for (Apple lightApple : lightApples) {
            System.out.println(lightApple);
        }

        System.out.println("===================================================");
        // 빨강 또는 노랑 사과만 필터링
        // 익명 클래스 (anonymous class)
        // new 인터페이스타입() {클래스내용}
        // 오버라이딩이 필요하다면 즉시 선언하여 사용합니다.
        List<Apple> apples = filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });
        for (Apple apple : apples) {
            System.out.println(apple);
        }

        System.out.println("===================================================");

        // 녹색이면서 100g 이하인 사과만 필터링
        // 인터페이스를 구현하는 익명 클래스를 람다식으로 선언. (추상메서드가 단 하나일 경우 가능)
        // 어짜피 filterApple의 두번째 매개값은 무조건 ApplePredicate 타입의 객체가 전달되어야 하고,
        // ApplePredicate는 추상메서드를 단 1개 가지고 있으니까 굳이 이름을 언급할 필요가 없는거지~
        // 게다가, 메서드 내부 코드가 단 1줄이고, 그게 또 마침 return이니까 괄호와 return을 생략할 수 있고.
        List<Apple> apples2
                = filterApple(
                        appleBasket,
                (a -> a.getColor() == GREEN && a.getWeight() <= 100)
        );

        for (Apple apple : apples2) {
            System.out.println(apple);
        }

        System.out.println("===================================================");

        // 색깔이 빨강 혹은 초록이면서 무게가 150g 미만이어야 한다.
        List<Apple> apples3 = filterApple(
                appleBasket,
                apple -> (apple.getColor() == RED || apple.getColor() == GREEN) && apple.getWeight() < 150
        );

        for (Apple apple : apples3) {
            System.out.println(apple);
        }

        System.out.println("======== 여러가지 타입의 객체를 필터링 =========");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 매개변수가 하나일 경우에는 소괄호 생략 가능. 없거나 두개 이상일 때는 소괄호 붙여야 합니다.
        List<Integer> filter1 = filter(numbers, n -> n % 2 == 1);
        System.out.println(filter1);

        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살");
        List<String> filter2 = filter(foods, f -> f.length() == 3);
        System.out.println(filter2);

        List<Apple> filter3 = filter(appleBasket, apple -> apple.getWeight() < 100);
        System.out.println(filter3);

        System.out.println("======== 사과의 색상만 맵핑 =========");
        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        System.out.println("======== 숫자를 주면 제곱된 수를 맵핑 =========");
        List<Integer> map1 = map(numbers, n -> n * n);
        System.out.println(map1);

        System.out.println("======== 음식을 주면 첫 글자만 맵핑 =========");
        List<Character> map2 = map(foods, f -> f.charAt(0));
        System.out.println(map2);

        System.out.println("======== 사과에서 무게만 맵핑 =========");
        List<Integer> map3 = map(appleBasket, apple -> apple.getWeight());
        System.out.println(map3);

        List<Integer> mapped = appleBasket
                .stream()
                .map(a -> a.getWeight())
                .collect(Collectors.toList());
        System.out.println(mapped);


    }

}












