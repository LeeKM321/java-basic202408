package etc.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {

    // 사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples) {
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : apples) {
            colorList.add(apple.getColor());
        }
        return colorList;
    }

    // 전역적 맵핑 메서드
    public static <X, Y> List<Y> map(List<X> list, GenericFunction<X, Y> mapper) {
        List<Y> mappedList = new ArrayList<>();
        for (X x : list) {
            // X에서 Y를 추출해주자 <- 이 동작을 파라미터화 시키자!
            Y y = mapper.apply(x);
            mappedList.add(y);
        }
        return mappedList;
    }

}













