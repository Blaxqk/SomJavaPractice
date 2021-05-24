package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test54 {
    public static void main(String[] args) {

    }
}
class Solution {
    Map<Character,Integer> map = new LinkedHashMap<>();
    //Insert one char from stringstream
    public void Insert(char ch){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);//value记录的是次数
        }else {
            map.put(ch,1);//第一次出现
        }


    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        //遍历，找到出现次数为1的第一个
        for (char c:map.keySet()) {
            if(map.get(c)==1) return c;
        }
        return '#';
    }
}