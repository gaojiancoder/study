package io.gaojian.demo03;

public class Race implements Runnable{
    //胜利者
    private String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            if (Thread.currentThread().getName().equals("2")&&i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean flag = gameOver(i);
            if (flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");

        }
    }

    private boolean gameOver(int steps){
        if (winner!=null){
            return true;
        }{
            if (steps >=100){
                winner = Thread.currentThread().getName();
                System.out.println(winner+"赢了");
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"1").start();
        new Thread(race,"2").start();
    }

}
