package homeWork;

//1、编写程序完成如下功能：输出字符串“www.google.com”的长度，
// 并分别计算并显示出‘o’ 与‘g’的个数，截取其中“google”进行输出显示。

public class String1 {
    public static void main(String[] args) {
        String str = "www.google.com";
        System.out.println("字符串的长度为："+str.length());
        char[] ch = str.toCharArray();
        int count1 = 0 ;
        int count2 = 0 ;
        for (char c: ch) {
            if (c=='o'){
                count1++;
            }else if (c=='g') {
                count2++;
            }
        }
        System.out.println("o的个数为："+count1);
        System.out.println("g的个数为："+count2);

        System.out.println(str.substring(4, 10));

    }
}