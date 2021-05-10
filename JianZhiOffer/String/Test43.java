package String;

/**
 * 【左旋转字符串】！！！！！！取余 + 字符串的自加 + 取字串
 */
public class Test43 {
    /**
     * 【方法1】
     * @param str
     * @param n
     * @return
     */

    public static String LeftRotateString1(String str,int n) {
        //1.非空校验
        if(str == null || str.length()==0){
            return str;
        }

        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = n; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        for (int i = 0; i < n ; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    /**
     * 【方法2】
     * @param str
     * @param n
     * @return
     */
    private static String LeftRotateString(String str, int n) {
        //1.非空校验
        if(str == null || str.length()==0){
            return str;
        }
        //2.


        return str.substring(n)+str.substring(0,n);
    }



    /**
     * 【方法3】
     */
    private static String LeftRotateString3(String str, int n) {
        int len = str.length();
        //1.非空校验
        if(str == null || len==0){
            return str;
        }
        //2.
        n = n% len;
        str += str;
        return str.substring(n,n+len);
}





    public static void main(String[] args) {
        System.out.println(LeftRotateString3("abcXYZdef", 3));
        String str = "abcXYZdef";
        System.out.println(str.substring(3));//XYZdef
        System.out.println(str.substring(0,3));//abc
    }


}
