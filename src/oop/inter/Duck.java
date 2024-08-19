package oop.inter;

public class Duck extends Livings implements Huntable {

    @Override
    public void feed(String foodName) {

    }

    @Override
    public boolean sleep() {
        return false;
    }

    public void swim() {
        System.out.println("헤엄을 치자~~");
    }

    @Override
    public void hunt(Animal animal) {

    }
}
