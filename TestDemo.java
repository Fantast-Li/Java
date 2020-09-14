package com.li;

class Animal {
    public String  name ;
    public Animal (String name) { //有参构造方法
        this.name = name ;
    }
    public void eat() {
        System.out.println(this.name+"正在吃");
    }
}
class Cat extends Animal {
    public Cat (String name ){
        super(name);   //super 向上转型
    }
    public void grab (){  //grab 抓
        System.out.println(this.name+"抓抓板");
    }
}
class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }
    public void fly () {
        System.out.println(super.name+"会飞");
    }
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public void call () {
        System.out.println(this.name+"汪汪！");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("咪咪");
        cat.eat();
        cat.grab();
        Bird bird = new Bird("嘎嘎");
        bird.fly();
        bird.eat();
        bird.name = "haha" ;
        bird.fly();
        Dog dog = new Dog("旺财");
        dog.call();
        dog.eat();


    }
}
