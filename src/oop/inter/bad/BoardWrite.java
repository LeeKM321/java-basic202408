package oop.inter.bad;

public class BoardWrite {

    public BoardWrite() {
        System.out.println("글 작성 요청이 들어옴!");
    }

    public void write() {
        System.out.println("글 작성 로직이 실행됩니다.");
        System.out.println("작성 내용을 가져와서 검증 후 DB에 값을 집어넣고 등등...");
    }

}
