import redis.clients.jedis.Jedis;

import java.util.Map;

public class TopSelling {
    void product() {
        Jedis jedis = new Jedis();
        Integer i=1;
        Long count = jedis.dbSize();
        while(count > 0){
            Map<String,String> map = jedis.hgetAll("ID_" + i.toString());
            String ordered = map.get("ordered");
            Integer score = Integer.parseInt(ordered);
            jedis.zadd("ranking", score, "ID_" + i.toString());
            i++;
            count--;
        }
        for(i = 0; i < 10; i++){
            String player = jedis.zrevrange("ranking", i, i+1).iterator().next();
            System.out.println(jedis.hget(player,"productName"));
        }
        System.out.println(" ");
        jedis.del("ranking");
    }
}