package etc.api.util.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // 추가
        list.add("홍길동");
        list.add("김철수");
        list.add("박영희");

        list.addFirst("맨 앞");
        list.addLast("맨 뒤");
        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove("맨 앞");
        System.out.println(list);

        System.out.println("----------------------------------------");

        // LIFO -> Last In, First Out -> Stack
        // push, pop, peek
        list.push("춘식이");
        System.out.println(list); // 앞에서부터 추가

        // 삭제하면서 데이터를 얻기
        System.out.println(list.pop());
        System.out.println(list);

        // 삭제하지 않으면서 참조
        System.out.println(list.peek());
        System.out.println(list);

        // FIFO -> First In, First Out -> Queue
        // offer, poll, peek
        list.offer("a");
        list.offer("b");
        list.offer("c"); // 뒤에서부터 추가
        System.out.println(list);

        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list);




    }
}

















