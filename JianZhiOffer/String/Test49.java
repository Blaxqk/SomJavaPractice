package String;

public class Test49 {

    public int StrToInt(String str) {
        if(str == null || str.length()==0){
            return 0;
        }
        char[] ch = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if(i=='+'){

            }
            if(i=='-'){
                stringBuffer.append(i);
            }
            if(i>=0 || i<=9){
                stringBuffer.append(i);
            }
        }

        return Integer.parseInt(stringBuffer.toString());
    }
    public static void main(String[] args) {

    }
}
