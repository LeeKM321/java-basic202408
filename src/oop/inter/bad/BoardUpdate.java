package oop.inter.bad;

public class BoardUpdate {

    public BoardUpdate() {
        System.out.println("글 수정 요청이 들어옴!");
    }

    public void update() {
        System.out.println("글 수정 로직이 동작합니다.");
        System.out.println("수정된 값을 확인하고 DB에 수정 sql이 전달...");
    }
}
