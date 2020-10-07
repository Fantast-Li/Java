package com.li;

import java.awt.Shape;
// 可以实现多个接口 接口和接口extends  扩展 扩展的接口需要去重写那些扩展的接口抽象的方法

interface Shape2{
//    void eat (); // 相当于 public abstract
//    int a = 10 ; // 成员变量 相当于 public static final
    void draw();
    //jdk 1.8 新特性
    default  void func(){

    }

}
class Cycle2 implements Shape2{
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Flower implements Shape2 {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

 public class InterfacrTest {
     public static void drawMap(Shape2 shape2){
        shape2.draw();
     }
    public static void main(String[] args) {
         Shape2 shape2 = new Cycle2();
         drawMap(shape2);
         Shape2 shape21 = new Flower();
         drawMap(shape21);

    }
}

