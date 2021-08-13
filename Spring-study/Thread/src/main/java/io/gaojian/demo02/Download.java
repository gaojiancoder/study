package io.gaojian.demo02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Download implements Runnable {
    private String url;
    private String name;

    public Download(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownload download = new WebDownload();
        download.download(url, name);
        System.out.println("下载了文件：" + name);
    }

    public static void main(String[] args) {
        Download download = new Download("https://images3.alphacoders.com/911/911582.jpg", "1.png");
        new Thread(download).start();

    }

    //下载器
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
