package oop.static_.calc;

public class Calculator {

     /*
         - 계산기마다 색깔이 각각 다를 수 있기 때문에 color같은 변수는
          데이터를 공유시키지 말고, 객체별로 따로 관리해야 합니다.

         - 반면에 pi같은 원주율값은 계산기마다 값이 동일해야 하기 때문에
          static을 붙여서 데이터를 공유하게 하는 것이 유리합니다.
	 */

    String color;
    static double pi = 3.14159265;


    /*
    - 메서드 내부에서 non-static 데이터를 참조하고 있는 메서드는
     해당 변수의 정확한 위치 (객체의 주소값)를 알려줘야 하기 때문에
     static 메서드로 선언하기 부적절 합니다.
     */
    public void paint(String color) {
        System.out.println("계산기에 " + color + "색을 칠합니다.");
        this.color = color;
    }

    /*
        - 메서드 내부에서 인스턴스 변수를 참조하지 않고, 범용성 있게 사용하는 메서드는
         static 키워드를 붙여서 정적 메서드로 선언하면 사용이 편합니다.
     */
    public static double calcAreaCircle(int r) {
        double pi1 = Math.PI;
        return r * r * pi;
    }



}












