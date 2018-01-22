import redis.clients.jedis.Jedis;

import java.util.Scanner;

public class AddProduct {

    Scanner scanner = new Scanner(System.in);

    Jedis jedis = new Jedis();

    void product() {

        menu.id++;

        String pname;
        String pid = "ID_" + menu.id.toString();

        System.out.print("Enter name of the product: ");
        pname = scanner.next();

        jedis.hset(pid,"productName",pname);
        jedis.hset(pid,"viewed","0");
        jedis.hset(pid,"ordered","0");
        jedis.hset(pid,"InCart","0");
    }
}