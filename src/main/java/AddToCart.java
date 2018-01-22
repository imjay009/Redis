import redis.clients.jedis.Jedis;

public class AddToCart {

    void cart (String pid) {
        Jedis jedis = new Jedis();
        String name = jedis.hget(pid, "InCart");
        Integer val = Integer.parseInt(name);
        val++;
        jedis.hset(pid,"InCart",val.toString());
    }
}
