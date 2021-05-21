package D4_12;

/**
 * 9.
 */
class Babe{
    Babe(){
        System.out.print("Base");
    }
}
public class MyTest2 extends Babe{
    /**
     * 5.选择题
     * @param args
     */
    public static void main1(String[] args) {
        Test1 test = null;
        test.hello();
    }
    /**
     * 9.测验继承
     */
    public static void main(String[] args) {
        new MyTest2();
        new Babe();
    }


}

/**
 * 5.
 */
class Test1{
    public static void hello(){
        System.out.println("hello");
    }
}

