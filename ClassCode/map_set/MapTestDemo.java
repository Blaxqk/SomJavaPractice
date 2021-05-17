package map_set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTestDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("test1",1);
        map.put("test2",2);
        map.put("test3",3);
        //map.put("test1",4);//会覆盖上一个test1的值
        //map.put(null,null);//是可以的！

        int val = map.get("test2");
        System.out.println(val);//2

        System.out.println(map);//{test2=2, test3=3, test1=1}

        Set<String> set = map.keySet();
        System.out.println(set);//[test2, test3, test1]

        Collection<Integer> collection = map.values();
        System.out.println(collection);//[2, 3, 1]

        Set<Map.Entry<String, Integer>> s =  map.entrySet();
        for (Map.Entry<String,Integer> m:s ) {
            System.out.println(m.getKey()+"   "+m.getValue());

        }
        System.out.println(s);//[test2=2, test3=3, test1=1]
    }
}
