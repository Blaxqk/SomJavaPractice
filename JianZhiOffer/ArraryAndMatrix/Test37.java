package ArraryAndMatrix;

public class Test37 {
    /**
     * 暴力破解
     * @param array
     * @param k
     * @return
     */
    public int GetNumberOfK(int [] array , int k) {
        int c = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]==k){
                c++;
            }
        }
        return c;
    }

    /**
     * 考点说二分：那我就二分
     *
     * 【写两个二分查找：分别查找第一个k,和最后一个k】
     */
    public int GetNumberOfK2(int [] array , int k) {
        if(array==null||array.length==0){return 0;}
        int first = getFirstK(array, k);
        int last = getLastK(array,k);
        if(first != -1 && last != -1){
            return last - first + 1;
        }
        return 0;
    }
    public int getFirstK(int [] array , int k){
        int left = 0;
        int right = array.length-1;

        //利用二分法查找该数字，注意这里需要 left<=right,数组长度为1时的情况也考虑进去
        while (left <= right){
            int mid = (left+right)/2;
            if(array[mid] > k){
                right = mid -1;
            }else if(array[mid] < k){
                left = mid+1;
            }else {//说明找到了k
                if(mid-1 >=0 && array[mid-1]==k){
                    right = mid -1;
                }else {
                    return mid;
                }

            }
        }
        return -1;
    }
    public int getLastK(int [] array , int k){
        int left = 0;
        int right = array.length-1;

        //利用二分法查找该数字，注意这里需要 left<=right,数组长度为1时的情况也考虑进去
        while (left <= right){
            int mid = (left+right)/2;
            if(array[mid] > k){
                right = mid -1;
            }else if(array[mid] < k){
                left = mid+1;
            }else {//说明找到了k
                if(mid+1<array.length&&array[mid+1]==k){
                    left = mid+1;
                }else {
                    return mid;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}

/**
 * 别人的代码
 */
class Solu {
    public int GetNumberOfK(int [] array , int k) {
        int length = array.length;
        if(length == 0){
            return 0;
        }
        int firstK = getFirstK(array, k, 0, length-1);
        int lastK = getLastK(array, k, 0, length-1);
        if(firstK != -1 && lastK != -1){
            return lastK - firstK + 1;
        }
        return 0;
    }
    //递归写二分查找
    private int getFirstK(int [] array , int k, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end) >> 1;
        if(array[mid] > k){
            return getFirstK(array, k, start, mid-1);
        }else if (array[mid] < k){
            return getFirstK(array, k, mid+1, end);
        }else if(mid-1 >=0 && array[mid-1] == k){
            return getFirstK(array, k, start, mid-1);
        }else{
            return mid;
        }
    }
    //循环写二分查找
    private int getLastK(int [] array , int k, int start, int end){
        int length = array.length;
        int mid = (start + end) >> 1;
        while(start <= end){
            if(array[mid] > k){
                end = mid-1;
            }else if(array[mid] < k){
                start = mid+1;
            }else if(mid+1 < length && array[mid+1] == k){
                start = mid+1;
            }else{
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }
}