package NiuKeABC;
//KiKi非常喜欢网购，在一家店铺他看中了一件衣服，他了解到，如果今天是“双11”（11月11日）则这件衣服打7折，“双12” （12月12日）则这件衣服打8折，如果有优惠券可以额外减50元（优惠券只能在双11或双12使用），求KiKi最终所花的钱数。
//输入描述:
//一行，四个数字，第一个数表示小明看中的衣服价格，第二和第三个整数分别表示当天的月份、当天的日期、第四个整数表示是否有优惠券（有优惠券用1表示，无优惠券用0表示）。
//输出描述:
//一行，小明实际花的钱数（保留两位小数）。（提示：不要指望商家倒找你钱）

import java.util.Scanner;

public class NiuKeBC37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double a = scanner.nextFloat();
        int y = scanner.nextInt() ;
        int d = scanner.nextInt();
        int c = scanner.nextInt() ;
        if (y == 11 && d == 11)  {
           if (c == 1) {
               a = a*0.7-50;
           }
           if (c == 0 ) {
               a = a*0.7 ;
           }
           if (a < 0) {
               a = 0 ;
           }
        }
        if (y == 12 && d == 12 ) {
            if (c == 1) {
                a = a*0.8-50;
            }
            if (c == 0 ) {
                a = a*0.8 ;
            }
            if (a < 0 ) {
                a = 0 ;
            }
        }
        System.out.print(String.format("%.2f",a));
    }
}
