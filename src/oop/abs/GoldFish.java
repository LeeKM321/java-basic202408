package oop.abs;

public class GoldFish extends Pet {

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void eat() {
        System.out.println("금붕어는 어류용 사료를 뻐끔뻐끔~~");
    }

    @Override
    public void takeNap() {
        System.out.println("금붕어는 어항에서 눈뜨고 자요~");
    }
}
