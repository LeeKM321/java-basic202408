package oop.poly.car;

public class Main {

    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Car s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

//        s1.run();s2.run();s3.run();p1.run();p2.run();p3.run();
//        t1.run();t2.run();t3.run();t4.run();

//        Sonata[] sonatas = {s1, s2, s3};
//        for (Sonata s : sonatas) {
//            s.run();
//        }

        // 다형성을 적용해서 서로 다른 타입들을 모아놓을 수 있다. (이종 모음의 배열)
        Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
        for (Car c : cars) {
            c.run();
        }

        System.out.println("---------------------------------------------");

        Driver kim = new Driver();
        kim.drive(t4);
        kim.drive(s1);
        kim.drive(p2);

        System.out.println("---------------------------------------------");

        Tesla myTesla = (Tesla) kim.buyCar("테슬라");
        myTesla.run();
        myTesla.activeAutopilot();
//        Tesla t5 = (Tesla) myTesla;
//        t5.activeAutopilot();

        System.out.println("---------------------------------------------");

        CarShop shop = new CarShop();
        shop.carPrice(p2);
        shop.carPrice(t2);


    }
}

















