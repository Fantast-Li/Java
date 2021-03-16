class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {

    public Node head;//标识单链表的头节点

    //public int usedSize;
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        /*if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }*/
        node.next = this.head;
        this.head = node;
    }

    public void display() {
        Node cur = this.head ;
        if (this.head == null){
            System.out.print("此链表为空!");
        }
        while(cur != null) {
            System.out.println(cur.data+ " ");
            cur = cur.next ;
        }
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (this.head == null) {
            node = this.head;
        } else {
            while (cur.next != null) {
                cur.next = cur;
            }
            cur.next = node;
        }
    }
    //检查索引是否合法
    public boolean checkIndex(int index){
        if (index<0 || index >this.getLength()){
            System.out.println("小标不合法");
            return false ;
        }
        return  true ;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        Node node = new Node(data);
        if (!checkIndex(index)){
            return;
        }
        if (getLength()==0){
            addFirst(data);
            return ;
        }
        if (getLength() == index){
            addLast(data);
            return;
        }
        //cur 保存是 index 节点的引用
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }
    // 求链表的长度
    public int getLength(){
        int count =0 ;
        Node cur = this.head;
        while (cur!=null){
            cur = cur.next ;
            count++;
        }
        return count ;
    }
    //查找 index-1的位置 返回引用
    public Node searchPrev(int index) {
        Node cur = this.head;
        int count = 0 ;
        while (count < index){
            cur = cur.next;
            count++;
        }
        return cur  ;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur!=null){
            if (cur.data==key){
                return true ;
            }
            cur = cur.next;
        }
        return false;
    }
    //找到key 的前驱节点
    public Node searchPrevNode(int key){
        Node cur = this.head;
        while(cur.next!=null){
            if (cur.next.data!=key){
                cur = cur.next;
            }
            return cur;
        }
        return  null ;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head==null){
            return;
        }
        if (this.head.data == key){
            this.head = this.head.next;
            return;
        }
        Node cur = searchPrevNode(key);
        if (cur == null){
            System.out.println("没有你删除的数字");
            return;
        }
        cur.next = cur.next.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head==null){
            return;
        }
        Node prev = this.head;
        Node cur = this.head.next   ;
        while (cur!=null){
            if (cur.data==key){
                prev.next = cur.next;
                cur = cur.next;
            }else {

                prev = cur ;
                cur = cur.next;
            }

        }
        if (this.head.data==key){
            head = head.next;
        }
    }

    /**
     * 逆反 链表
     * cur 代表当前 需要反转的节点
     * prve 代表前驱
     *
     * @return
     */
//    public Node reverseList() {
//        Node cur = this.head;
//        Node curNext = null ;
//        Node prve = null ;
//        Node newHead= null;
//        while (cur!=null){
//            if (curNext == null){
//
//            }
//            curNext = cur.next ;
//            cur.next= prve;
//            prve = cur ;
//            cur = curNext;
//        }
//    }
        public Node middleNode(){
            Node fast = this.head ;
            Node slow = this.head ;

            while (fast != null &&  fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return  slow;
        }
}
