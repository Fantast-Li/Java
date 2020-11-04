package NiuKeABC;

import java.util.Scanner;

//题目描述
//实现字母的大小写转换。多组输入输出。
//输入描述:
//多组输入，每一行输入大写字母。
//输出描述:
//针对每组输入输出对应的小写字母
public class NiuKeBC28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (scanner.hasNext()) {
            char c = scanner.next().charAt(0); // 将字符串的第一个改为 char 类型的字符
            System.out.println(Character.toLowerCase(c)); // 将大写改为小写  Character.toLowerCase(字符) 还有String 类型的对象.toLowerCase()           }
        }
        scanner.close(); // 回车关闭hasNext()
    }
}
