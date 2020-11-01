package NiuKeABC;
//给定两个整数a和b (－10,000 < a,b < 10,000)，计算a除以b的整数商和余数。

import java.util.Scanner;

public class NiuKeBC18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        int q = a/c ;
        int w = a%c ;
        System.out.println(q+" "+w);
    }
}
