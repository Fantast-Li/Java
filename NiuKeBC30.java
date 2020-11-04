package NiuKeABC;

import java.util.Scanner;

//BoBo买了一箱酸奶，里面有n盒未打开的酸奶，KiKi喜欢喝酸奶，第一时间发现了酸奶。KiKi每h分钟能喝光一盒酸奶，并且KiKi在喝光一盒酸奶之前不会喝另一个，那么经过m分钟后还有多少盒未打开的酸奶？
//
//输入描述:
//多组输入，每组输入仅一行，包括n，h和m（均为整数）。输入数据保证m <= n * h。
//输出描述:
//针对每组输入，输出也仅一行，剩下的未打开的酸奶盒数。.
public class NiuKeBC30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        if (m > n * h ) {
            System.out.println("m 值不标准");
        }
        int s = (int) (n - Math.ceil((double)m/(double)h));
        System.out.println(s);
    }
}
