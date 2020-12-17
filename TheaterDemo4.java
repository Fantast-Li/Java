package javaWeb.thread;

public class TheaterDemo4 {
    private static long count = 10_0000_0000l;



    public static void main(String[] args) {
        // 让代码分别针对 a 和  b 二个整数，自增很多次
//        serial(); // 串行执行时间
        concurency();
    }

    private static void concurency() {
        long beg = System.currentTimeMillis();

        Thread t1 = new  Thread(){
        @Override
            public void run(){
            int a = 0 ;
            for (int i = 0;  i<count ; i++) {
                a++;
            }
        }
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run(){
                int b = 0 ;
                for (int i = 0;  i<count ; i++) {
                    b++;
                }
            }
        };

        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("并行时间："+(end-beg)+"ms");
    }

    private static void serial() {
        // 如何衡量一段代码的执行时间？
        // 代码开始执行的时候记录一个时间戳
        // 代码结束的时候记录一个时间戳
        // 二者相减就是代码的执行时间
        long beg = System.currentTimeMillis();//单位 毫秒
        long a = 0 ;
        long b = 0 ;
        for (int i = 0; i < count ; i++) {
            a++;
        }
        for (int i = 0; i < count ; i++) {
            b++;
        }
        long end =  System.currentTimeMillis();
        System.out.println("串行运行时间："+(end-beg)+"ms");
    }
}
