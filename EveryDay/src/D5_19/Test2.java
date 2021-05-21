package D5_19;

public class Test2 {
    public static void oddInOddEvenInEven(int[] arr) {
        if(arr==null || arr.length<2){
            return;
        }
        int len = arr.length;
        int i = 0;//偶数下标
        int j =1;//奇数下标


        while(i < len && j < len){
            if(arr[len - 1] % 2 == 0){
                swap(arr,len-1,i);
                i+=2;
            }
            else{
                swap(arr,len - 1,j);
                j+=2;
            }
        }
    }

    private static void swap(int[] arr,int t1, int t2) {
        int t = arr[t1];
        arr[t1] = arr[t2];
        arr[t2] = t;
    }


    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4};
        System.out.println();
        oddInOddEvenInEven(arr);
        System.out.println(arr.toString());



    }
}
