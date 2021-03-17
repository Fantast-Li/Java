import java.util.Arrays;

public class ClassCode {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,18,5};
        System.out.print(myString(a));
        System.out.println(max(a));
        System.out.println(binarySearch(a,5));
        int b[] = copyOf(a);
        String str =Arrays.toString(b);
        System.out.println(str);
        System.out.println(func2(a));
        System.out.print(Arrays.toString(func3(a)));
    }

    /**
     * 逆序排序数组
     * @param array
     * @return
     */
    public static void func4( int[] array){
        int left = 0;
        int right = array.length-1 ;
        while (left<right){
            int temp = array[right];
            array [right] = array[left];
            array [left] = temp ;
            left++;
            right-- ;
        }
    }

    /**
     * 给定一个整型数组, 实现冒泡排序(升序排序)
     * @return
     */
    public static int[] func3(int[] array){
        boolean flg = false ;
        for (int i = 0; i < array.length-1 ; i++) {
            flg = false ;
            for (int j = 0; j <array.length-1-i ; j++) {
                if (array[j]<array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flg = true;

                }
            }
            if (flg==false){
                break;
            }
        }
        return  array;
    }
    /**
     *给定一个整型数组, 判定数组是否有序（递增）
     * @param array
     * @return
     */
    public static boolean func2(int array[]){
        if (array==null || array.length==0){
            return false ;
        }
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>array[i+1]){
                return false ;
            }
        }
        return true;
    }
    /**
     * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
     * @param array
     * @return
     */
    public  static  int[] copyOf (int array[]) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            a[i] = array [i] ;
        }
        return a ;
    }

    /**
     * 给定一个有序整型数组, 实现二分查找
     * @param array
     * @param key
     * @return
     */
    public  static  int binarySearch (int[] array ,int key) {
        int mid = array.length/2 ;
        int left = 0 ;
        int right = array.length-1;
        while(left<=right){
            if (array[mid]<key){
                left = mid+1 ;
                mid = (right + left)/2;
            }else if(array[mid]>key) {
                right = mid-1 ;
                mid = (right + left)/2 ;
            }else{
                return mid ;
            }
        }
        return mid ;
    }

    /**
     * 给定两个整型数组, 交换两个数组的内容.
     * @param a
     * @param b
     */


    public static void func6 (int[] a , int b[] ) {
        for (int i = 0; i <a.length ; i++) {
            int temp = a[i]  ;
            a[i] = b[i] ;
            b[i] =temp;

        }

    }
    public static  double func (int[] array) {
        int  ret = 0 ;
        for (int i = 0; i <array.length ; i++) {
            ret += array[i];
        }
        return ret/array.length*1.0;
    }
    public static int max (int[] array) {
        if (array==null ||array.length==0){
            return -1;
        }
        int max = array[0] ;
          for (int i = 0; i < array.length ; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max ;
    }
    public static String myString(int[] a) {
        if (a == null) {
            return null;
        }
        if (a.length == 0) {
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                str += a[i] + ",";
            } else {
                str += a[i] + "]";
            }
        }
        return str;
    }
}