package map_set;

import java.util.*;

public class Test1 {
    /**
     *【1、list当中存放的数据为10万个，找出第一个重复的数据】
     */
    public static int findFirstRepeatNumber(){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("list:找出第一个重复的数据");
        System.out.println(list);

        HashSet<Integer> set = new HashSet<>();
        for (Integer i:list ) {
            if(!set.contains(i)){
                 set.add(i);
            }
            return i;
        }
        return -1;
    }

    /**
     * 【2、list当中有10万个数据，把重复的数据全部去重】
     */
    public static Set<Integer> deputil(){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(100));
        }
        HashSet<Integer> set = new HashSet<>();

        /*for (Integer i:list ) {
            set.add(i);
        }*/
        set.addAll(list);
        return set;
    }

    /**
     * 【3、将10万个数据，统计重复数字及出现的次数】
     */
    public static void countRepeatNum(){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println("list:统计重复数字及出现的次数");
        System.out.println(list);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer key = list.get(i);
            if(map.get(key) == null){
                map.put(key,1);
            }else {
                Integer count = map.get(key);
                map.put(key,count+1);
            }
        }

        //输出
        System.out.println(map);

    }

    public static void main(String[] args) {
//        System.out.println(findFirstRepeatNumber());
//        System.out.println(deputil());
        countRepeatNum();
    }
}
