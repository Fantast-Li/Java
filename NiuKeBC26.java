package NiuKeABC;
//题目描述
//根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
//输入描述:
//一行，三角形3条边（能构成三角形），中间用一个空格隔开。
//输出描述:
//一行，三角形周长和面积（保留两位小数），中间用一个空格隔开，输出具体格式详见输出样例
import java.util.Scanner ;
public class NiuKeBC26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() ;
        int b = scanner.nextInt() ;
        int c = scanner.nextInt() ;
        double circumference = a+b+c ;
        // 三角形中已知三边求面积 用海伦法求其面积 设P=(a+b+c)/2 则：面积S=√p(p-a)(p-b)(p-c)
        double p = circumference / 2 ;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("circumference="+String.format("%.2f",circumference)+" "+"area="+String.format("%.2f",area));
    }
}
