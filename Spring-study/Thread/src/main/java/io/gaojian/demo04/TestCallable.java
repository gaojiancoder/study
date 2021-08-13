package io.gaojian.demo04;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

//方式三：实现Callable方法
public class TestCallable implements Callable<Boolean> {
    private String url;
    private String name;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() {
        WebDownload webDownload = new WebDownload();
        webDownload.download(url,name);
        System.out.println("下载了文件：" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable download = new TestCallable("https://images3.alphacoders.com/911/911582.jpg", "1.png");
        ExecutorService pool = Executors.newFixedThreadPool(1);
        Future<Boolean> r1 =pool.submit(download);
        boolean rs1 = r1.get();

        pool.shutdown();

    }


    class WebDownload {
        public void download(String url, String name) {
            try {
                FileUtils.copyURLToFile(new URL(url), new File(name));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("io异常");
            }
        }
    }

}
