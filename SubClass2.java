package 继承;

public class SubClass2 extends SuperClass{
    private int a ;
    SubClass2(){
        super(300);
        System.out.println("SubClass2():子类2 的无参构造"+ "  "+a);
    }
    SubClass2( int a ) {
        super(500);
        System.out.println("SubClass2(int a) : 子类2的有参构造"+" "+a);
        this.a = a ;
    }
}
