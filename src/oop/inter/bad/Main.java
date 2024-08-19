package oop.inter.bad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("진행하실 번호를 입력하세요.");
        System.out.println("1. 글 쓰기 | 2. 글 조회 | 3. 글 수정 | 4. 글 삭제");
        int menu = sc.nextInt();

        if (menu == 1) {
            BoardWrite wr = new BoardWrite();
            wr.write();
        } else if (menu == 2) {
            BoardList list = new BoardList();
            list.selectBoard();
        } else if (menu == 3) {
            BoardUpdate update = new BoardUpdate();
            update.update();
        } else if (menu == 4) {
            BoardDelete delete = new BoardDelete();
            delete.delete();
        }

    }

}














