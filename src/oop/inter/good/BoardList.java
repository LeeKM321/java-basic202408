package oop.inter.good;

public class BoardList implements IBoardService {
    @Override
    public void execute() {
        System.out.println("글 목록 로직 동작!");
    }
}
