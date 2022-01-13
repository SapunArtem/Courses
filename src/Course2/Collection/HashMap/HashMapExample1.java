package Course2.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map <Integer,String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(3568,"Ivan Ivanov");
        map1.put(6578,"Mariya Sidorova");
        map1.put(15879,"Nikolay Petrov");
        map1.putIfAbsent(1000," Oleg Petrov");
        System.out.println(map1);

    }
}
