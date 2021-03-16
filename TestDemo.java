public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.display();
        System.out.println("===========");
        myLinkedList.removeAllKey(2);
        myLinkedList.display();

    }
    public class Solution {
        public Node getIntersectionNode(Node headA, Node headB) {
            Node head1 = headA ;
            Node head2 = headA ;
            int count1 = 0 ;
            int count2 = 0 ;
            while (head1!=null){
                count1++;
                head1 = head1.next;
            }
            while (head2!=null){
                count2++;
                head2 =  head2.next;
            }
                return head1;
        }
    }
}
