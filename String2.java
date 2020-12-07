package homeWork;
//2、编写程序，尝试用“==”与equals()方法比较“Hello java”与“Hello java”是否相等。
public class String2 {
    public static void main(String[] args) {
//        String string1 = "Hello java";
////        String string2 = "Hello java";
////        System.out.println(string1==string2);
////        System.out.println(string1.equals(string2));
        String string1 = new String("Hello java");
        String string2 = new String("Hello java");
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
}
}
