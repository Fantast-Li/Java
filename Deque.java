package impl;

import java.util.NoSuchElementException;

public interface Deque extends Queue {
    //这组方法利用特殊返回值的方法
    // 插入 插入成功返回true  插入失败返回false
    boolean offerFirst(Integer e);
    boolean offerLast (Integer e);
    //看队首元素 并返回对首元素
    Integer peekFirst();
    Integer peekLast();
    //删除对首元素  返回这个元素
    Integer poolFirst();
    Integer poolLast();


    //这组方法是异常的形式来报错
    //新增
    default void addFirst(Integer e){
        if(offerFirst(e)==false){
            throw new IllegalStateException();
        }
    }
    default void addList (Integer e ){
        if (offerLast(e)==false){
            throw new IllegalStateException();
        }
    }
    default Integer getLast(){
        Integer e = peekLast() ;
        if (e==null){
            throw new NoSuchElementException();
        }
        return  e ;
    }
    default Integer getFirst(){
        Integer e = peekFirst() ;
        if (e==null){
            throw new NoSuchElementException();
        }
        return  e ;
    }
    default Integer removeFirst(){
        Integer e = poolFirst();
        if (e == null){
            throw new NoSuchElementException();
        }
        return  e ;
    }
    default Integer removeLast(){
        Integer e = poolLast();
        if (e == null){
            throw new NoSuchElementException();
        }
        return  e ;
    }
}
