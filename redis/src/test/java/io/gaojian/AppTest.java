package io.gaojian;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 连接jedis
 */
public class AppTest {
    @Test
    public void initConnt() {
        //创建jedis对象，连接jedis服务器
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        //设置认证密码 如果设置了就写没设置注释掉就可以
//        jedis.auth("root");
//        jedis.select(1);
//        使用ping命令测试是否成功
        String result = jedis.ping();
        System.out.println(result);
        jedis.set("name", "zhangsan ");
        String name = jedis.get("name");
        System.out.println(name);
        if (jedis != null) {
            jedis.close();
        }
    }

    @Test
    public void initconnt2(){
        //初始化jedis连接处对象
        JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), "127.0.0.1", 6379);
        //从连接池获取jedis对象
        Jedis jedis = jedisPool.getResource();
        String ping = jedis.ping();
        System.out.println(ping);
        jedis.set("age", "12");
        String s = jedis.get("age");
        System.out.println(s);
        if (jedis!=null){
            jedis.close();
        }

    }
}