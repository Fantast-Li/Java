package NiuKeABC;

import java.util.Scanner;

//
//假设你们社团要竞选社长，有两名候选人分别是A和B，社团每名同学必须并且只能投一票，最终得票多的人为社长.
//输入描述:
//一行，字符序列，包含A或B，输入以字符0结束。
//输出描述:
//一行，一个字符，A或B或E，输出A表示A得票数多，输出B表示B得票数多，输出E表示二人得票数相等。.
public class NiuKeBC40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String s = scanner.nextLine() ;
        char[] chars = s.toCharArray();
        int a = 0 ;
        int b = 0 ;
        for (char c: chars) {
            if (c=='A') {
                a++;
            }
            if ( c =='B'){
                b++;
            }
            if (c=='0'){
                return;
            }
        }
        if (a>b){
            System.out.println("A");
        }
        if (b>a){
            System.out.println("B");
        }
        if (a==b){
            System.out.println("E");
        }
    }
}
