package etc.api.util.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            array.add(i);
            linked.add(i);
        }

        long start, end;
        // 배열리스트에서 데이터 제어
        start = System.currentTimeMillis();
        for (int i = 0; i < array.size(); i++) {
//            array.remove(0);
            array.get(i);
        }

        end = System.currentTimeMillis();

        System.out.printf("배열리스트의 소요시간: %dms\n", end-start);


        // 연결리스트에서 데이터 제어
        start = System.currentTimeMillis();
        for (int i = 0; i < linked.size(); i++) {
//            linked.remove(0);
            linked.get(i);
        }

        end = System.currentTimeMillis();

        System.out.printf("연결리스트의 소요시간: %dms\n", end-start);


    }

}















