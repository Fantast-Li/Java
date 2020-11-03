package NiuKeABC;
//题目描述
//依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩。
//输入描述:
//一行，3科成绩，成绩之间用一个空格隔开。
//输出描述:
//一行，总成绩和平均成绩（小数点后保留两位），用一个空格隔开。
//示例1
//输入
//复制
//79.5 80.0 98.0
//输出
//复制
//257.50 85.83.
import java.util.Scanner ;
public class NiuKeBC24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double a = scanner.nextDouble() ;
        double b = scanner.nextDouble() ;
        double c = scanner.nextDouble() ;
        double q  = a + b + c ;
        double w = q/3 ;
        System.out.println(String.format("%.2f %.2f",q,w));
    }
}
