package io.gaojian.state;

public class TestYield {
    public static void main(String[] args) {
        Yield yield = new Yield();
        new Thread(yield,"a").start();
        new Thread(yield,"b").start();
    }
}
class Yield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始");
//        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }
}