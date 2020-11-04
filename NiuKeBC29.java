package NiuKeABC;
//不使用累计乘法的基础上，通过移位运算（<<）实现2的n次方的计算。
//
//输入描述:
//多组输入，每一行输入整数n（0 <= n < 31）。
//输出描述:
//针对每组输入输出对应的2的n次方的结果

import java.util.Scanner;

public class NiuKeBC29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            System.out.println(1<<a);
        }
        scanner.close();
    }
}
