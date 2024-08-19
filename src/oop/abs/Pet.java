package oop.abs;

public abstract class Pet {

    // 공통 속성
    private String name;
    private String kind;
    private int age;

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    /*
	 # 추상 클래스, 추상 메서드
	 1. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는
	  실체가 없는 추상 메서드가 되며, 이 메서드는 상속을 통해 자식 클래스에서
	  무조건 오버라이딩을 하도록 강요됩니다.
	 2. 추상메서드는 실체가 존재하지 않는 틀 역할을 하기 때문에
	  메서드의 바디 ({})부분이 없고, 세미콜론으로 메서드 선언을 마감합니다.
	 3. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다. 추상 메서드가
	  하나라도 존재하는 경우에는 반드시 해당 클래스를 추상 클래스로 선언해야 합니다.
	 4. 추상 클래스에 추상 메서드만을 선언할 필요는 없습니다.
	  일반 멤버변수 및 메서드도 얼마든지 선언이 가능합니다.
	 */

    // 공통 기능
    // 밥먹는 기능
    public abstract void eat();

    // 낮잠 기능
    public abstract void takeNap();

    // 산책 기능
    // abstract를 붙이면 오버라이딩이 강제되기 때문에, 산책을 못하는 애완동물을 위해 abstract를 제거.
    public void walk() {}

    // 인사 기능
    public final String sayHello() {
        return "Hello!! " + this.name;
    }

}














