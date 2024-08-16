package oop.encap.good;

public class Main {

    public static void main(String[] args) {

        MyBirth my = new MyBirth();
//        my.year = 1992; (x)
        my.setYear(1992);
        my.setMonth(9);
        my.setDay(30);

        my.birthInfo();



    }
}












