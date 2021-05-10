package String;
/**
 * "nowcoder. a am I"
 *
 * "I am a nowcoder."
 */
public class Test44 {
    public static String ReverseSentence(String str) {
        //1.非空校验
        if(str.trim().equals("")){
            return str;
        }
        String[] strArr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strArr.length-1; i >= 0; i--) {
            sb.append(strArr[i]);
            if(i>0){
                sb.append(" ");
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(ReverseSentence("nowcoder. a am I"));
    }
}
