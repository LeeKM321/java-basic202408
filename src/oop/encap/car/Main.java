package oop.encap.car;

public class Main {

    public static void main(String[] args) {

        Car c = new Car("포르쉐 파나메라");
        c.engineStart();
        c.setMode('D');
        c.setSpeed(100);
        c.setSpeed(0);
        c.setMode('P');
        c.engineStop();



    }
}
