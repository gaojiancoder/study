package io.gaojian.state;

public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("vip-------"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin join = new TestJoin();
        Thread thread = new Thread(join);
        thread.start();


        for (int i = 0; i < 500; i++) {
            if (i==200){
                thread.join();
            }
            System.out.println("main--------"+i);
        }
    }
}
