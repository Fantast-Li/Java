package javaWeb.thread;
/*
创建线程 ：4种方法
 */

public class ThreadDemo3 {
    static class MyThread extends Thread {
        @Override
        public void run () {
            //线程的入口, 当线程启动之后，就会执行到run这个方法中的逻辑
            //这个方法不需要手动调用 ，由JVN 来自动执行

            while (true) {  // 让线程不停止 方便观察
                System.out.println("我是新线程");
                try {
                    Thread.sleep(1000); // 毫秒   1s = 1000ms   1ms =1000us   1us = 1000ns
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {  // 启动 main线程
        //向上转型
        Thread thread = new MyThread();
        //调用start方法 ，就会在 操作系统 中创建一个线程
        //内核中就有了一个PCB对象， 被加入到双向链表中
        // 当线程创建完毕之后，run方法就会被自动调用到
        // 当run方法执行完毕 ,线程就会被自动销毁
        // main 方法也会创建一个新的线程
        thread.start();
        while (true) {
            System.out.println("我是主线程");
            Thread.sleep(2000);
        }
    }
}
