package io.gaojian.sleep;

import io.gaojian.demo03.TestThread;

public class TestSleep implements Runnable{
    private int ticketNums =10;
    @Override
    public void run() {
        while (true){
            if (ticketNums<=0){
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"张票");
        }

    }
    public static void main(String[] args) {
        TestSleep testSleep = new TestSleep();
        new Thread(testSleep,"小明").start();
        new Thread(testSleep,"小高").start();
        new Thread(testSleep,"我").start();


    }
}


