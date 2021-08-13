package io.gaojian.demo02;

//方式二：实现runnable接口，重写run，执行线程需要丢入runnable接口实现类，调用start()
public class TestThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("看我：" + i);
        }
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread();//创建接口的实现类
        Thread thread1 = new Thread(thread);//创建线程对象
        thread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("看你：" + i);
        }
    }
}
