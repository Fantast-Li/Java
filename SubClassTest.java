package 继承;

public class SubClassTest {
    public static void main(String[] args) {
        System.out.println("SubClass ------的继承");
        SubClass subClass = new SubClass();
        SubClass subClass2= new SubClass(100);
        System.out.println("SubClass1-------------的继承");
        SubClass2 subClass21 = new SubClass2();
        SubClass2 subClass22 = new SubClass2(100);
    }

}
