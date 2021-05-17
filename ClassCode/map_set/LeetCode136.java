package map_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
 * 找出那个只出现了一次的元素。
 * https://leetcode-cn.com/problems/single-number/
 */
public class LeetCode136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i:nums) {
            if(set.contains(i)){
                set.remove(i);
            }else {
                set.add(i);
            }

        }
        for (Integer i:nums){
            if(set.contains(i)){
                return i;
            }
        }

        return -1;
    }
}
