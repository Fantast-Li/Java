package 继承;

public class SubClass extends SuperClass {
    private int a ;
    SubClass(){

        System.out.println("SubClass():子类1 的无参构造");
    }
    SubClass( int a ) {
        super(300);
        System.out.println("SubClass(int a) : 子类的有参构造"+a);
        this.a = a ;
    }
}