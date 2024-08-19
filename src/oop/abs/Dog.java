package oop.abs;

public class Dog extends Pet {

    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void eat() {
        System.out.println("강아지는 사료를 와구와구!");
    }

    @Override
    public void takeNap() {
        System.out.println("강아지는 마당에서 쿨쿨쿨~");
    }

    @Override
    public void walk() {
        System.out.println("강아지는 산책을 좋아해요~~");
    }
}











