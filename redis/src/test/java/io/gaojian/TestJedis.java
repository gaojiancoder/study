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
import redis.clients.jedis.Transaction;
import redis.clients.jedis.params.SetParams;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    @Test
    public void test(){
        jedis.set("name","zhang");
        String name = jedis.get("name");
        System.out.println(name);
        //参数的奇数是key偶数是value
        jedis.mset("address","sh","sex","1");
        List<String> list = jedis.mget("address", "sex");
        list.forEach(System.out::println);
        jedis.del("name");
    }

    /**
     * 第一个参数key
     * 第二个参数hash的key
     * 第三个参数hash的value
     */
    @Test
    public void hash(){
        jedis.hset("user","name","gaojian");
        String hget = jedis.hget("user", "name");
        System.out.println(hget);
        Map<String ,String> map =new HashMap<>();
        map.put("sex","1");
        map.put("age","20");
        jedis.hmset("user",map);
        List<String> hmget = jedis.hmget("user", "age", "sex");
        hmget.forEach(System.out::println);

        Map<String, String> user = jedis.hgetAll("user");
        user.entrySet().forEach(e->{
            System.out.println(e.getKey()+"--->"+e.getValue());
        });
        jedis.hdel("user","name");
    }
    @Test
    public void testList(){
        jedis.lpush("studunt","zhang","高");
        jedis.rpush("student","hao","ni");
        List<String> student = jedis.lrange("student", 0, 3);
        student.forEach(System.out::println);
        Long llen = jedis.llen("student");
        System.out.println(llen);
        jedis.lpop("student");//左弹出
        jedis.rpop("student");//右弹出
            }
    @Test
    public void testSet(){
      jedis.sadd("letters","11","22");
        Set<String> set = jedis.smembers("letters");
        set.forEach(System.out::println);
        Long scard = jedis.scard("letters");
        System.out.println(scard);
        jedis.srem("letters","11");
    }
    @Test
    public void sorted(){
        Map<String ,Double> map = new HashMap<>();
        map.put("zhang",7D);
        map.put("li",1D);
        map.put("zh",3D);
        map.put("ang",5D);
        map.put("san",9D);
        jedis.zadd("asd",map);
        Set<String> set = jedis.zrange("asd", 0, 4);
        set.forEach(System.out::println);
        jedis.zrem("asd","san");//删除

    }
    @Test
    public void testDir(){
        jedis.set("card:user01:item01","apple");
        System.out.println(jedis.get("card:user01:item01"));//层级目录
    }
    @Test
    public void testEx(){
        jedis.expire("cord",30);//给已经存在的key设置失效时间
        //查看失效时间
        jedis.ttl("cord");
        //xx,nx用法
        SetParams setParams =new SetParams();
        setParams.nx();//不存在才能成功
        setParams.xx();//存在才可以成功
        setParams.ex(30);
        jedis.set("code","test",setParams);
    }
    @Test
    public void testAllkey(){
        Long size = jedis.dbSize();//当前数据库key的数量
        System.out.println(size);
        Set<String> keys = jedis.keys("*");//查询当前数据库的所有key
        keys.forEach(System.out::println);
    }
    @Test
    public void testMulti(){
        Transaction tx =jedis.multi();//开启事务
        tx.set("tel","10086");
        tx.exec();//提交事务
//        tx.discard();//回滚事务
    }
    //释放资源
    @After
    public void closeConnt() {
        if (null != jedis) {
            jedis.close();
        }
    }

}
