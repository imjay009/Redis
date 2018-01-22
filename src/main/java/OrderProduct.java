import redis.clients.jedis.Jedis;

public class OrderProduct {

    void product(String id) {
        Jedis jedis = new Jedis();
        String name = jedis.hget(id, "ordered");
        Integer val = Integer.parseInt(name);
        val++;
        jedis.hset(id,"ordered",val.toString());
    }
}
