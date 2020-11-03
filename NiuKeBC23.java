package NiuKeABC;
//题目描述
//给定秒数seconds (0< seconds < 100,000,000)，把秒转化成小时、分钟和秒。
//
//输入描述:
//一行，包括一个整数，即给定的秒数。
//输出描述:
//一行，包含三个整数，依次为输入整数对应的小时数、分钟数和秒数（可能为零），中间用一个空格隔开。.

import java.util.Scanner;

public class NiuKeBC23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int q = a/3600 ; // 小时数
        int w = (a - q*3600)/60 ; // 分钟数
        int e = a-q*3600-w*60 ;
        System.out.println(q+" "+w+" "+e);

    }
}
