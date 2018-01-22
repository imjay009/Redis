import redis.clients.jedis.Jedis;

public class ViewProduct {

    void product(String pid) {

        Jedis jedis = new Jedis();
        String name = jedis.hget(pid, "viewed");
        Integer count = Integer.parseInt(name);
        count++;
        jedis.hset(pid,"viewed",count.toString());
    }
}