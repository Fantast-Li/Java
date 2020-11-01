package NiuKeABC;
//输入两个整数，范围-231~231-1，交换两个数并输出。
//
//        输入描述:
//        输入只有一行，按照格式输入两个整数，范围，中间用“,”分隔。
//        输出描述:
//        把两个整数按格式输出，中间用“,”分隔。
//        示例1
//        输入
//        复制
//        a=1,b=2
//        输出
//        复制
//        a=2,b=1
//        备注:
//        如果格式控制串中有非格式字符则输入时也要输入该非格式字符。

import java.io.*;

public class NiuKeBC15 {
    public static void main(String[] args) throws IOException{
        BufferedReader bu  = new BufferedReader(new InputStreamReader(System.in));
        String str = bu.readLine();
        String[] s = str.split(",");
        String[] s1 = s[1].split("=");
        String[] s2 = s[2].split("=") ;
        System.out.println(s1[1]+"="+s2[2]+","+s2[1]+"="+s1[2]);
    }
}
