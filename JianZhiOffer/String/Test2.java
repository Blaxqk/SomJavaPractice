package String;

public class Test2 {
    /**
     * 太傻了
     * @param s
     * @return
     */
    public static String replaceSpace (String s) {
        // write code here
        char[] chars = s.toCharArray();
        String[] strArr = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {

            strArr[i] = chars[i]+"";
            if(strArr[i].equals(" ")){
                strArr[i] = "%20";
            }
        }
        String res = "";
        for (String i:strArr ) {
            res+=i;
        }
        return res;
    }

    /**
     * replacAll()方法
     * @param s
     * @return
     */
    public String replaceSpace2 (String s) {
        // write code here
       return   s.replaceAll(" ","%20");

    }

    /**
     *
     * @param s
     * @return
     */
    public String replaceSpace3 (String s) {
        // write code here
        StringBuffer sb= new StringBuffer();
        for (char c:s.toCharArray() ) {
            sb.append(c==' '?"%20":c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(replaceSpace("We Are Happy"));
    }
}
