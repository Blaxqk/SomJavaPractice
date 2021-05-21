package D5_07;

public class Test1 {
    private static int a = 100;
    public static void main(String[] args) {
        Test1 test1 = new Test1();
//        test1.a;
    }
    public static void main1(String[] args) {
        Integer t1 = 59;
        int t2 = 59;
        Integer t3 = Integer.valueOf(59);
        Integer t4 = new Integer(59);
        System.out.println(t1==t2);//true
        System.out.println(t1==t3);//true
        System.out.println(t1==t4);//f
        System.out.println(t2==t4);//true
        System.out.println(t3==t4);//f
    }
}
