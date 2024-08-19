package oop.poly.player;

public class Hunter extends Player {

    String pet;

    public Hunter(String nickName, String pet) {
        super(nickName);
        this.pet = pet;
    }

    public void magicArrow(Player target) {
        System.out.printf("%s님이 %s님에게 매직 애로우를 시전했습니다!\n"
                , this.nickName, target.nickName);

        int damage; String job;
        if (target instanceof Warrior) {
            damage = 10; job = "전사";
        } else if (target instanceof Mage) {
            damage = 20; job = "마법사";
        } else {
            damage = 15; job = "사냥꾼";
        }

        target.hp -= damage;
        System.out.printf("%s님(%s)이 %d의 피해를 입었습니다.\n", target.nickName, job, damage);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);
        System.out.println("--------------------------------------------------");

    }



    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# pet name: " + pet);
    }

}
