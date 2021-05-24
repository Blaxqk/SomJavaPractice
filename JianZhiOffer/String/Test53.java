package String;


public class Test53 {
    /**
     * 正则表达式
     * @param str
     * @return
     */
    public boolean isNumeric1 (String str) {
        // write code here
        //* 零次或多次匹配前面的字符或子表达式。
        //+ 一次或多次匹配前面的字符或子表达式。
        //? 零次或一次匹配前面的字符或子表达式。
        return str.matches("[+-]?[0-9]*\\.?[0-9]+([eE][+-]?[0-9]+)?");
    }

    /*
     *  提交一次改一次。。。。。。。
     */
    public static boolean isNumeric (String str) {
        // write code here
        if(str==null || str.length()==0){
            return false;
        }
        char[] ch = str.toCharArray();
        //标记符号、小数点、e是否出现过
        boolean sign = false;
        boolean decimal = false;
        boolean hasE = false;
        for (int i=0;i<ch.length;i++) {
            if (ch[i] == 'e' || ch[i] == 'E') {
                if (i == ch.length - 1) return false;
                if (hasE) return false;
                hasE = true;
            } else if (ch[i] == '+' || ch[i] == '-') {
                if( i==ch.length-1) return false;
                //符号后边可以直接为.，  也可以是数字  但不能是eE
                if(ch[i+1]!='.'&&(ch[i+1] < '0' || ch[i+1] > '9') ) return false;
                //+-第二次出现需要在eE后
                if (sign && ch[i - 1] != 'e' && ch[i - 1] != 'E') return false;
                //+-第一次出现要在i==0
                if (!sign && i > 0 && ch[i - 1] != 'e' && ch[i - 1] != 'E') return false;
                sign = true;
            } else if (ch[i] == '.') {
                //单独的.不可以
                if(i == ch.length-1){
                    return false;
                }
                //eE后边不能有.
                if(hasE||decimal) return false;
                decimal = true;
            } else if (ch[i] < '0' || ch[i] > '9') {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isNumeric("."));
    }

}
