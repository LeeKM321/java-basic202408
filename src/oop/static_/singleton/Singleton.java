package oop.static_.singleton;

public class Singleton {

    /*
     # 싱글톤 디자인 패턴: 클래스의 객체를 단 1개로 제한하기 위한 디자인 패턴.
     무분별한 객체의 생성을 막고, 하나의 객체를 여러 번 재활용하기 위한 목적.

     1. 외부에서 이 클래스의 객체를 생성하지 못하도록 생성자를 단 1개만
      선언하고, private 접근 제한을 붙임.
     */

    private Singleton() {
        System.out.println("객체가 생성됨!");
    }

    // 2. 생성자를 호출할 수 있는 곳은 같은 클래스 내부 뿐이므로
    // 스스로의 객체를 단 1개만 생성함.
    private static Singleton s = new Singleton();

    // 3. 외부에서 이 클래스의 객체를 요구할 시, 2번에서 미리 만들어 놓은
    // 단 하나의 객체의 주소값을 공개된 메서드를 통해 리턴합니다.
    public static Singleton getInstance() {
        return s;
    }


    ////////////////////////////////////////////////////////

    public void method1() {
        System.out.println("여러 군데에서 쓰이는 중요한 메서드!");
    }

    public void method2() {
        System.out.println("프로그램 내에서 꼭 한번 불러야 하는 귀한 메서드");
    }




}




















