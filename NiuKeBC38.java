package NiuKeABC;
//变种水仙花数 - Lily Number：把任意的数字，从中间拆分成两个数字，比如1461 可以拆分成（1和461）,（14和61）,（146和1),如果所有拆分后的乘积之和等于自身，则是一个Lily Number。
//
//例如：
//
//655 = 6 * 55 + 65 * 5
//
//1461 = 1*461 + 14*61 + 146*1
//
//求出 5位数中的所有 Lily Number。

public class NiuKeBC38 {
    public static void main(String[] args) {
        for (int i = 10000; i < 100000; i++) {
            int c  = 0 ;
            int v  = 10 ;
            for (int j = 1; j < 5 ; j++) {
                int a = i/v ;
                int b = i % v ;
                v*=10 ;
                c+= a*b;
            }
            if (i == c ) {
                System.out.print(i+" ");
            }
        }
        }
}
