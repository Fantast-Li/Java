package NiuKeABC;

import java.util.Arrays;
import java.util.Scanner;

//期中考试开始了，大家都想取得好成绩，争夺前五名。从键盘输入n个学生成绩（不超过40个），输出每组排在前五高的成绩。
//
//输入描述:
//两行，第一行输入一个整数，表示n个学生（>=5），第二行输入n个学生成绩（整数表示，范围0~100），用空格分隔。
//输出描述:
//一行，输出成绩最高的前五个，用空格分隔。
public class NiuKeBC39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int a = scanner.nextInt();
        int[] b = new int [a] ;
        for (int i = 0; i < a  ; i++) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(b);
        for (int i = a-1; i >= a-5 ; i--) {
            System.out.print(b[i]+" ");
        }
    }
}
