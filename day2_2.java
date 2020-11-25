package 每日一题;
import java.util.*;
public class day2_2 {
    public static class AntiOrder {
        public int count(int[] A, int n) {
            // write code here
            int count  = 0 ;
            for(int i = 0 ;i < n-1 ; i++) {
                int a = getNumber(A , i, i+1); // i+1 是要比较那个数  i 是前i个数
                count += a;
            }
            return count ;
        }
        public  int getNumber (int[] A,int n , int m ) {
            int count = 0 ;
            for (int i = n ; i >= 0 ; i-- ) {
                if ( A[m] < A[i]) {
                    count++;
                }
            }
            return count ;
        }
    }

    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6,7,0};
        AntiOrder antiOrder = new AntiOrder() ;
        System.out.println(antiOrder.count(a, 8));
    }
}
