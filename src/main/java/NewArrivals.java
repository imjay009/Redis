import redis.clients.jedis.Jedis;

public class NewArrivals {

    void product() {
        Jedis jedis = new Jedis();
        Long count = jedis.dbSize();
        Integer i = 0;
        while( i < 5 ) {
            System.out.println(jedis.hget("ID_" + count.toString(),"productName"));
            i++;
            count--;
        }
        System.out.println(" ");
    }
}