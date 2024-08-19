package oop.inter;

public class Main {
    public static void main(String[] args) {

//        Animal a = new Animal(); // 객체 생성 x

        /*
        - 다형성은 상속이 전제되어야 하는 것이 원칙이지만
         예외로 인터페이스와 클래스 간의 구현 관계에서도
         다형성 발생을 허용합니다.
         */
        Animal duck = new Duck();
        Violent bullDog = new BullDog();
        Violent shark = new Shark();
        BadAnimal bear = new Bear();

        /*
		 - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
		  정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.

		 - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
		  구현하는 인터페이스들끼리 서로 즉시 형 변환이 가능합니다.
		 */

        // bear의 타입은 BadAnimal -> feed()에 대한 정보 없음 -> Animal 타입으로 즉시 형변환 가능
        // -> Bear 클래스가 Animal 인터페이스도 구현하고 있기 때문에.
        ((Animal) bear).feed("꿀");

        Animal[] animals = {duck, (Animal) bullDog, (Animal) bear, new Tiger()};


    }
}

















