package NiuKeABC;
// 问题：一年约有3.156×107s，要求输入您的年龄，显示该年龄合多少秒。
//
//
//输入描述:
//一行，包括一个整数age(0<age<=200)。
//输出描述:
//一行，包含一个整数，输出年龄对应的秒数。
//示例1
//输入
//复制
//20
//输出
//复制
//631200000.

import java.util.Scanner ;
public class NiuKeBC22 {
    public static void main(String[] args) {
        long i = 31560000 ;
        Scanner scanner = new Scanner(System.in) ;
        long a = scanner.nextLong() ;
        System.out.println(i*a);
    }
}
