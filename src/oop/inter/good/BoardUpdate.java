package oop.inter.good;

public class BoardUpdate implements IBoardService {
    @Override
    public void execute() {
        System.out.println("글 수정 로직 동작!");
    }
}
