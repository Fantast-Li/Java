import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        long[] array = { 3, 5, 2, 7 };
        long a = array[0];
        array[0]= array[3];
        array[3] = a ;

        // 打印
        System.out.println(Arrays.toString(array));
    }
}
