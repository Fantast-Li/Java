package impl;

public class Test {
public class Node {
    int val ;
    Node next ;
}
public class LinkedList{
    Node head ;


}
public class LinkedListDperation {
    LinkedList linkedList = new LinkedList() ;

    public  Node addFirst (Node head, int x) {
      Node node = new Node() ;
      node.val= x;
      node.next = head ;
      return node ;
    }
}
public static void adjustDown (int [] array , int size ,int index){
    //伪代码表示
    // 1.判断index是不是叶子节点   如过index 有左孩子的话  那么index就不是叶子节点
    // 如果是叶子节点  结束  如果不是进行调整
    while (true) {
        int leftIndex = index*2+1 ;
        if (leftIndex>=size){
            return;  // 结束
        }
        //2.不是叶子节点 比较左右孩子的大小  把小的孩子和index交换
        int rightIndex = index*2+2;
        int minIndex = leftIndex ;
        if (rightIndex < size && array[rightIndex] < array[leftIndex]){
            minIndex = rightIndex ;
        }
        //如果index的值小于minIndex 则不需要数值进行交换  可以直接return
        if (array[index] <= array[minIndex]){
            return; //结束
        }
        //交换小孩子和index的值
        int c = array[index];
        array[index] = array[minIndex];
        array[minIndex] = c ;
        //将 最小值小标和index小标进行交换
        index = minIndex ;
        //进入下一次循环

        }
    }
}

