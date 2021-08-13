package io.gaojian.demo01;
//创建线程方式yi：继承Thread类，重写run()方法，调用start开启线程
public class TestThread01 extends Thread{
    @Override
    public void run() {
        super.run();
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---"+i);
        }
    }
    public static void main(String[] args) {
        //main线程，主线程
        //创建一个线程对象
        TestThread01 thread01 = new TestThread01();
        //调用start（）方法开启线程
        thread01.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习---"+i);
        }
    }
}
