package use_jdk;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {  //双向对列
    public static void main(String []args ){
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque.getFirst());
        deque.addFirst(10);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        deque.addLast(13);
        System.out.println(deque.getLast());
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        while(!deque.isEmpty()){  // isEmpty  方法 看链表里面有没有元素 有返回false  没有返回true
            if (!deque.isEmpty()){
                System.out.println(deque.getFirst());
            }
            if (!deque.isEmpty()){
                System.out.println(deque.removeFirst());
            }

        }

    }
}
