package oop.inter.good;

public class BoardDelete implements IBoardService {
    @Override
    public void execute() {
        System.out.println("글 삭제 로직 동작!");
    }
}
