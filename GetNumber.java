import java.util.ArrayList;
import java.util.List;

public class GetNumber {
    public static List<Integer> getNumber (long n ) {
        List<Integer> list = new ArrayList<>();
        while (n/10 != 0) {
            long a = n % 10;
            if (a < 0) {
                a = -a ;
            }
            n = n/10 ;
            list.add(0,(int) a);
        }
        if (n<=9) {
            list.add(0,(int)n);
        }
        return list ;
    }

}

