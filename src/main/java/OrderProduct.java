import redis.clients.jedis.Jedis;

public class OrderProduct {

    void product(String id) {
        Jedis jedis = new Jedis();
        String name = jedis.hget(id, "ordered");
        Integer count = Integer.parseInt(name);
        count++;
        jedis.hset(id,"ordered",count.toString());
    }
}
