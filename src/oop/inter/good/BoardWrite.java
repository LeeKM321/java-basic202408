package oop.inter.good;

public class BoardWrite implements IBoardService {
    @Override
    public void execute() {
        System.out.println("글 쓰기 로직 동작!");
    }
}
