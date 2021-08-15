package io.gaojian.syn;

public class unSafeBuy {
    public static void main(String[] args) {
        BuyTicker buyTicker = new BuyTicker();
        new Thread(buyTicker, "a").start();
        new Thread(buyTicker, "c").start();
        new Thread(buyTicker, "b").start();

    }
}

class BuyTicker implements Runnable {

    private boolean flag = true;
    private int ticket = 10;

    @Override
    public void run() {
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private synchronized void buy() throws InterruptedException {
        if (ticket <= 0) {
            flag = false;
            return;
        }
        Thread.sleep(1);
        System.out.println(Thread.currentThread().getName() + "拿到" + ticket--);
    }

}


