//import java.util.Scanner;
//
//public class Test {
//
//    public static long pow (int n , int p ) { // 幂函数
//        long s = 1 ;
//        for (int i = 0; i < p ; i++) {
//            s = s*n ;
//        }
//        return s ;
//    }
//    public static void main2(String []args) {
//        Scanner scanner = new Scanner(System.in) ;
//
//        long n = 10*pow(16,5)+11*pow(16,4)+12*pow(16,3)+13*pow(16,2)+14*pow(16,1)+15;
//        System.out.printf("%15d\n",n);
//    }
//    private  static int digit16To10(char c){
//        if (c >='0' && c<='9'){
//            return c-'0';
//        }else {
//            return c-'A'+10 ;
//        }
//    }
//    private static long  func (String s){
//        // 遍历字符串中的每个字符串
//        char[] chars = s.toCharArray();
//        long n = 0 ;
//        for (int i = 0; i < chars.length ; i++) {
//            n = n + digit16To10(chars[i])*16 ;
//        }
//        return n/16 ;
//
//    }
//    public  void func1 (){
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt() ;
//        int b = scanner.nextInt() ;
//        int c = scanner.nextInt() ;
//        System.out.println("score1 = "+ a +"score2="+b+"score"+c );
//    }
////
//    public static void main3(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String [] g = s.split(";");
//        int sn = Integer.parseInt(g[0]); //学号
//        String[] g2 = g[1].split(",");
//        double c = Double.parseDouble(g2[0]);//
//        double sx= Double.parseDouble(g2[1]);
//        double y = Double.parseDouble(g2[2]);
//        System.out.printf("The each subject score of  No. %d is %.2f, %.2f, %.2f.\n",sn,c,sx,y);
//    }

//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in) ;
////        String c = sc.nextLine() ;
////        String s = "    %s\n" +
////                "   %s %s\n" +
////                "  %s %s %s\n" +
////                " %s %s %s %s\n" +
////                "%s %s %s %s %s\n";
////        System.out.printf(s,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c);
//        Scanner sc = new Scanner(System.in) ;
//        String c = sc.nextLine() ;
//        for (int i = 4; i >=0 ; i--) {
//
//        }
//
//
//        }
//    }
//
//}
