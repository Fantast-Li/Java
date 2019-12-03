public class TestDemo {
    public static void main(String[]args){
    Cat lisi=new Cat();
    lisi.a++;
    Cat.count++;
    System.out.println(lisi.a);
    System.out.println(Cat.count);
    System.out.println("==========");
    Cat zhangsan=new Cat();
    zhangsan.a++;
    Cat.count++;
    System.out.println(zhangsan.a);
    System.out.println(Cat.count);
    }
}
class Cat{
     public int a;
     public static int count;
}
