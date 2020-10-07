package com.li;

import java.awt.*;

class Animal{
    protected String name ;
    public Animal(String name){
        this.name = name;
    }
}
interface IFly{
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
class Cat2 extends Animal implements IRunning {
    public Cat2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name+ "用四条腿跑");
    }
}
class Fish extends Animal implements ISwimming{
    public Fish (String name ){
        super(name) ;
    }
    @Override
    public void swim(){
        System.out.println(name+ "快乐的游泳");
    }
}
class duck extends Animal implements IFly ,ISwimming,IRunning{
    @Override
    public void fly() {
        System.out.println(name + "正在飞");
    }

    @Override
    public void run() {
        System.out.println(name + "正在跑");
    }

    @Override
    public void swim() {
        System.out.println(name + "正在游泳");
    }

    public duck (String name){
        super(name);
    }
}
public class TestDemo {
    public static void walk(IRunning iRunning) {
        iRunning.run();
    }
    public static void main(String[] args) {

        IRunning iRunning = new Cat2("咪咪");
        IRunning iRunning2 = new duck("鸭子");
        walk(iRunning);
        walk(iRunning2);
}
}