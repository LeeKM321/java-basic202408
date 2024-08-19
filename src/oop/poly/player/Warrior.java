package oop.poly.player;

public class Warrior extends Player {

    int rage;

    Warrior(String nickName) {
        super(nickName);
        this.rage = 100;
    }

    public void dash() {
        System.out.println("돌진 스킬을 사용합니다.");
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage: " + rage);
    }
}















