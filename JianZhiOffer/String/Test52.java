package String;
/**
 * 【hard】
 * https://blog.csdn.net/juaner1993/article/details/81978399?spm=1001.2014.3001.5501
 */

public class Test52 {
    public boolean match (String str, String pattern) {
        // write code here
        if (str == null || pattern == null) {
            return false;
        }
        int strIndex = 0;
        int patternIndex = 0;
        char[] c1 = str.toCharArray();
        char[] c2 = pattern.toCharArray();
        return matchCore(c1, strIndex, c2, patternIndex);

    }

    /**
     * 递归
     */
    private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        //有效性检验：str到尾，pattern到尾，匹配成功
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        //pattern先到尾，匹配失败
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }

        //模式的第二个为‘*’
        if((patternIndex + 1 < pattern.length ) && (pattern[patternIndex+1]=='*')){
            //字符串的第一个字符和模式的第一个字符相匹配
            if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex]== '.' && strIndex != str.length)){
                return matchCore(str,strIndex,pattern,patternIndex+2)|| matchCore(str, strIndex + 1, pattern , patternIndex);
            }else {
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }

        //模式的第二个不为‘*’,且字符串第1个跟模式第1个匹配，则都后移1位，否则直接返回false
        if((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex]== '.' && strIndex != str.length)){
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        }
        return false;

    }

    public static void main(String[] args) {

    }
}
