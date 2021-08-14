package io.gaojian.sleep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep2 implements Runnable {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());//获取系统当前时间
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date = new Date(System.currentTimeMillis());//更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void run() {
    }
}

