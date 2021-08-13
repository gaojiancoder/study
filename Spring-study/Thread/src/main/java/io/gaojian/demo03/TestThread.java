package io.gaojian.demo03;

public class TestThread implements Runnable{
    //定义票
    private int ticketNums =10;
    @Override
    public void run() {
        while (true){
            if (ticketNums<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"张票");
        }
    }
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        new Thread(testThread,"小明").start();
        new Thread(testThread,"小高").start();
        new Thread(testThread,"我").start();
    }
}
