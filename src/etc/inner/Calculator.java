package etc.inner;

// 람다를 사용할 수 있는 인터페이스인지 문법을 점검.
@FunctionalInterface
public interface Calculator {

    // 계산 기능 명세
    int operate(int n1, int n2);

}
