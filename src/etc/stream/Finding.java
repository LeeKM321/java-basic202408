package etc.stream;

import java.util.Comparator;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;

public class Finding {

    public static void main(String[] args) {

        // 메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가?
        boolean flag1 = menuList.stream()
                .anyMatch(Dish::isVegeterian);

        System.out.println("flag1 = " + flag1);

        // 메뉴 목록에서 칼로리가 100 이하인 요리가 하나라도 존재하는가?
        boolean flag2 = menuList.stream()
                .anyMatch(d -> d.getCalories() < 100);

        System.out.println("flag2 = " + flag2);

        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만인가요?
        boolean flag3 = menuList.stream()
                .allMatch(d -> d.getCalories() < 1000);

        System.out.println("flag3 = " + flag3);

        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만이 아닙니까?
        // allMatch: 리스트 안에 모든 객체를 검사해서 모두 일치하는지 확인
        // noneMatch: 모두 불일치 하는지를 검사.
        boolean flag4 = menuList.stream()
                .noneMatch(d -> d.getCalories() > 1000);

        System.out.println("flag4 = " + flag4);

        // 음식 중에 칼로리가 제일 낮은 음식을 조회해주세요.
        Dish dish = menuList.stream()
                .max(comparing(Dish::getCalories))
                .get();

        System.out.println("dish = " + dish);

    }
}


















