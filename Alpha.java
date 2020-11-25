package 每日一题;
class Base {
    Base () {
        System.out.println("Base");
    }
    public static void hello () {
        System.out.println("hello");
    }

}

public class Alpha extends Base {
    public static void main1(String[] args) {
        new Alpha();  // 调用子类的无参构造需要先帮父类完成无参构造
        new Base();

    }

    public static boolean isAdmin(String userId) {
        return userId.toLowerCase().equals("admin"); // String 类型比较是需要 equals 来比较    用== 是比较二个人引用是不是指向同一个对象
    }

    public static void main(String[] args) {
        Base base = null;
        A1 a1  = new A3();

        System.out.println(isAdmin("Admin"));
    }

    public static class A1 {

    }
    public static class A2 extends A1 {

    }
    public static class A3 extends  A2 {

    }
}
