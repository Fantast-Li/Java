package 继承;

public class SuperClass {
    private int a = 2 ;
    public String name = "李四" ;
    SuperClass() {
        System.out.println("SupperClass():父类的无参构造");
    }
    SuperClass( int a ) {
        System.out.println("SuperClass(int a) : 父类的有参构造");
        this.a = a ;
    }
}
