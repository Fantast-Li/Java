package NiuKeABC;

import java.util.Scanner;

//题目描述
//从键盘任意输入一个字符，编程判断是否是字母（包括大小写）。
//输入描述:
//多组输入，每行输入包括一个字符。
//输出描述:
//针对每行输入，输出该字符是字母（YES）或不是（NO）.
public class NiuKeBC35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        while (scanner.hasNext()) {
            char a  = scanner.next().charAt(0);
            if ((a >= 65 && a <= 90) || (a >=97 && a<=122)) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
