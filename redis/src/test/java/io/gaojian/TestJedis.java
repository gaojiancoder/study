package io.gaojian;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestJedis {
    @Autowired
    public JedisPool jedisPool;
    private Jedis jedis = null;
    //初始化jedis实例对象
    @Before
    public void initConnt() {
        jedis = jedisPool.getResource();
    }
    //释放资源
    @After
    public void closeConnt() {
        if (null != jedis) {
            jedis.close();
        }
    }


}
