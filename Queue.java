package impl;

import java.util.NoSuchElementException;

//  仿造 真正的（java.util.impl.Queue) 的 Queue接口
// 元素类型, 固定成Integer 不用泛型
public interface Queue {
    //通过特殊的返回值 ,通知错误

    // 插入
    // true 成功 false 失败(例如容量满了)
    boolean  offer (Integer e) ;
    // 看对首元素， 但不删除
    //返回null ， 代表,队列是空的
    Integer peek ();

    //  返回并删除队首元素
    // 永远返回true
    Integer poll () ;

    // 这组方法通过抛出异常, 通知错误


    // 插入
    // 永远返回true
     default  boolean add (Integer e) {
        if(offer(e)==false){
            throw new IllegalStateException();
        }
         return true;
     }

     // 看对首元素， 但不删除
    default Integer element () {
        Integer e = peek() ;
        if(e==null){
            throw new NoSuchElementException();
        }
        return e ;
    }

    //返回并删除对手 元素
    default Integer remove() {
         Integer e = poll() ;
         if(e==null){
             throw new NoSuchElementException();
         }
         return e;
     }



}
