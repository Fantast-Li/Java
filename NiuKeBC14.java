package NiuKeABC;//package NiuKeABC;

import java.util.Scanner;

//输入一个人的出生日期（包括年月日），将该生日中的年、月、日分别输出。
//        输入描述:
//        输入只有一行，出生日期，包括年月日，年月日之间的数字没有分隔符。
//        输出描述:
//        三行，第一行为出生年份，第二行为出生月份，第三行为出生日期。输出时如果月份或天数为1位数，需要在1位数前面补0。
//public class NiuKeBC14 {
    // 伪代码
    // 得到意义段数字  先得到日期  然后得到月份  最后得到年
    // 分段出年月日 得出结论
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in) ;
//        int x = scanner.nextInt() ;
//        int a = x%100 ;
//        int c = (x/100)%100;
//        int d = x/100/100;
//        String q = String.format("%02d",a);
//        String w = String.format("%02d",c);
//        String e = String.format("%02d",d);
//        System.out.println("year="+e);
//        System.out.println("month="+w);
//        System.out.println("data="+q);
//
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    public class NiuKeBC14 {
        public static void main(String[] args) throws IOException {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            String s=in.readLine();
            String year=s.substring(0,4);
            String month=s.substring(4,6);
            String date=s.substring(6,8);
            System.out.println("year="+year);
            System.out.println("month="+month);
            System.out.println("date="+date);
        }

    }

