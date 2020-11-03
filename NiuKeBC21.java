package NiuKeABC;
import java.util.Scanner;
//题目描述
//给定一个浮点数，要求得到该浮点数的个位数。
//
//输入描述:
//一行，包括一个浮点数。
//输出描述:
//一行，包含一个整数，为输入浮点数对应的个位数。.
public class NiuKeBC21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Float f = scanner.nextFloat();
        int a = (int)(f %10);
        System.out.println(a);
    }
}
