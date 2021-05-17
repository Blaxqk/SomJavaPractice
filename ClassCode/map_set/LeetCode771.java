package map_set;

import java.util.HashSet;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class LeetCode771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c:jewels.toCharArray() ) {
            set.add(c);
        }
        for (char c:stones.toCharArray()) {
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}
