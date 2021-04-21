package D4_20;

public class Test1 {
    public static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
       //((Test1)null).testMethod();
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));

    }
}
