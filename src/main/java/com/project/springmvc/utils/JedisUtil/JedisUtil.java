package com.project.springmvc.utils.JedisUtil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Component
public class JedisUtil {

    private static String redisIP;

    @Value("${redis.ip}")
    public void setRedisIP(String redisIP) {
        this.redisIP = redisIP;
    }

    static JedisPool pool;
    static Jedis jedis;

    static public Jedis getResouse() {

        if (pool == null) {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxIdle(10);
            config.setMaxWaitMillis(1000);
            config.setMaxTotal(100);
            pool = new JedisPool(config, redisIP);
        }

        jedis = pool.getResource();
        return jedis;

    }


}
