package NiuKeABC;
//题目描述
//将一个四位数，反向输出。
//
//
//输入描述:
//一行，输入一个整数n（1000 <= n <= 9999）。  //  2000 注意 纯真数子运算不行
//输出描述:
//针对每组输入，反向输出对应四位数。
//示例1
//输入
//复制
//1234
//输出
//复制
//4321.
import java.io.*;
public class NiuKeBC19 {
    public static void main(String[] args)throws IOException{


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();

        char[] chararray=str.toCharArray();

        for(int i=chararray.length-1;i>=0;i--){
            System.out.print(chararray[i]);
        }


    }
}