import redis.clients.jedis.Jedis;

public class AddToCart {

    void cart (String pid) {
        Jedis jedis = new Jedis();
        String name = jedis.hget(pid, "InCart");
        Integer count = Integer.parseInt(name);
        count++;
        jedis.hset(pid,"InCart",count.toString());
    }
}
