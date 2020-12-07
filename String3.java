package homeWork;
//分别使用String和StringBuffer类实现字符串的链接，分析比较它们的特点。

public class String3 {
    public static void main(String[] args) {
        String s =  "hello";
        System.out.println("s的没加字符前hashcode："+s.hashCode());
        s = s +"word";
        System.out.println("s的没加字符后hashcode："+s.hashCode());
        StringBuffer d = new StringBuffer("hello");
        System.out.println("d的没加字符前hashcode："+d.hashCode());
        d.append("word") ;
        System.out.println("d的没加字符后hashcode："+d.hashCode());
    }
}
