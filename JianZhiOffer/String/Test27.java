package String;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Test27 {
    /**
     * 使用递归，固定第一个字母，然后对剩余的字母进行全排列
     * @param str
     * @return
     */
    public  ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        //1.判空
        if(str==null || str.length()==0){
            return list;
        }
        //
        perm(str.toCharArray(),0,list);
        Collections.sort(list);//为了结果通过
        return list;

    }

    /**
     * 递归
     * @param c
     * @param pos
     * @param list
     */
    public static void perm(char[] c, int pos, ArrayList<String> list){
        if(pos == c.length-1){//递归结束的条件: 表示对最后一个字符进行固定，也就说明，完成了一次全排列
            // 不能存入相同的字符串
            String s = String.valueOf(c);
            if (!list.contains(s)) {
                list.add(s);
                return;
            }
        }

        for (int i = pos; i < c.length ; i++) {
            swap(c, i, pos);
            perm(c, pos + 1, list);
            swap(c, i,pos);
        }
    }
    public  static void swap(char[] c, int i, int j){
        char temp = c[j];
        c[j] = c[i];
        c[i] = temp;
    }

    public static void main(String[] args) {

    }
}
