package io.gaojian.state;

public class TestStop implements Runnable {
    //设置标志位
    private boolean flag = true;

    @Override
    public void run() {
        int i = 120;
        while (flag) {
            System.out.println("run Thread ----------------" + (i++));
        }
    }

    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) throws InterruptedException {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();
//        Thread.sleep(100);
        for (int i = 0; i < 10000000; i++) {
//            System.out.println("main" + i);
            if (i == (10000000)) {
                testStop.stop();
                System.out.println("停止");
            }
        }
    }
}
